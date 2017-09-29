package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.townplanning.TownPlanningEstateTransactionBar;
import nagoya.code4.resas.townplanning.TownPlanningEstateTransactionBarRequest;
import nagoya.code4.resas.townplanning.TownPlanningEstateTransactionBarResult;
import nagoya.code4.resas.townplanning.TownPlanningEstateTransactionBarResultData;

public class TownPlanningEstateTransactionBarRequestTest {

	@Test
	public void test() throws ParseException, IOException {
		ObjectMapper om = new ObjectMapper();

		List<String> paramNames = new ArrayList<String>();
		paramNames.add("year");
		paramNames.add("prefCode");
		paramNames.add("cityCode");
		paramNames.add("displayType");

		List<String> paramValues = new ArrayList<String>();

		paramValues.add("2015");
		paramValues.add("13");
		paramValues.add("13101");
		paramValues.add("1");

		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + TownPlanningEstateTransactionBarRequest.url, params.toString());

		System.out.println(result);
		TownPlanningEstateTransactionBarResult resultData = om.readValue(result, TownPlanningEstateTransactionBarResult.class);

		TownPlanningEstateTransactionBar a = resultData.getResult();

		System.out.println("PrefCode" + a.getPrefCode());
		System.out.println("PrefName" + a.getPrefName());
		System.out.println("cityCode" + a.getCityCode());
		System.out.println("cityName" + a.getCityName());
		System.out.println("year" + a.getYear());
		System.out.println("displayType" + a.getDisplayType());

		for (TownPlanningEstateTransactionBarResultData data : a.getYears()) {

			System.out.println("year " + data.getYear());
			System.out.println("value" + data.getValue());
		}

	}

}
