package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.municipality.MunicipalityFinaceForSettlementAmountResultData;
import nagoya.code4.resas.municipality.MunicipalityFinanceForSettlementAmount;
import nagoya.code4.resas.municipality.MunicipalityFinanceForSettlementAmountRequest;
import nagoya.code4.resas.municipality.MunicipalityFinanceForSettlementAmountResult;
import nagoya.code4.resas.municipality.MunicipalityFinanceForSettlementAmountYear;

public class MunicipalityFinanceForSettlementAmountRequestTest {

	@Test
	public void test() throws ParseException, IOException {

		ObjectMapper om = new ObjectMapper();

		List<String> paramNames = new ArrayList<String>();
		paramNames.add("year");
		paramNames.add("prefCode");
		paramNames.add("cityCode");
		paramNames.add("matter");

		List<String> paramValues = new ArrayList<String>();
		paramValues.add("2014");
		paramValues.add("23");
		paramValues.add("-");
		paramValues.add("1");

		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + MunicipalityFinanceForSettlementAmountRequest.url, params.toString());

		System.out.println(result);
		MunicipalityFinanceForSettlementAmountResult resultData = om.readValue(result, MunicipalityFinanceForSettlementAmountResult.class);

		MunicipalityFinanceForSettlementAmount a = resultData.getResult();

		System.out.println("prefCode" + a.getPrefCode());

		System.out.println("prefName" + a.getPrefName());
		System.out.println("cityName" + a.getCityName());
		System.out.println("prefCode" + a.getPrefCode());
		System.out.println("cityCode" + a.getCityCode());


		System.out.println("matter" + a.getMatter());

		for (MunicipalityFinanceForSettlementAmountYear year: a.getYears()) {

			System.out.println("year : " + year.getYear());

			for(MunicipalityFinaceForSettlementAmountResultData data : year.getData()){

				System.out.println("label : " + data.getLabel());
				System.out.println("code : " + data.getCode());
				System.out.println("value : " + data.getValue());
				
			}
			
		}

	}

}
