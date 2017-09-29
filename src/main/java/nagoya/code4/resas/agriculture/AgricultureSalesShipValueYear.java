package nagoya.code4.resas.agriculture;

import java.util.List;

public class AgricultureSalesShipValueYear {
	

	private String prefCode;
	
	private String prefName;
	
	private String cityCode;
	
	private String cityName;
	
	private String oldCityCode;
	
	private String oldCityName;
	
	private List<AgricultureSalesShipValueResultYear> years;

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

	public String getOldCityCode() {
		return oldCityCode;
	}

	public void setOldCityCode(String oldCityCode) {
		this.oldCityCode = oldCityCode;
	}

	public String getOldCityName() {
		return oldCityName;
	}

	public void setOldCityName(String oldCityName) {
		this.oldCityName = oldCityName;
	}

	public List<AgricultureSalesShipValueResultYear> getYears() {
		return years;
	}

	public void setYears(List<AgricultureSalesShipValueResultYear> years) {
		this.years = years;
	}

}
