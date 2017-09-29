package nagoya.code4.resas.townplanning;

public class TownPlanningEstateTransactionBarRequest {

	public static final String url = "/townPlanning/estateTransaction/bar";

	// 都道府県コード
	/**
	 * 指定可能年度:2009-2015年
	 */
	private String year;

	private String prefCode;

	private String cityCode;
	/**
	 * 1：土地(住宅地)
	 * 
	 * 2：土地(商業地)
	 * 
	 * 3：中古マンション等
	 * 
	 * 4：農地
	 * 
	 * 5：林地
	 */

	private String displayType;

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

	public String getDisplayType() {
		return displayType;
	}

	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}

}
