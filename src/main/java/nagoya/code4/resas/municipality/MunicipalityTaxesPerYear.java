package nagoya.code4.resas.municipality;

import nagoya.code4.resas.AbstractResultList;

public class MunicipalityTaxesPerYear extends AbstractResultList<MunicipalityTaxesPerYearResultData> {
	
	private String prefName;
	
	private String prefCode;
	
	private String cityName;
	
	private String cityCode;

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
	

}
