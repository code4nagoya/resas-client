package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.tourism.TourismForeignersForFrom;
import nagoya.code4.resas.tourism.TourismForeignersForFromChange;
import nagoya.code4.resas.tourism.TourismForeignersForFromRequest;
import nagoya.code4.resas.tourism.TourismForeignersForFromResult;
import nagoya.code4.resas.tourism.TourismForeignersForFromResultData;

public class TourismForeignersForFromRequestTest {

	@Test
	public void test() throws ParseException, IOException {

		ObjectMapper om = new ObjectMapper();

		List<String> paramNames = new ArrayList<String>();
		paramNames.add("year");
		paramNames.add("prefCode");
		paramNames.add("purpose");

		List<String> paramValues = new ArrayList<String>();

		paramValues.add("2012");
		paramValues.add("11");
		paramValues.add("1");
		

		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + TourismForeignersForFromRequest.url, params.toString());

		System.out.println(result);
		TourismForeignersForFromResult resultData = om.readValue(result, TourismForeignersForFromResult.class);

		TourismForeignersForFrom a = resultData.getResult();
		

		System.out.println("prefCode " + a.getPrefCode());

		System.out.println("prefName " + a.getPrefName());

		System.out.println("purpose " + a.getPurpose());


		for (TourismForeignersForFromChange data : a.getChanges()) {

			System.out.println("countryCode" + data.getCountryCode());
			System.out.println("countryName" + data.getCountryName());

			
			for(TourismForeignersForFromResultData d : data.getData()){

				System.out.println("year " + d.getYear());
				System.out.println("quarter " + d.getQuarter());
				System.out.println("value" + d.getValue());
	
				
			}
		}
	}

}
