package nagoya.code4.resas.agriculture;

import java.util.List;

public class AgricultureLandStacked {

	private String prefCode;

	private String prefName;

	private String cityCode;

	private String cityName;

	private String oldCityCode;

	private String oldCityName;

	private String dispType;

	private String agriculturalLandType;

	private String matter;

	private String label;

	private List<AgricultureLandStackedResultData> years;

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

	public String getDispType() {
		return dispType;
	}

	public void setDispType(String dispType) {
		this.dispType = dispType;
	}

	public String getAgriculturalLandType() {
		return agriculturalLandType;
	}

	public void setAgriculturalLandType(String agriculturalLandType) {
		this.agriculturalLandType = agriculturalLandType;
	}

	public String getMatter() {
		return matter;
	}

	public void setMatter(String matter) {
		this.matter = matter;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List<AgricultureLandStackedResultData> getYears() {
		return years;
	}

	public void setYears(List<AgricultureLandStackedResultData> years) {
		this.years = years;
	}

}
