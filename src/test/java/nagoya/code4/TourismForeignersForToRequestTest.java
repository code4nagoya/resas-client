package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.tourism.TourismForeignersForTo;
import nagoya.code4.resas.tourism.TourismForeignersForToChange;
import nagoya.code4.resas.tourism.TourismForeignersForToRequest;
import nagoya.code4.resas.tourism.TourismForeignersForToResult;
import nagoya.code4.resas.tourism.TourismForeignersForToResultData;

public class TourismForeignersForToRequestTest {

	@Test
	public void test() throws ParseException, IOException {

		ObjectMapper om = new ObjectMapper();

		List<String> paramNames = new ArrayList<String>();
		paramNames.add("year");
		paramNames.add("prefCode");
		paramNames.add("regionCode");
		paramNames.add("countryCode");
		paramNames.add("purpose");

		List<String> paramValues = new ArrayList<String>();

		paramValues.add("2014");
		paramValues.add("11");
		paramValues.add("1");
		paramValues.add("-");
		paramValues.add("1");

		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + TourismForeignersForToRequest.url, params.toString());

		System.out.println(result);
		TourismForeignersForToResult resultData = om.readValue(result, TourismForeignersForToResult.class);

		TourismForeignersForTo a = resultData.getResult();

		System.out.println("prefCode " + a.getPrefCode());

		System.out.println("prefName " + a.getPrefName());

		System.out.println("regionCode " + a.getRegionCode());
		System.out.println("regionName " + a.getRegionName());

		System.out.println("countryCode " + a.getCountryCode());
		System.out.println("countryName " + a.getCountryName());
		
		System.out.println("purpose " + a.getPurpose());

		for (TourismForeignersForToChange data : a.getChanges()) {

			System.out.println("prefCode" + data.getPrefCode());
			System.out.println("prefName" + data.getPrefName());

			System.out.println("rank " + data.getRank());
			
			
			for (TourismForeignersForToResultData d : data.getData()) {

				System.out.println("year " + d.getYear());
				System.out.println("quarter " + d.getQuarter());
				System.out.println("value" + d.getValue());

			}
		}
	}
}
