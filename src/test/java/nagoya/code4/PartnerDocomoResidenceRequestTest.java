package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.partner.PartnerDocomoResidence;
import nagoya.code4.resas.partner.PartnerDocomoResidencePref;
import nagoya.code4.resas.partner.PartnerDocomoResidencePrefCity;
import nagoya.code4.resas.partner.PartnerDocomoResidencePrefCityGender;
import nagoya.code4.resas.partner.PartnerDocomoResidencePrefCityGenderAgeRange;
import nagoya.code4.resas.partner.PartnerDocomoResidenceRequest;
import nagoya.code4.resas.partner.PartnerDocomoResidenceResult;

public class PartnerDocomoResidenceRequestTest {

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
		paramValues.add("-");
		paramValues.add("13");
		paramValues.add("13101");

		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + PartnerDocomoResidenceRequest.url, params.toString());

		System.out.println(result);
		PartnerDocomoResidenceResult resultData = om.readValue(result, PartnerDocomoResidenceResult.class);

		PartnerDocomoResidence a = resultData.getResult();

		for (PartnerDocomoResidencePref data : a.getPrefs()) {

			System.out.println("prefCode : " + data.getPrefCode());

			System.out.println("prefName : " + data.getPrefName());

			System.out.println("total  : " + data.getTotal());

		
			for(PartnerDocomoResidencePrefCity city : data.getCities()){
				System.out.println("citycode : " + city.getCityCode());
				System.out.println("cityName : " + city.getCityName());

				System.out.println("total  : " + city.getTotal());

				
				for(PartnerDocomoResidencePrefCityGender gender : city.getGenders()){
					
					
					System.out.println("genders :" + gender.getGender());
					
					System.out.println("total : " + gender.getTotal());
					
					for(PartnerDocomoResidencePrefCityGenderAgeRange range : gender.getAgeRanges()){
						System.out.println("range : " + range.getAgeRange());
						System.out.println("value : " + range.getValue());
										
						
						
					}
				}
			}
			
		}

	}

}
