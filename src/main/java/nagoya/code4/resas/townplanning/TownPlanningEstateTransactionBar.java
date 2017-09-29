package nagoya.code4.resas.townplanning;

import java.util.List;

public class TownPlanningEstateTransactionBar {

	private String prefCode;

	private String prefName;

	private String cityCode;

	private String cityName;

	private String year;

	/**
	 * 表示種類
	 * 
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

	private List<TownPlanningEstateTransactionBarResultData> years;

	public String getPrefCode() {
		return prefCode;
	}

	public void setPrefCode(String prefCode) {
		this.prefCode = prefCode;
	}

	public String getPrefName() {
		return prefName;
	}

	public void setPrefName(String prefName) {
		this.prefName = prefName;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDisplayType() {
		return displayType;
	}

	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}

	public List<TownPlanningEstateTransactionBarResultData> getYears() {
		return years;
	}

	public void setYears(List<TownPlanningEstateTransactionBarResultData> years) {
		this.years = years;
	}

}
