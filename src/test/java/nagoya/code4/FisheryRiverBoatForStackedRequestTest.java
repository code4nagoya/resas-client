package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.fishery.FisheryRiverBoatForStacked;
import nagoya.code4.resas.fishery.FisheryRiverBoatForStackedRequest;
import nagoya.code4.resas.fishery.FisheryRiverBoatForStackedResult;
import nagoya.code4.resas.fishery.FisheryRiverBoatForStackedResultData;
import nagoya.code4.resas.fishery.FisheryRiverBoatForStackedYear;

public class FisheryRiverBoatForStackedRequestTest {

	@Test
	public void test() throws ParseException, IOException {
		ObjectMapper om = new ObjectMapper();

		List<String> paramNames = new ArrayList<String>();
		paramNames.add("prefCode");

		List<String> paramValues = new ArrayList<String>();

		paramValues.add("1");

		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + FisheryRiverBoatForStackedRequest.url, params.toString());

		System.out.println(result);
		FisheryRiverBoatForStackedResult resultData = om.readValue(result,
				FisheryRiverBoatForStackedResult.class);

		FisheryRiverBoatForStacked a = resultData.getResult();

		System.out.println("prefCode" + a.getPrefCode());

		System.out.println("prefName" + a.getPrefName());

		for (FisheryRiverBoatForStackedYear y : a.getYears()) {

			System.out.println("year " + y.getYear());

			for (FisheryRiverBoatForStackedResultData data : y.getData()) {
				System.out.println("code" + data.getCode());
				System.out.println("label" + data.getLabel());

				System.out.println("sales+" + data.getSales());

			}

		}

	}

}
