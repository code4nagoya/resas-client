package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.fishery.FisherySeaShipValue;
import nagoya.code4.resas.fishery.FisherySeaShipValueRequest;
import nagoya.code4.resas.fishery.FisherySeaShipValueResult;
import nagoya.code4.resas.fishery.FisherySeaShipValueResultData;
import nagoya.code4.resas.fishery.FisherySeaShipValueResultYear;

public class FisherySeaValueShipRequestTest {

	@Test
	public void test() throws ParseException, IOException {

		ObjectMapper om = new ObjectMapper();

		List<String> paramNames = new ArrayList<String>();
		paramNames.add("cityCode");
		paramNames.add("prefCode");

		List<String> paramValues = new ArrayList<String>();

		paramValues.add("-");
		paramValues.add("13");

		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + FisherySeaShipValueRequest.url, params.toString());

		System.out.println(result);
		FisherySeaShipValueResult resultData = om.readValue(result, FisherySeaShipValueResult.class);

		FisherySeaShipValue a = resultData.getResult();

		System.out.println("prefCode" + a.getPrefCode());

		System.out.println("prefName" + a.getPrefName());
		System.out.println("cityName" + a.getCityName());
		System.out.println("prefCode" + a.getPrefCode());
		System.out.println("cityCode" + a.getCityCode());

		for (FisherySeaShipValueResultYear y : a.getYears()) {

			System.out.println("year " + y.getYear());
			
			for(FisherySeaShipValueResultData data : y.getData()){
				
				System.out.println("data sales" + data.getSales());
				System.out.println("data code" + data.getCode());
				System.out.println("data label" +data.getLabel());
					
			}
			
			

		}

	}

}
