package nagoya.code4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.ParseException;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.regional.MedicalWelfareCareAnalysisChart;
import nagoya.code4.resas.regional.MedicalWelfareCareAnalysisChartRequest;
import nagoya.code4.resas.regional.MedicalWelfareCareAnalysisChartResult;
import nagoya.code4.resas.regional.MedicalWelfareCareAnalysisChartResultData;

public class MedicalWelfareCareAnalysisChartRequestTest {

	@Test
	public void test() throws ParseException, IOException {

		ObjectMapper om = new ObjectMapper();

		List<String> paramNames = new ArrayList<String>();
		paramNames.add("year");
		paramNames.add("disp_type");
		paramNames.add("sort_type");
		paramNames.add("matter_1");
		paramNames.add("matter_2");
		paramNames.add("broad_category_cd");
		paramNames.add("middle_category_cd");
		paramNames.add("prefCode");
		paramNames.add("cityCode");
		paramNames.add("insuranceCode");

		List<String> paramValues = new ArrayList<String>();

		paramValues.add("2015");
		paramValues.add("1");
		paramValues.add("1");
		paramValues.add("1");
		paramValues.add("101");
		paramValues.add("1");
		paramValues.add("100");
		paramValues.add("2");
		paramValues.add("-");
		paramValues.add("-");

		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + MedicalWelfareCareAnalysisChartRequest.url,
				params.toString());

		System.out.println(result);
		MedicalWelfareCareAnalysisChartResult resultData = om.readValue(result,
				MedicalWelfareCareAnalysisChartResult.class);

		MedicalWelfareCareAnalysisChart a = resultData.getResult();

		System.out.println("sort" + a.getSort());

		System.out.println("dispType" + a.getDispType());
		System.out.println("matter1" + a.getMatter1());
		System.out.println("matter2" + a.getMatter2());
		System.out.println("broadCategoryCode" + a.getBroadCategoryCode());

		System.out.println("middleCategoryCode" + a.getMiddleCategoryCode());

		System.out.println("year" + a.getYear());
		System.out.println("prefecture_cd" + a.getPrefecture_cd());
		System.out.println("municipality_cd" + a.getMunicipality_cd());
		System.out.println("insurance_cd" + a.getInsurance_cd());
		System.out.println("code" + a.getCode());


		for (MedicalWelfareCareAnalysisChartResultData data : a.getData()) {

			System.out.println("code : " + data.getCode());

			System.out.println("name : " + data.getName());
			System.out.println("value: " + data.getValue());

		}
	}

}
