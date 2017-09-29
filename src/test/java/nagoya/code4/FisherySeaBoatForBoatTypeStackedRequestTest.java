package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.fishery.FisherySeaBoatForBoatTypeStacked;
import nagoya.code4.resas.fishery.FisherySeaBoatForBoatTypeStackedRequest;
import nagoya.code4.resas.fishery.FisherySeaBoatForBoatTypeStackedResult;
import nagoya.code4.resas.fishery.FisherySeaBoatForBoatTypeStackedResultData;
import nagoya.code4.resas.fishery.FisherySeaBoatForBoatTypeStackedYear;

public class FisherySeaBoatForBoatTypeStackedRequestTest {

	@Test
	public void test() throws JsonParseException, JsonMappingException, IOException {
		

		ObjectMapper om = new ObjectMapper();

		List<String> paramNames = new ArrayList<String>();
		paramNames.add("cityCode");
		paramNames.add("prefCode");
		
		List<String> paramValues = new ArrayList<String>();

		paramValues.add("-");
		paramValues.add("15");

		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + FisherySeaBoatForBoatTypeStackedRequest.url, params.toString());

		System.out.println(result);
		FisherySeaBoatForBoatTypeStackedResult resultData = om.readValue(result, FisherySeaBoatForBoatTypeStackedResult.class);

		FisherySeaBoatForBoatTypeStacked a = resultData.getResult();

		System.out.println("prefCode" + a.getPrefCode());

		System.out.println("prefName" + a.getPrefName());
		System.out.println("cityName" + a.getCityName());
		System.out.println("prefCode" + a.getPrefCode());
		System.out.println("cityCode" + a.getCityCode());

		for (FisherySeaBoatForBoatTypeStackedYear y : a.getYears()) {

			System.out.println("year " + y.getYear());
			
			
			for(FisherySeaBoatForBoatTypeStackedResultData data : y.getData()){
				
				System.out.println("code " + data.getCode());
				System.out.println("value : " + data.getValue());
				System.out.println("label: " + data.getLabel());
				
				
			}
		

		}
	}


}
