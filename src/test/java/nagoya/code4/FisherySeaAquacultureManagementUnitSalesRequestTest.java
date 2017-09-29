package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.agriculture.AgricultureMatterEnum;
import nagoya.code4.resas.fishery.FisherySeaAquacultureManagementUnitSales;
import nagoya.code4.resas.fishery.FisherySeaAquacultureManagementUnitSalesRequest;
import nagoya.code4.resas.fishery.FisherySeaAquacultureManagementUnitSalesResult;
import nagoya.code4.resas.fishery.FisherySeaAquacultureManagementUnitSalesResultData;
import nagoya.code4.resas.fishery.FisherySeaManagementUnitSales;
import nagoya.code4.resas.fishery.FisherySeaManagementUnitSalesRequest;
import nagoya.code4.resas.fishery.FisherySeaManagementUnitSalesResult;
import nagoya.code4.resas.fishery.FisherySeaManagementUnitSalesResultData;

public class FisherySeaAquacultureManagementUnitSalesRequestTest {

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
		paramValues.add(""+AgricultureMatterEnum.JapanAverage.getValue());

		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + FisherySeaAquacultureManagementUnitSalesRequest.url, params.toString());

		System.out.println(result);
		FisherySeaAquacultureManagementUnitSalesResult resultData = om.readValue(result, FisherySeaAquacultureManagementUnitSalesResult.class);

		FisherySeaAquacultureManagementUnitSales a = resultData.getResult();

		System.out.println("prefCode" + a.getPrefCode());

		System.out.println("prefName" + a.getPrefName());
		System.out.println("cityName" + a.getCityName());
		System.out.println("prefCode" + a.getPrefCode());
		System.out.println("cityCode" + a.getCityCode());
		
		System.out.println("matter " + a.getMatter());
		

		for (FisherySeaAquacultureManagementUnitSalesResultData y : a.getYears()) {

			System.out.println("year " + y.getYear());
			System.out.println("value : " + y.getValue());

		}

	}
}
