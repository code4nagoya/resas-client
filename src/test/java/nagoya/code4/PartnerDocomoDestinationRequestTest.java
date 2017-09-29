package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.partner.PartnerDocomoDesitinationPref;
import nagoya.code4.resas.partner.PartnerDocomoDestination;
import nagoya.code4.resas.partner.PartnerDocomoDestinationPrefCity;
import nagoya.code4.resas.partner.PartnerDocomoDestinationPrefCityGender;
import nagoya.code4.resas.partner.PartnerDocomoDestinationPrefCityGenderAgeRange;
import nagoya.code4.resas.partner.PartnerDocomoDestinationRequest;
import nagoya.code4.resas.partner.PartnerDocomoDestinationResult;

public class PartnerDocomoDestinationRequestTest {

	@Test
	public void test() throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper om = new ObjectMapper();

		List<String> paramNames = new ArrayList<String>();
		paramNames.add("year");
		paramNames.add("month");
		paramNames.add("periodOfDay");
		paramNames.add("periodOfTime");
		paramNames.add("gender");
		paramNames.add("ageRange");
		paramNames.add("prefCodeDestination");
		paramNames.add("cityCodeDestination");
		paramNames.add("prefCodeResidence");
		paramNames.add("cityCodeResidence");
		

		List<String> paramValues = new ArrayList<String>();
		paramValues.add("2016");
		paramValues.add("01");
		paramValues.add("1");
		paramValues.add("4");
		paramValues.add("1");
		paramValues.add("15");
		paramValues.add("13");
		paramValues.add("13101");
		paramValues.add("13");
		paramValues.add("-");

		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + PartnerDocomoDestinationRequest.url, params.toString());

		System.out.println(result);
		PartnerDocomoDestinationResult resultData = om.readValue(result, PartnerDocomoDestinationResult.class);

		PartnerDocomoDestination a = resultData.getResult();

		for (PartnerDocomoDesitinationPref data : a.getPrefs()) {

			System.out.println("prefCode : " + data.getPrefCode());

			System.out.println("prefName : " + data.getPrefName());

			System.out.println("total  : " + data.getTotal());

		
			for(PartnerDocomoDestinationPrefCity city : data.getCities()){
				System.out.println("citycode : " + city.getCityCode());
				System.out.println("cityName : " + city.getCityName());

				System.out.println("total  : " + city.getTotal());

				
				for(PartnerDocomoDestinationPrefCityGender gender : city.getGenders()){
					
					
					System.out.println("genders :" + gender.getGender());
					
					System.out.println("total : " + gender.getTotal());
					
					for(PartnerDocomoDestinationPrefCityGenderAgeRange range : gender.getAgeRanges()){
						System.out.println("range : " + range.getAgeRange());
						System.out.println("value : " + range.getValue());
										
						
						
					}
				}
			}
			
		}

	}

}
