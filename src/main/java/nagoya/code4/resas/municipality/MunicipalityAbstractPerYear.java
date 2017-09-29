package nagoya.code4.resas.municipality;

import nagoya.code4.resas.AbstractResultList;

public abstract class MunicipalityAbstractPerYear<T> extends AbstractResultList<T> {

	private String prefCode;
	private String prefName;
	private String cityCode;
	private String cityName;
	private String sicName;
	private String sicCode;
	private String simcCode;
	private String simcName;

	public MunicipalityAbstractPerYear() {
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

	public String getSicName() {
		return sicName;
	}

	public void setSicName(String sicName) {
		this.sicName = sicName;
	}

	public String getSicCode() {
		return sicCode;
	}

	public void setSicCode(String sicCode) {
		this.sicCode = sicCode;
	}

	public String getSimcCode() {
		return simcCode;
	}

	public void setSimcCode(String simcCode) {
		this.simcCode = simcCode;
	}

	public String getSimcName() {
		return simcName;
	}

	public void setSimcName(String simcName) {
		this.simcName = simcName;
	}

}