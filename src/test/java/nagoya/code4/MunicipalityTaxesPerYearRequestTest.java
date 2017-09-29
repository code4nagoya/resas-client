package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.municipality.MunicipalityTaxesPerYear;
import nagoya.code4.resas.municipality.MunicipalityTaxesPerYearRequest;
import nagoya.code4.resas.municipality.MunicipalityTaxesPerYearResult;
import nagoya.code4.resas.municipality.MunicipalityTaxesPerYearResultData;

public class MunicipalityTaxesPerYearRequestTest {

	@Test
	public void test() throws ParseException, IOException {

		ObjectMapper om = new ObjectMapper();

		List<String> paramNames = new ArrayList<String>();
		paramNames.add("cityCode");
		paramNames.add("prefCode");

		List<String> paramValues = new ArrayList<String>();
		paramValues.add("11362");
		paramValues.add("11");
		
		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + MunicipalityTaxesPerYearRequest.url, params.toString());

		System.out.println(result);
		MunicipalityTaxesPerYearResult resultData = om.readValue(result, MunicipalityTaxesPerYearResult.class);

		MunicipalityTaxesPerYear a = resultData.getResult();

		System.out.println("prefCode" + a.getPrefCode());

		System.out.println("prefName" + a.getPrefName());
		System.out.println("cityName" + a.getCityName());
		System.out.println("prefCode" + a.getPrefCode());
		System.out.println("cityCode" + a.getCityCode());


		for (MunicipalityTaxesPerYearResultData data : a.getData()) {

			System.out.println("year : " + data.getYear());

			System.out.println("value: " + data.getValue());

		}

	}

}
