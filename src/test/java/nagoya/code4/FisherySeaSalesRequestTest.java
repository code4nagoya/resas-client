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
import nagoya.code4.resas.fishery.FisherySeaSales;
import nagoya.code4.resas.fishery.FisherySeaSalesLegend;
import nagoya.code4.resas.fishery.FisherySeaSalesRequest;
import nagoya.code4.resas.fishery.FisherySeaSalesResult;
import nagoya.code4.resas.fishery.FisherySeaSalesResultData;
import nagoya.code4.resas.fishery.FisherySeaSalesYear;

public class FisherySeaSalesRequestTest {

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

		String result = ResasHttpAccess.sendString("api/v1" + FisherySeaSalesRequest.url, params.toString());

		System.out.println(result);
		FisherySeaSalesResult resultData = om.readValue(result, FisherySeaSalesResult.class);

		FisherySeaSales a = resultData.getResult();

		System.out.println("prefCode" + a.getPrefCode());

		System.out.println("prefName" + a.getPrefName());
		System.out.println("cityName" + a.getCityName());
		System.out.println("prefCode" + a.getPrefCode());
		System.out.println("cityCode" + a.getCityCode());
		System.out.println("matter " + a.getMatter());

		for (FisherySeaSalesYear y : a.getYears()) {

			System.out.println("year " + y.getYear());
			System.out.println("label : " + y.getLabel());
			
			
			for( FisherySeaSalesLegend l : y.getLegend()){

				System.out.println("code " + l.getCode());
				System.out.println("label : " + l.getLabel());
					
			}
			
			for(FisherySeaSalesResultData data : y.getData()){
				
				System.out.println("code " + data.getCode());
				System.out.println("value : " + data.getValue());
				
				
			}
		

		}

	}


}
