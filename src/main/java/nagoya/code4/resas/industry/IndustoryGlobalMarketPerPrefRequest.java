package nagoya.code4.resas.industry;

import nagoya.code4.resas.AbstractSimpleResult;

public class IndustoryGlobalMarketPerPrefRequest{

	public static final String url = "/industry/globalmarket/perPref";

	/**
	 * 指定可能年度:1995-2013年
	 */
	private String year;
	/**
	 * 1:企業進出数
	 * 
	 * 2:増減率
	 */

	private String dispType;

	private String regionCode;

	private String countryCode;

	private String sicCode;

	private String simcCode;

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDispType() {
		return dispType;
	}

	public void setDispType(String dispType) {
		this.dispType = dispType;
	}

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
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

}
