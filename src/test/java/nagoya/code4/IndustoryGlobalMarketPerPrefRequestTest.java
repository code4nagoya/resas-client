package nagoya.code4;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import nagoya.code4.resas.ResasUtil;
import nagoya.code4.resas.industry.IndustoryGlobalMarketPerPref;
import nagoya.code4.resas.industry.IndustoryGlobalMarketPerPrefRequest;
import nagoya.code4.resas.industry.IndustoryGlobalMarketPerPrefResult;

public class IndustoryGlobalMarketPerPrefRequestTest {

	@Test
	public void test() throws JsonParseException, JsonMappingException, IOException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

		ObjectMapper om = new ObjectMapper();

		List<String> paramNames = new ArrayList<String>();
		paramNames.add("year");
		paramNames.add("regionCode");
		paramNames.add("simcCode");
		paramNames.add("countryCode");
		paramNames.add("dispType");
		paramNames.add("sicCode");

		List<String> paramValues = new ArrayList<String>();

		paramValues.add("2010");
		paramValues.add("1");
		paramValues.add("20");
		paramValues.add("-");
		paramValues.add("1");
		paramValues.add("E");

		StringBuffer params = ResasUtil.addParameters(paramNames, paramValues);

		String result = ResasHttpAccess.sendString("api/v1" + IndustoryGlobalMarketPerPrefRequest.url,
				params.toString());

		System.out.println(result);
		IndustoryGlobalMarketPerPrefResult resultData = om.readValue(result, IndustoryGlobalMarketPerPrefResult.class);

		IndustoryGlobalMarketPerPref a = resultData.getResult();

		System.out.println("sicName" + a.getSicName());
		System.out.println("sicCode" + a.getSicCode());


		Class<?> cl = a.getClass();
		
		for (int i = 1; i < 48; i++) {
			Method method = cl.getMethod("getCode" + i);
			System.out.println( i+ " : " + 			method.invoke(a));

		}
	}

}
