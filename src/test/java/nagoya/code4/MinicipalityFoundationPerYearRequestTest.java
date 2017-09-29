package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.municipality.MunicipalityFoundationPerYear;
import nagoya.code4.resas.municipality.MunicipalityFoundationPerYearRequest;
import nagoya.code4.resas.municipality.MunicipalityFoundationPerYearResult;
import nagoya.code4.resas.municipality.MunicipalityFoundationPerYearResultData;

public class MinicipalityFoundationPerYearRequestTest {

	@Test
	public void test() throws ParseException, IOException {
		
		ObjectMapper om = new ObjectMapper();

		List<String> paramNames = new ArrayList<String>();
		paramNames.add("cityCode");
		paramNames.add("prefCode");
		
		List<String> paramValues = new ArrayList<String>();

		paramValues.add("11362");
		paramValues.add("11");
		
		
		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + MunicipalityFoundationPerYearRequest.url,
				params.toString());

		System.out.println(result);
		MunicipalityFoundationPerYearResult resultData = om.readValue(result,
				MunicipalityFoundationPerYearResult.class);

		MunicipalityFoundationPerYear a = resultData.getResult();
		
		System.out.println("prefCode" + a.getPrefCode());

		System.out.println("prefName" + a.getPrefName());
		System.out.println("cityName" + a.getCityName());
		System.out.println("prefCode" + a.getPrefCode());
		System.out.println("cityCode" + a.getCityCode());

		System.out.println("sicCode" + a.getSicCode());

		System.out.println("sicName" + a.getSicName());
		System.out.println("simcCode" + a.getSimcCode());
		System.out.println("simcName" + a.getSimcName());
		
		for(MunicipalityFoundationPerYearResultData data : a.getData()){
			
			System.out.println("year : " + data.getYear());
			
			
			System.out.println("value: " + data.getValue());
			
		}
	}
		

}
