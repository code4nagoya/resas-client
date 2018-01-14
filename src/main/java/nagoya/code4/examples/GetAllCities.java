package nagoya.code4.examples;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.ParseException;

import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.ResasHttpAccess;
import nagoya.code4.resas.CitiesResult;
import nagoya.code4.resas.CityResult;
import nagoya.code4.resas.PrefectureResult;
import nagoya.code4.resas.PrefecturesResult;
import nagoya.code4.resas.ResasPrefectureHttpAccess;
import nagoya.code4.resas.ResasUtil;

/**
 * Given all prefecture codes 1 (北海道) to 47 (沖縄県), the class main method
 * can collect and combine city names across the country, and output the result
 * in JSON file. As this is just an example class implementation, it only
 * collects data from 2 prefectures; 1(北海道) and 2(青森県).
 *
 * @author Junji Shimagaki
 *
 */
public class GetAllCities {
    public static void main(String[] args) throws ParseException, IOException {
        ObjectMapper om = new ObjectMapper();
        List<CityResult> allData = new ArrayList<CityResult>();
        Map<String, List<CityResult>> allDataD = new HashMap<String, List<CityResult>>();
        List<String> paramNames = new ArrayList<String>();
        paramNames.add("prefCode");
        String prefResult = ResasPrefectureHttpAccess.sendString("");
        List<PrefectureResult> prefResultData = om.readValue(prefResult, PrefecturesResult.class).getResult();
        for (int i=1; i < 3; i++) {
            List<String> paramValues = new ArrayList<String>();
            String prefCode = Integer.toString(i);
            String prefName = prefResultData.get(i - 1).getPrefName();
            paramValues.add(prefCode);
            StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);
            String result = ResasHttpAccess.sendString("api/v1/cities", params.toString());
            CitiesResult resultData = om.readValue(result, CitiesResult.class);
            allData.addAll(resultData.getResult());
            allDataD.put(prefName, resultData.getResult());
        }
        om.writeValue(new File("tmp.json"), allData);
        om.writeValue(new File("tmp2.json"), allDataD);
    }

}
