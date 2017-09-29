package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.agriculture.AgricultureMatterEnum;
import nagoya.code4.resas.forestry.ForestryIncomeForSalesRatio;
import nagoya.code4.resas.forestry.ForestryIncomeForSalesRatioLegend;
import nagoya.code4.resas.forestry.ForestryIncomeForSalesRatioRequest;
import nagoya.code4.resas.forestry.ForestryIncomeForSalesRatioResult;
import nagoya.code4.resas.forestry.ForestryIncomeForSalesRatioYear;
import nagoya.code4.resas.forestry.ForestryIncomeForSalesRatioYearData;

public class ForestryIncomeForSalesRatioRequestTest {

	@Test
	public void test() throws ParseException, IOException {
		

		ObjectMapper om = new ObjectMapper();

		List<String> paramNames = new ArrayList<String>();
		paramNames.add("cityCode");
		paramNames.add("prefCode");

		paramNames.add("matter");
		List<String> paramValues = new ArrayList<String>();

		paramValues.add("-");
		paramValues.add("-");
		paramValues.add("" + AgricultureMatterEnum.JapanAverage.getValue());

		
		
		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + ForestryIncomeForSalesRatioRequest.url,
				params.toString());

		System.out.println(result);
		ForestryIncomeForSalesRatioResult    resultData = om.readValue(result,
				ForestryIncomeForSalesRatioResult.class);

		ForestryIncomeForSalesRatio a = resultData.getResult();
		
		System.out.println("prefCode" + a.getPrefCode());

		System.out.println("prefName" + a.getPrefName());
		System.out.println("cityName" + a.getCityName());
		System.out.println("prefCode" + a.getPrefCode());
		System.out.println("cityCode" + a.getCityCode());

		System.out.println("matter : " + a.getMatter());

		

		for(ForestryIncomeForSalesRatioLegend l : a.getLegend()){

			System.out.println("label : " + l.getLabel());
			System.out.println("CODE : " + l.getCode());

			
		}
		
		for(ForestryIncomeForSalesRatioYear data : a.getYears()){
			
			System.out.println("year : " + data.getYear());
			System.out.println("value : " + data.getLabel());

			
			for(ForestryIncomeForSalesRatioYearData ydata : data.getData()){
				System.out.println("code : " + ydata.getCode());

				System.out.println("value : " + ydata.getValue());
				System.out.println("label : " + ydata.getLabel());
			}
		}
		
		
	}

}
