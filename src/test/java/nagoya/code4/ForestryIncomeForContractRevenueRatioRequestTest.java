package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.agriculture.AgricultureMatterEnum;
import nagoya.code4.resas.forestry.ForestryIncomeForContractRevenueRatio;
import nagoya.code4.resas.forestry.ForestryIncomeForContractRevenueRatioLegend;
import nagoya.code4.resas.forestry.ForestryIncomeForContractRevenueRatioRequest;
import nagoya.code4.resas.forestry.ForestryIncomeForContractRevenueRatioResult;
import nagoya.code4.resas.forestry.ForestryIncomeForContractRevenueRatioYear;
import nagoya.code4.resas.forestry.ForestryIncomeForContractRevenueRatioYearData;

public class ForestryIncomeForContractRevenueRatioRequestTest {

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

		String result = ResasHttpAccess.sendString("api/v1" + ForestryIncomeForContractRevenueRatioRequest.url,
				params.toString());

		System.out.println(result);
		ForestryIncomeForContractRevenueRatioResult    resultData = om.readValue(result,
				ForestryIncomeForContractRevenueRatioResult.class);

		ForestryIncomeForContractRevenueRatio a = resultData.getResult();
		
		System.out.println("prefCode" + a.getPrefCode());

		System.out.println("prefName" + a.getPrefName());
		System.out.println("cityName" + a.getCityName());
		System.out.println("prefCode" + a.getPrefCode());
		System.out.println("cityCode" + a.getCityCode());

		System.out.println("matter : " + a.getMatter());

		

		for(ForestryIncomeForContractRevenueRatioLegend l : a.getLegend()){

			System.out.println("label : " + l.getLabel());
			System.out.println("CODE : " + l.getCode());

			
		}
		
		for(ForestryIncomeForContractRevenueRatioYear data : a.getYears()){
			
			System.out.println("year : " + data.getYear());
			System.out.println("value : " + data.getLabel());

			
			for(ForestryIncomeForContractRevenueRatioYearData ydata : data.getData()){
				System.out.println("code : " + ydata.getCode());

				System.out.println("value : " + ydata.getValue());
				System.out.println("label : " + ydata.getLabel());
			}
		}
		
		
	}

}
