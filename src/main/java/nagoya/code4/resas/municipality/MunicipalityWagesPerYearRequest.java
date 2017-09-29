package nagoya.code4.resas.municipality;

public class MunicipalityWagesPerYearRequest {

	public static final String url = "/municipality/wages/perYear";

	/**
	 * 年度
	 * 
	 * 指定可能年度:2010-2014年
	 */

	private String year;

	private String sicCode;

	private String simcCode;

	/**
	 * 1:総数
	 * 
	 * 2:~ 19歳
	 * 
	 * 3:20～24歳
	 * 
	 * 4:25～29歳
	 * 
	 * 5:30～34歳
	 * 
	 * 6:35～39歳
	 * 
	 * 7:40～44歳
	 * 
	 * 8:45～49歳
	 * 
	 * 9:50～54歳
	 * 
	 * 10:55～59歳
	 * 
	 * 11:60～64歳
	 * 
	 * 12:65～69歳
	 * 
	 * 13:70歳～
	 * 
	 */
	private String wagesAge;

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getSicCode() {
		return sicCode;
	}

	public void setSicCode(String sicCode) {
		this.sicCode = sicCode;
	}

	public String getSimcCode() {
		return simcCode;
	}

	public void setSimcCode(String simcCode) {
		this.simcCode = simcCode;
	}

	public String getWagesAge() {
		return wagesAge;
	}

	public void setWagesAge(String wagesAge) {
		this.wagesAge = wagesAge;
	}

}
