package nagoya.code4.resas.municipality;

public class MunicipalityFinanceForSettlementAmountRequest {

	public static final String url = "/municipality/finance/forSettlementAmount";

	/**
	 * 指定可能年度:2011-2014年
	 */
	private String year;

	private String prefCode;

	private String cityCode;

	/**
	 * 1:指定地域
	 * 
	 * 2:グループ平均
	 * 
	 * 3:全国平均
	 */
	private String matter;

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getPrefCode() {
		return prefCode;
	}

	public void setPrefCode(String prefCode) {
		this.prefCode = prefCode;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getMatter() {
		return matter;
	}

	public void setMatter(String matter) {
		this.matter = matter;
	}

}
