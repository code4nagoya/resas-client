package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.municipality.MunicipalityWagesPerYear;
import nagoya.code4.resas.municipality.MunicipalityWagesPerYearRequest;
import nagoya.code4.resas.municipality.MunicipalityWagesPerYearResult;
import nagoya.code4.resas.municipality.MunicipalityWagesPerYearResultData;

public class MunicipalityWagesPerYearRequestTest {

	@Test
	public void test() throws ParseException, IOException {

		ObjectMapper om = new ObjectMapper();

		List<String> paramNames = new ArrayList<String>();
		paramNames.add("wagesAge");
		paramNames.add("prefCode");
		paramNames.add("simcCode");
		paramNames.add("sicCode");

		List<String> paramValues = new ArrayList<String>();
		paramValues.add("6");
		paramValues.add("23");
		paramValues.add("-");
		paramValues.add("-");

		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + MunicipalityWagesPerYearRequest.url, params.toString());

		System.out.println(result);
		MunicipalityWagesPerYearResult resultData = om.readValue(result, MunicipalityWagesPerYearResult.class);

		MunicipalityWagesPerYear a = resultData.getResult();

		System.out.println("prefCode" + a.getPrefCode());

		System.out.println("prefName" + a.getPrefName());
		System.out.println("prefCode" + a.getPrefCode());

		System.out.println("sicCode" + a.getSicCode());

		System.out.println("sicName" + a.getSicName());
		System.out.println("simcCode" + a.getSimcCode());
		System.out.println("simcName" + a.getSimcName());

		for (MunicipalityWagesPerYearResultData data : a.getData()) {

			System.out.println("year : " + data.getYear());

			System.out.println("value: " + data.getValue());


		}

	}

}
