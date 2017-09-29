package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.tourism.TourismAttractions;
import nagoya.code4.resas.tourism.TourismAttractionsRequest;
import nagoya.code4.resas.tourism.TourismAttractionsResult;
import nagoya.code4.resas.tourism.TourismAttractionsResultData;

public class TourismAttractionsRequestTest {

	@Test
	public void test() throws ParseException, IOException {
		ObjectMapper om = new ObjectMapper();

		List<String> paramNames = new ArrayList<String>();
		paramNames.add("prefCode");
		paramNames.add("cityCode");

		List<String> paramValues = new ArrayList<String>();

		paramValues.add("23");
		paramValues.add("-");

		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + TourismAttractionsRequest.url, params.toString());

		System.out.println(result);
		TourismAttractionsResult resultData = om.readValue(result, TourismAttractionsResult.class);

		TourismAttractions a = resultData.getResult();

		for (TourismAttractionsResultData data : a.getData()) {

			System.out.println("resourceCode" + data.getResourceCode());
			System.out.println("resourceName" + data.getResourceName());
			System.out.println("lng " + data.getLng());
			System.out.println("lat " + data.getLat());


		}

	}

}
