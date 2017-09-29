package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.regional.RegionalEmployAnalysisPortfolioRequest;
import nagoya.code4.resas.regional.ResionalEmployAnalysisPortfolio;
import nagoya.code4.resas.regional.ResionalEmployAnalysisPortfolioResult;
import nagoya.code4.resas.regional.ResionalEmployAnalysisPortfolioResultData;

public class RegionalEmployAnalysisPortfolioRequestTest {

	@Test
	public void test() throws ParseException, IOException {

		ObjectMapper om = new ObjectMapper();

		List<String> paramNames = new ArrayList<String>();
		paramNames.add("prefCode");
		paramNames.add("year");
		paramNames.add("matter");
		paramNames.add("class");

		List<String> paramValues = new ArrayList<String>();
		paramValues.add("23");
		paramValues.add("2012");
		paramValues.add("1");
		paramValues.add("1");

		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + RegionalEmployAnalysisPortfolioRequest.url,
				params.toString());

		System.out.println(result);
		ResionalEmployAnalysisPortfolioResult resultData = om.readValue(result,
				ResionalEmployAnalysisPortfolioResult.class);

		ResionalEmployAnalysisPortfolio a = resultData.getResult();

		System.out.println("prefCode : " + a.getPrefCode());

		System.out.println("prefName : " + a.getPrefName());

		System.out.println("year : " + a.getYear());

		System.out.println("matter : " + a.getMatter());

		System.out.println("class : " + a.getClass());

		System.out.println("allcount : " + a.getAllcount());
		System.out.println("otherscount : " + a.getOtherscount());

		for (ResionalEmployAnalysisPortfolioResultData data : a.getData()) {
			System.out.println("broadCode	 : " + data.getBroadCode());
			System.out.println("broadName : " + data.getBroadName());

			System.out.println("middleCode  : " + data.getMiddleCode());

			System.out.println("middleName :" + data.getMiddleName());

			System.out.println("value : " + data.getValue());

		}
	}

}
