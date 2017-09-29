package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.industry.IndustryOverseasTranctionForColumnResultData;
import nagoya.code4.resas.industry.IndustryOverseasTransactionForColumn;
import nagoya.code4.resas.industry.IndustryOverseasTransactionForColumnRequest;
import nagoya.code4.resas.industry.IndustryOverseasTransactionForColumnResult;

public class IndustryOverseasTransactionForColumnRequestTest {

	@Test
	public void test() throws ParseException, IOException {
		ObjectMapper om = new ObjectMapper();

		List<String> paramNames = new ArrayList<String>();
		paramNames.add("dispTradeCode");
		paramNames.add("dispIndustryCode");
		
		paramNames.add("prefCode");
		

		List<String> paramValues = new ArrayList<String>();

		paramValues.add("1");
		paramValues.add("1");
		paramValues.add("23");

		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + IndustryOverseasTransactionForColumnRequest.url, params.toString());

		System.out.println(result);
		IndustryOverseasTransactionForColumnResult resultData = om.readValue(result, IndustryOverseasTransactionForColumnResult.class);

		IndustryOverseasTransactionForColumn a = resultData.getResult();

		
		System.out.println("prefName" + a.getPrefName());
		System.out.println("prefCode" + a.getPrefCode());

		System.out.println("sicName" + a.getSicName());
		System.out.println("sicCode" + a.getSicCode());


		for (IndustryOverseasTranctionForColumnResultData data : a.getSum_data()) {


			System.out.println("sum data year : " + data.getYear());
			System.out.println("sum data value1: " + data.getValue1());
			System.out.println("sum data value2: " + data.getValue2());
			System.out.println("sum data value3: " + data.getValue3());
			System.out.println("sum data value4: " + data.getValue4());
			System.out.println("sum data value5: " + data.getValue5());
			System.out.println("sum data value6: " + data.getValue6());
		}
		
		
		for (IndustryOverseasTranctionForColumnResultData data : a.getData()) {

			System.out.println("year : " + data.getYear());
			System.out.println("value1: " + data.getValue1());
			System.out.println("value2: " + data.getValue2());
			System.out.println("value3: " + data.getValue3());
			System.out.println("value4: " + data.getValue4());
			System.out.println("value5: " + data.getValue5());
			System.out.println("value6: " + data.getValue6());


		}
	}
}
