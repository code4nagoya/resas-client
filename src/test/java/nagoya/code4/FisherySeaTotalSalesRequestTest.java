package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.fishery.FisherySeaSalesYear;
import nagoya.code4.resas.fishery.FisherySeaTotalSales;
import nagoya.code4.resas.fishery.FisherySeaTotalSalesRequest;
import nagoya.code4.resas.fishery.FisherySeaTotalSalesResult;
import nagoya.code4.resas.fishery.FisherySeaTotalSalesResultData;

public class FisherySeaTotalSalesRequestTest {

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

		String result = ResasHttpAccess.sendString("api/v1" + FisherySeaTotalSalesRequest.url, params.toString());

		System.out.println(result);
		FisherySeaTotalSalesResult resultData = om.readValue(result, FisherySeaTotalSalesResult.class);

		FisherySeaTotalSales a = resultData.getResult();

		System.out.println("prefCode" + a.getPrefCode());

		System.out.println("prefName" + a.getPrefName());
		System.out.println("cityName" + a.getCityName());
		System.out.println("prefCode" + a.getPrefCode());
		System.out.println("cityCode" + a.getCityCode());

		for (FisherySeaTotalSalesResultData y : a.getYears()) {

			System.out.println("year " + y.getYear());
			System.out.println("value : " + y.getValue());
			
			
			
			

		}

	}
}
