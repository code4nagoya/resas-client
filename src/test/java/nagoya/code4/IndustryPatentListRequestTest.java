package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.industry.IndustryPatentList;
import nagoya.code4.resas.industry.IndustryPatentListData;
import nagoya.code4.resas.industry.IndustryPatentListRequest;
import nagoya.code4.resas.industry.IndustryPatentListResult;

public class IndustryPatentListRequestTest {

	@Test
	public void test() throws ParseException, IOException {
		ObjectMapper om = new ObjectMapper();

		List<String> paramNames = new ArrayList<String>();
		paramNames.add("year");
		paramNames.add("mode");
		paramNames.add("prefCode");
		paramNames.add("cityCode");
		paramNames.add("patentHolderId");
		paramNames.add("sort1");
		paramNames.add("sort2");
		paramNames.add("offset");


		List<String> paramValues = new ArrayList<String>();

		paramValues.add("2014");
		paramValues.add("1");
		paramValues.add("13");
		paramValues.add("-");
		paramValues.add("-");
		paramValues.add("1");
		paramValues.add("2");
		paramValues.add("1");

		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + IndustryPatentListRequest.url,
				params.toString());

		System.out.println(result);
		IndustryPatentListResult resultData = om.readValue(result,
				IndustryPatentListResult.class);

		IndustryPatentList a = resultData.getResult();

		
		for(IndustryPatentListData data: a.getData()){

			System.out.println("applyNo" + data.getApplyNo());
			System.out.println("patentName" + data.getPatentName());

			System.out.println("patentHolder" + data.getPatentHolder());
			System.out.println("patentSection" + data.getPatentSection());
			System.out.println("patentSubject" + data.getPatentSubject());
			System.out.println("fiClass" + data.getFiClass());
			
			System.out.println("applyDate" + data.getApplyDate());
			
			
			System.out.println("jointlyFlg" + data.getJointlyFlg());
			
			System.out.println("patentHolderId" + data.getPatentHolderId());
			

			System.out.println("prefCode" + data.getPrefCode());
			
			

			System.out.println("cityCode" + data.getCityCode());

			System.out.println("lat" + data.getLat());

			System.out.println("lng" + data.getLng());
			
		}
	}

}
