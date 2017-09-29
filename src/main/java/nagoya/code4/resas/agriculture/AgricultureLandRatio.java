package nagoya.code4.resas.agriculture;

import java.util.List;

public class AgricultureLandRatio {
	
	private String prefCode;
	
	private String prefName;
	
	private String cityCode;
	
	private String 	cityName;
	
	private String oldCityCode;
	
	private String oldCityName;
	
	private String matter;
	
	private List<AgricultureLandRatioLegend> legend;
	
	private List<AgricultureLandRatioYear> years;

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

	public String getMatter() {
		return matter;
	}

	public void setMatter(String matter) {
		this.matter = matter;
	}
	public List<AgricultureLandRatioYear> getYears() {
		return years;
	}

	public void setYears(List<AgricultureLandRatioYear> years) {
		this.years = years;
	}

	public List<AgricultureLandRatioLegend> getLegend() {
		return legend;
	}

	public void setLegend(List<AgricultureLandRatioLegend> legend) {
		this.legend = legend;
	}
	
	
	

}
