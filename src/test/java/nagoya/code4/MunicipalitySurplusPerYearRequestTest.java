package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.municipality.MunicipalitySurplusPerYear;
import nagoya.code4.resas.municipality.MunicipalitySurplusPerYearRequest;
import nagoya.code4.resas.municipality.MunicipalitySurplusPerYearResult;
import nagoya.code4.resas.municipality.MunicipalitySurplusPerYearResultData;

public class MunicipalitySurplusPerYearRequestTest {

	@Test
	public void test() throws ParseException, IOException {

		ObjectMapper om = new ObjectMapper();

		List<String> paramNames = new ArrayList<String>();
		paramNames.add("cityCode");
		paramNames.add("prefCode");
		paramNames.add("simcCode");
		paramNames.add("sicCode");
		paramNames.add("year");
		
		List<String> paramValues = new ArrayList<String>();
		paramValues.add("11362");
		paramValues.add("11");
		paramValues.add("20");
		paramValues.add("I");
		paramValues.add("2012");
		
		
		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + MunicipalitySurplusPerYearRequest.url,
				params.toString());

		System.out.println(result);
		MunicipalitySurplusPerYearResult resultData = om.readValue(result,
				MunicipalitySurplusPerYearResult.class);

		MunicipalitySurplusPerYear a = resultData.getResult();
		
		System.out.println("prefCode" + a.getPrefCode());

		System.out.println("prefName" + a.getPrefName());
		System.out.println("cityName" + a.getCityName());
		System.out.println("prefCode" + a.getPrefCode());
		System.out.println("cityCode" + a.getCityCode());

		System.out.println("sicCode" + a.getSicCode());

		System.out.println("sicName" + a.getSicName());
		System.out.println("simcCode" + a.getSimcCode());
		System.out.println("simcName" + a.getSimcName());
		
		for(MunicipalitySurplusPerYearResultData data : a.getData()){
			
			System.out.println("year : " + data.getYear());
			
			
			System.out.println("value: " + data.getValue());

			System.out.println("concealmentFlag: " + data.getValue());
			
		}
		
		
		
	}

}
