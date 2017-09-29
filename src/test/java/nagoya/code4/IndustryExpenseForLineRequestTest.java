package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.industry.IndustryExpenseForLine;
import nagoya.code4.resas.industry.IndustryExpenseForLineLabel;
import nagoya.code4.resas.industry.IndustryExpenseForLineRequest;
import nagoya.code4.resas.industry.IndustryExpenseForLineResult;
import nagoya.code4.resas.industry.IndustryExpenseForLineResultData;

public class IndustryExpenseForLineRequestTest {

	@Test
	public void test() throws ParseException, IOException {
		ObjectMapper om = new ObjectMapper();

		List<String> paramNames = new ArrayList<String>();
		paramNames.add("dispType");
		paramNames.add("unit");
		paramNames.add("sicCode");
		paramNames.add("prefCode");

		List<String> paramValues = new ArrayList<String>();

		paramValues.add("1");
		paramValues.add("2");
		paramValues.add("1");
		paramValues.add("23");

		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + IndustryExpenseForLineRequest.url, params.toString());

		System.out.println(result);
		IndustryExpenseForLineResult resultData = om.readValue(result, IndustryExpenseForLineResult.class);

		IndustryExpenseForLine a = resultData.getResult();

		System.out.println("prefName" + a.getPrefName());
		System.out.println("prefCode" + a.getPrefCode());

		System.out.println("sicName" + a.getSicName());
		System.out.println("sicCode" + a.getSicCode());

		for (IndustryExpenseForLineLabel data : a.getChanges()) {
			System.out.println("label : " + data.getLabel());

			for (IndustryExpenseForLineResultData v : data.getData()) {
				System.out.println("year:" + v.getYear());

				System.out.println("value :" + v.getValue());

			}
		}
	}
}
