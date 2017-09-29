package nagoya.code4.resas.agriculture;

import java.util.List;

public class AbstractAgricultureCrops<T> {

	private String prefCode;
	private String prefName;
	private String cityCode;
	private String cityName;
	private String oldCityCode;
	private String oldCityName;
	private String label;
	private List<T> years;

	public AbstractAgricultureCrops() {
		super();
	}

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

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List<T> getYears() {
		return years;
	}

	public void setYears(List<T> years) {
		this.years = years;
	}

}