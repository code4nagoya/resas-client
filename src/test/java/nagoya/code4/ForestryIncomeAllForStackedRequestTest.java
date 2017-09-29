package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.forestry.ForestryIncomeAllForStacked;
import nagoya.code4.resas.forestry.ForestryIncomeAllForStackedRequest;
import nagoya.code4.resas.forestry.ForestryIncomeAllForStackedResult;
import nagoya.code4.resas.forestry.ForestryIncomeAllForStackedResultData;
import nagoya.code4.resas.forestry.ForestryIncomeAllForStackedYear;

public class ForestryIncomeAllForStackedRequestTest {

	@Test
	public void test() throws ParseException, IOException {

		ObjectMapper om = new ObjectMapper();

		List<String> paramNames = new ArrayList<String>();
		paramNames.add("cityCode");
		paramNames.add("prefCode");

		paramNames.add("areaType");
		paramNames.add("year");

		List<String> paramValues = new ArrayList<String>();

		paramValues.add("11362");
		paramValues.add("11");
		paramValues.add("1");
		paramValues.add("2010");

		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + ForestryIncomeAllForStackedRequest.url,
				params.toString());

		System.out.println(result);
		ForestryIncomeAllForStackedResult resultData = om.readValue(result, ForestryIncomeAllForStackedResult.class);

		ForestryIncomeAllForStacked a = resultData.getResult();

		System.out.println("prefCode" + a.getPrefCode());

		System.out.println("prefName" + a.getPrefName());
		System.out.println("cityName" + a.getCityName());
		System.out.println("prefCode" + a.getPrefCode());
		System.out.println("cityCode" + a.getCityCode());

		for (ForestryIncomeAllForStackedYear y : a.getYears()) {
			
			System.out.println("year" + y.getYear());
			
			for (ForestryIncomeAllForStackedResultData data : y.getData()) {

				System.out.println("sectionCode: " + data.getSectionCode());
				System.out.println("sectionName : " + data.getSectionName());
				System.out.println("value : " + data.getValue());

			}
		}

	}
}
