package nagoya.code4.examples;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.ResasHttpAccess;
import nagoya.code4.resas.CitiesResult;
import nagoya.code4.resas.CityResult;
import nagoya.code4.resas.PopulationCompositionPerYearResult;
import nagoya.code4.resas.ResasUtil;

/**
 * Given a prefecture code, e.g., 1 (北海道), the class main method
 * can collect and combine city names across the prefecture and add
 * each population (in the year of 2015), and output the result
 * in JSON file. As this is just an example class implementation, it only
 * collects data from 20 cities.
 *
 * @author Junji Shimagaki
 *
 */
public class GetCitiesAndPopulations {
    public static void main(String[] args) throws ParseException, IOException {
        ObjectMapper om = new ObjectMapper();
        List<String> paramNames = new ArrayList<String>();
        List<String> paramValues = new ArrayList<String>();
        List<CityResultWithPopulation> out = new ArrayList<CityResultWithPopulation>();

        // Step 1: Get cities of Hokkaido
        paramNames.add("prefCode");
        String prefCode = Integer.toString(1); // Hokkaido
        paramValues.add(prefCode);
        StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);
        String result = ResasHttpAccess.sendString("api/v1/cities", params.toString());
        CitiesResult resultData = om.readValue(result, CitiesResult.class);

        // Step 2: Loop over cities in Hokkaido to get population data
        paramNames.add("cityCode");
        paramValues.add("-"); // Dummy
        List<CityResult> X = resultData.getResult();
        for(CityResult city: X.subList(80, 100)) {
            // HTTP GET for population info
            paramValues.remove(1); // Removed the previous value
            paramValues.add(city.getCityCode());
            params = ResasUtil.addParameters(paramNames, paramValues);
            System.out.println(params.toString());
            String popResult = ResasHttpAccess.sendString("api/v1/population/composition/perYear", params.toString());
            PopulationCompositionPerYearResult popResultData = om.readValue(popResult, PopulationCompositionPerYearResult.class);

            // Writing population into `extendedCity` object
            CityResultWithPopulation extendedCity = new CityResultWithPopulation();
            extendedCity.setCityCode(city.getCityCode());
            extendedCity.setCityName(city.getCityName());
            extendedCity.setBigCityFlag(city.getBigCityFlag());
            extendedCity.setPrefCode(city.getPrefCode());
            extendedCity.setPopulation(popResultData);
            out.add(extendedCity);
        }
        om.writeValue(new File("tmp7.json"), out);
    }

}
