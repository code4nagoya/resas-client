package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.tourism.TourismGuestPrefLine;
import nagoya.code4.resas.tourism.TourismGuestPrefLineChange;
import nagoya.code4.resas.tourism.TourismGuestPrefLineRequest;
import nagoya.code4.resas.tourism.TourismGuestPrefLineResult;
import nagoya.code4.resas.tourism.TourismGuestPrefLineResultData;

public class TourismGuestPrefLineRequestTest {

	@Test
	public void test() throws ParseException, IOException {
		ObjectMapper om = new ObjectMapper();

		List<String> paramNames = new ArrayList<String>();
		paramNames.add("prefCode");
		paramNames.add("cityCode");
		paramNames.add("addOppPrefCode");
		paramNames.add("year");

		List<String> paramValues = new ArrayList<String>();

		paramValues.add("13");
		paramValues.add("13101");
		paramValues.add("23");
		paramValues.add("2015");

		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + TourismGuestPrefLineRequest.url, params.toString());

		System.out.println(result);
		TourismGuestPrefLineResult resultData = om.readValue(result, TourismGuestPrefLineResult.class);

		TourismGuestPrefLine a = resultData.getResult();
		
		System.out.println("PrefCode" + a.getPrefCode());
		System.out.println("PrefName" + a.getPrefName());
		System.out.println("cityCode" + a.getCityCode());
		System.out.println("cityName" + a.getCityName());
	
		

		for (TourismGuestPrefLineChange data : a.getChanges()) {

			System.out.println("oppPrefCode" + data.getOppPrefCode());
			System.out.println("oppPrefName" + data.getOppPrefName());
			System.out.println("rank" + data.getRank());

			for(TourismGuestPrefLineResultData d : data.getData()){
				
				System.out.println("year " + d.getYear());
				

				System.out.println("value " + d.getValue());
				
			}

		}
		
	}

}
