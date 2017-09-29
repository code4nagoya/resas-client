package nagoya.code4.resas;

import java.util.List;

public class ResasUtil {


	public static StringBuffer addParameters(List<String> paramNames,List<String> paramValue) {
		StringBuffer sb = new StringBuffer();
	
		for(int i = 0; i< paramNames.size();i++){

			//
			String param = String.format("%s" + "=%s",paramNames.get(i),paramValue.get(i));

			sb.append(param);
			if(i<paramNames.size() -1){
				sb.append("&");
				
			}
			
		}


		return sb;
	}
}
