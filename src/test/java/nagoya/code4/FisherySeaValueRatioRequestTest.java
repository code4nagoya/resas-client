package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.fishery.FisherySeaShipRatio;
import nagoya.code4.resas.fishery.FisherySeaShipRatioRequest;
import nagoya.code4.resas.fishery.FisherySeaShipRatioResult;
import nagoya.code4.resas.fishery.FisherySeaShipRatioResultData;
import nagoya.code4.resas.fishery.FisherySeaShipRatioResultYear;

public class FisherySeaValueRatioRequestTest {

	@Test
	public void test() throws ParseException, IOException {

		ObjectMapper om = new ObjectMapper();

		List<String> paramNames = new ArrayList<String>();
		paramNames.add("cityCode");
		paramNames.add("prefCode");
		paramNames.add("matter");

		List<String> paramValues = new ArrayList<String>();

		paramValues.add("-");
		paramValues.add("13");
		paramValues.add(""+3);

		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + FisherySeaShipRatioRequest.url, params.toString());

		System.out.println(result);
		FisherySeaShipRatioResult resultData = om.readValue(result, FisherySeaShipRatioResult.class);

		FisherySeaShipRatio a = resultData.getResult();

		System.out.println("prefCode" + a.getPrefCode());

		System.out.println("prefName" + a.getPrefName());
		System.out.println("cityName" + a.getCityName());
		System.out.println("prefCode" + a.getPrefCode());
		System.out.println("cityCode" + a.getCityCode());

		System.out.println("matter" + a.getMatter());

		for (FisherySeaShipRatioResultYear y : a.getYears()) {

			System.out.println("year " + y.getYear());

			System.out.println("label " + y.getLabel());
			

			for(FisherySeaShipRatioResultData  data : y.getData()){
				
				System.out.println("data value" + data.getValue());
				System.out.println("data code" + data.getCode());
				System.out.println("data label" +data.getLabel());
					
			}
			
			

		}

	}

}
