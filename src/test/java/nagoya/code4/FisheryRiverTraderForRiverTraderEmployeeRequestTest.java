package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.fishery.FisheryRiverBoatForStackedResultData;
import nagoya.code4.resas.fishery.FisheryRiverTraderForRiverTraderEmployee;
import nagoya.code4.resas.fishery.FisheryRiverTraderForRiverTraderEmployeeRequest;
import nagoya.code4.resas.fishery.FisheryRiverTraderForRiverTraderEmployeeResult;
import nagoya.code4.resas.fishery.FisheryRiverTraderForRiverTraderEmployeeYear;

public class FisheryRiverTraderForRiverTraderEmployeeRequestTest {

	@Test
	public void test() throws ParseException, IOException {
		
		ObjectMapper om = new ObjectMapper();

		List<String> paramNames = new ArrayList<String>();
		paramNames.add("prefCode");
		paramNames.add("matter");

		List<String> paramValues = new ArrayList<String>();

		paramValues.add("15");
		paramValues.add("1");
		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + FisheryRiverTraderForRiverTraderEmployeeRequest.url, params.toString());

		System.out.println(result);
		FisheryRiverTraderForRiverTraderEmployeeResult resultData = om.readValue(result,
				FisheryRiverTraderForRiverTraderEmployeeResult.class);

		FisheryRiverTraderForRiverTraderEmployee a = resultData.getResult();

		System.out.println("prefCode" + a.getPrefCode());

		System.out.println("prefName" + a.getPrefName());

		for (FisheryRiverTraderForRiverTraderEmployeeYear y : a.getYears()) {

			System.out.println("year " + y.getYear());
			System.out.println("trader_employee" + y.getTrader_employee());
		}
	}

}
