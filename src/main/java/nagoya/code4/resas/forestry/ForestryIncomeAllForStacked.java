package nagoya.code4.resas.forestry;

import java.util.List;

public class ForestryIncomeAllForStacked {
	
	private List<ForestryIncomeAllForStackedYear> years;
	
	private String prefName;
	
	private String prefCode;
	
	private String cityCode;
	
	private String cityName;
	


	public List<ForestryIncomeAllForStackedYear> getYears() {
		return years;
	}

	public void setYears(List<ForestryIncomeAllForStackedYear> years) {
		this.years = years;
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
	

}
