package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.municipality.MunicipalityJobPerYear;
import nagoya.code4.resas.municipality.MunicipalityJobPerYearRequest;
import nagoya.code4.resas.municipality.MunicipalityJobPerYearResult;
import nagoya.code4.resas.municipality.MunicipalityJobPerYearResultData;

public class MunicipalityAbstractPerYearRequestTest {

	@Test
	public void test() throws ParseException, IOException {

		ObjectMapper om = new ObjectMapper();

		List<String> paramNames = new ArrayList<String>();
		paramNames.add("ismcoCode");
		paramNames.add("prefCode");
		paramNames.add("iscoCode");
		
		List<String> paramValues = new ArrayList<String>();
		paramValues.add("06");
		paramValues.add("11");
		paramValues.add("B");
		
		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + MunicipalityJobPerYearRequest.url,
				params.toString());

		System.out.println(result);
		MunicipalityJobPerYearResult resultData = om.readValue(result,
				MunicipalityJobPerYearResult.class);

		MunicipalityJobPerYear a = resultData.getResult();
		
		System.out.println("prefCode " + a.getPrefCode());

		System.out.println("prefName " + a.getPrefName());
		System.out.println("prefCode " + a.getPrefCode());

		System.out.println("iscoCode " + a.getIscoCode());

		System.out.println("iscoName " + a.getIscoName());
		System.out.println("ismcoCode " + a.getIsmcoCode());
		System.out.println("ismcoName " + a.getIsmcoName());
		
		for(MunicipalityJobPerYearResultData data : a.getData()){
			
			System.out.println("year : " + data.getYear());
			
			
			System.out.println("value: " + data.getValue());

		}
		
		
	}

}
