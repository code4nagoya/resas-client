package nagoya.code4.resas.population;

import nagoya.code4.resas.AbstractResultList;

public class PopulationMeshCharts extends AbstractResultList<PopulationMeshChartResultData> {
	
	private String displayMethod;
	
	private String year;
	
	private String cityName;
	
	private String cityCode;
	
	private String prefName;

	private String prefCode;
	
	
	private String matter;
	
	public String getDisplayMethod() {
		return displayMethod;
	}


	public void setDisplayMethod(String displayMethod) {
		this.displayMethod = displayMethod;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	public String getCityCode() {
		return cityCode;
	}


	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
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


	public String getMatter() {
		return matter;
	}


	public void setMatter(String matter) {
		this.matter = matter;
	}


	

}
