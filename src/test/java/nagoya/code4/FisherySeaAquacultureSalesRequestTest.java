package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.agriculture.AgricultureMatterEnum;
import nagoya.code4.resas.fishery.FisherySeaAquacultureSales;
import nagoya.code4.resas.fishery.FisherySeaAquacultureSalesLegend;
import nagoya.code4.resas.fishery.FisherySeaAquacultureSalesRequest;
import nagoya.code4.resas.fishery.FisherySeaAquacultureSalesResult;
import nagoya.code4.resas.fishery.FisherySeaAquacultureSalesResultData;
import nagoya.code4.resas.fishery.FisherySeaAquacultureSalesYear;

public class FisherySeaAquacultureSalesRequestTest {

	@Test
	public void test() throws JsonParseException, JsonMappingException, IOException {
		

		ObjectMapper om = new ObjectMapper();

		List<String> paramNames = new ArrayList<String>();
		paramNames.add("cityCode");
		paramNames.add("prefCode");
		paramNames.add("matter");
		List<String> paramValues = new ArrayList<String>();

		paramValues.add("11362");
		paramValues.add("11");
		paramValues.add(""+AgricultureMatterEnum.JapanAverage.getValue());

		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + FisherySeaAquacultureSalesRequest.url, params.toString());

		System.out.println(result);
		FisherySeaAquacultureSalesResult resultData = om.readValue(result, FisherySeaAquacultureSalesResult.class);

		FisherySeaAquacultureSales a = resultData.getResult();

		System.out.println("prefCode" + a.getPrefCode());

		System.out.println("prefName" + a.getPrefName());
		System.out.println("cityName" + a.getCityName());
		System.out.println("prefCode" + a.getPrefCode());
		System.out.println("cityCode" + a.getCityCode());
		System.out.println("matter " + a.getMatter());

		for (FisherySeaAquacultureSalesYear y : a.getYears()) {

			System.out.println("year " + y.getYear());
			System.out.println("label : " + y.getLabel());
			
			
			for( FisherySeaAquacultureSalesLegend l : y.getLegend()){

				System.out.println("code " + l.getCode());
				System.out.println("label : " + l.getLabel());
					
			}
			
			for(FisherySeaAquacultureSalesResultData data : y.getData()){
				
				System.out.println("code " + data.getCode());
				System.out.println("value : " + data.getValue());
				
				
			}
		

		}

	}

}
