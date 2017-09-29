package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.agriculture.AgricultureMatterEnum;
import nagoya.code4.resas.fishery.FisheryRiverSalesForStapleStacked;
import nagoya.code4.resas.fishery.FisheryRiverSalesForStapleStackedRequest;
import nagoya.code4.resas.fishery.FisheryRiverSalesForStapleStackedResult;
import nagoya.code4.resas.fishery.FisheryRiverSalesForStapleStackedResultData;
import nagoya.code4.resas.fishery.FisheryRiverSalesForStapleStackedYear;

public class FisheryRiverSalesForStapleStackedRequestTest {

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
		paramValues.add("" + AgricultureMatterEnum.JapanAverage.getValue());

		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + FisheryRiverSalesForStapleStackedRequest.url,
				params.toString());

		System.out.println(result);
		FisheryRiverSalesForStapleStackedResult resultData = om.readValue(result,
				FisheryRiverSalesForStapleStackedResult.class);

		FisheryRiverSalesForStapleStacked a = resultData.getResult();

		System.out.println("prefCode" + a.getPrefCode());

		System.out.println("prefName" + a.getPrefName());
		


		for (FisheryRiverSalesForStapleStackedYear y : a.getYears()) {

			System.out.println("year " + y.getYear());
			
			for(FisheryRiverSalesForStapleStackedResultData data : y.getData()){
				System.out.println("sectionCode" + data.getSectionCode());
				System.out.println("sectionName" + data.getSectionName());
					
				System.out.println("sectionCode+" + data.getSectionCodeL());
				System.out.println("sectionNameL" + data.getSectionNameL());
				
			}

		}
	}

}
