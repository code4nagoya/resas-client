package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.forestry.ForestryLandForStacked;
import nagoya.code4.resas.forestry.ForestryLandForStackedRequest;
import nagoya.code4.resas.forestry.ForestryLandForStackedResult;
import nagoya.code4.resas.forestry.ForestryLandForStackedYear;

public class ForestryLandForStackedRequestTest {

	@Test
	public void testForestryLandForStackedRequest() throws ParseException, IOException {
		ObjectMapper om = new ObjectMapper();

		List<String> paramNames = new ArrayList<String>();
		paramNames.add("cityCode");
		paramNames.add("prefCode");
		
		List<String> paramValues = new ArrayList<String>();

		paramValues.add("-");
		paramValues.add("20");
		
		
		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + ForestryLandForStackedRequest.url,
				params.toString());

		System.out.println(result);
		ForestryLandForStackedResult resultData = om.readValue(result,
				ForestryLandForStackedResult.class);

		ForestryLandForStacked a = resultData.getResult();
		
		System.out.println("prefCode" + a.getPrefCode());

		System.out.println("prefName" + a.getPrefName());
		System.out.println("cityName" + a.getCityName());
		System.out.println("prefCode" + a.getPrefCode());
		System.out.println("cityCode" + a.getCityCode());

		System.out.println("label " + a.getLabel());

		
		
		for(ForestryLandForStackedYear data : a.getYears()){
			
			System.out.println("year : " + data.getYear());
			
			System.out.println("stataeare : " + data.getStatearea());
			
			System.out.println("private area: " + data.getPrivatearea());
			
		}
	}
}
