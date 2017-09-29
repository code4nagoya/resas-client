package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.forestry.ForestryIncomeForStacked;
import nagoya.code4.resas.forestry.ForestryIncomeForStackedRequest;
import nagoya.code4.resas.forestry.ForestryIncomeForStackedResult;
import nagoya.code4.resas.forestry.ForestryIncomeForStackedResultData;

public class ForestryIncomeForStackedRequestTest {

	

	

	@Test
	public void testForestryIncomeForStacked() throws ParseException, IOException {
		ObjectMapper om = new ObjectMapper();

		List<String> paramNames = new ArrayList<String>();
		paramNames.add("cityCode");
		paramNames.add("prefCode");
		
		List<String> paramValues = new ArrayList<String>();

		paramValues.add("11362");
		paramValues.add("11");
		
		
		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + ForestryIncomeForStackedRequest.url,
				params.toString());

		System.out.println(result);
		ForestryIncomeForStackedResult resultData = om.readValue(result,
				ForestryIncomeForStackedResult.class);

		ForestryIncomeForStacked a = resultData.getResult();
		
		System.out.println("prefCode" + a.getPrefCode());

		System.out.println("prefName" + a.getPrefName());
		System.out.println("cityName" + a.getCityName());
		System.out.println("prefCode" + a.getPrefCode());
		System.out.println("cityCode" + a.getCityCode());

		System.out.println("label " + a.getLabel());

		
		
		for(ForestryIncomeForStackedResultData data : a.getYears()){
			
			System.out.println("year : " + data.getYear());
			
			System.out.println("sales : " + data.getSales());
			
			System.out.println("income: " + data.getIncome());
			
		}
	}

}
