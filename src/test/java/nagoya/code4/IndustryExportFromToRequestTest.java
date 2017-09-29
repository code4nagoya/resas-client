package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.industry.IndustryExportFrom;
import nagoya.code4.resas.industry.IndustryExportFromTo;
import nagoya.code4.resas.industry.IndustryExportFromToData;
import nagoya.code4.resas.industry.IndustryExportFromToRequest;
import nagoya.code4.resas.industry.IndustryExportFromToResult;
import nagoya.code4.resas.industry.IndustryExportTo;

public class IndustryExportFromToRequestTest {

	@Test
	public void test() throws ParseException, IOException {
		ObjectMapper om = new ObjectMapper();

		List<String> paramNames = new ArrayList<String>();
		paramNames.add("itemCode3");
		paramNames.add("customsCode2");
		paramNames.add("year");
		paramNames.add("regionCode");
		paramNames.add("itemCode2");
		paramNames.add("unitType");
		paramNames.add("itemCode1");
		paramNames.add("dispType");
		paramNames.add("customsCode1");
		paramNames.add("dataType");
		paramNames.add("countryCode");
		
		

		List<String> paramValues = new ArrayList<String>();

		paramValues.add("-");
		paramValues.add("-");
		paramValues.add("2010");
		paramValues.add("1");
		paramValues.add("-");
		paramValues.add("2");
		paramValues.add("-");
		paramValues.add("1");
		paramValues.add("-");
		paramValues.add("1");
		paramValues.add("-");


		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + IndustryExportFromToRequest.url, params.toString());

		System.out.println(result);
		IndustryExportFromToResult resultData = om.readValue(result, IndustryExportFromToResult.class);

		IndustryExportFromTo a = resultData.getResult();

		for (IndustryExportFromToData data : a.getData()) {

			IndustryExportFrom from = data.getFrom();
			
			
			
			System.out.println("Lat : " + from.getLat());
			System.out.println("Lng : " + from.getLng());

			System.out.println("customsCode1 " + from.getCustomsCode1());

			System.out.println("customsName1 " + from.getCustomsName1());
			System.out.println("customsCode2 " + from.getCustomsCode2());

			System.out.println("customsName2 " + from.getCustomsName2());


			for(IndustryExportTo to : data.getTo()){
				System.out.println("Lat : " + to.getLat());
				System.out.println("Lng : " + to.getLng());

				System.out.println("regionCode " + to.getRegionCode());

				System.out.println("regionName " + to.getRegionName());
				System.out.println("regionCode  " + to.getCountryCode());
				System.out.println("regionName " + to.getCountryName());

				System.out.println("value " + to.getValue());
				
				
				
			}
			
			
		}

	}

}
