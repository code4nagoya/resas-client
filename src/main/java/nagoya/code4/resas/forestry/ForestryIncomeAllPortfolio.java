package nagoya.code4.resas.forestry;

import nagoya.code4.resas.AbstractResultList;

public class ForestryIncomeAllPortfolio extends AbstractResultList<ForestryIncomeAllPortfolioResultData>{
	
	private String year;
	
	private String prefName;
	
	private String prefCode;
	
	private String cityCode;
	
	private String cityName;
	
	private String areaType;
	
	private String allcount;
	
	private String otherscount;

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getPrefName() {
		return prefName;
	}

	public void setPrefName(String prefName) {
		this.prefName = prefName;
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

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getAreaType() {
		return areaType;
	}

	public void setAreaType(String areaType) {
		this.areaType = areaType;
	}

	public String getAllcount() {
		return allcount;
	}

	public void setAllcount(String allcount) {
		this.allcount = allcount;
	}

	public String getOtherscount() {
		return otherscount;
	}

	public void setOtherscount(String otherscount) {
		this.otherscount = otherscount;
	}
	
	

}
