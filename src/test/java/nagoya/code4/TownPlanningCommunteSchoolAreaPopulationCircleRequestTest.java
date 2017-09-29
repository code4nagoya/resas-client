package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.townplanning.TownPlanningCommuteCircleNightData;
import nagoya.code4.resas.townplanning.TownPlanningCommuteCircleNoonData;
import nagoya.code4.resas.townplanning.TownPlanningCommuteSchoolAreaPopulationCircle;
import nagoya.code4.resas.townplanning.TownPlanningCommuteSchoolAreaPopulationCircleRequest;
import nagoya.code4.resas.townplanning.TownPlanningCommuteSchoolAreaPopulationCircleResult;

public class TownPlanningCommunteSchoolAreaPopulationCircleRequestTest {

	@Test
	public void test() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper om = new ObjectMapper();

		List<String> paramNames = new ArrayList<String>();
		paramNames.add("prefecture_cd");
		paramNames.add("city_cd");
		paramNames.add("mode");
		paramNames.add("year");

		List<String> paramValues = new ArrayList<String>();

		paramValues.add("13");
		paramValues.add("13101");
		paramValues.add("2");
		paramValues.add("2010");

		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + TownPlanningCommuteSchoolAreaPopulationCircleRequest.url, params.toString());

		System.out.println(result);
		TownPlanningCommuteSchoolAreaPopulationCircleResult resultData = om.readValue(result, TownPlanningCommuteSchoolAreaPopulationCircleResult.class);

		TownPlanningCommuteSchoolAreaPopulationCircle a = resultData.getResult();

		System.out.println("year" + a.getYear());
		System.out.println("pref" + a.getPref());
		System.out.println("city" + a.getCity());
		System.out.println("mode" + a.getMode());
		System.out.println("daysum " + a.getNoonDataSum());
		System.out.println("nightsum " + a.getNightDataSum());
		System.out.println("dayNightRate " + a.getDayNightRate());

		for (TownPlanningCommuteCircleNoonData data : a.getNoonData()) {

			System.out.println("code" + data.getCode());
			System.out.println("name" + data.getName());
			System.out.println("tooltip" + data.getTooltip());
			System.out.println("rate" + data.getRate());
		}
		
		for (TownPlanningCommuteCircleNightData data :a.getNightData()) {

			System.out.println("code" + data.getCode());
			System.out.println("name" + data.getName());
			System.out.println("tooltip" + data.getTooltip());
			System.out.println("rate" + data.getRate());
		}

}

}
