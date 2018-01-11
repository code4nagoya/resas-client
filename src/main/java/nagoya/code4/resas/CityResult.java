package nagoya.code4.resas;

public class CityResult implements City {
	
	private String prefCode;
	private String cityCode;
	private String cityName;
	private String bigCityFlag;
	
	/* (non-Javadoc)
	 * @see nagoya.code4.resas.City#getPrefCode()
	 */
	public String getPrefCode() {
		return prefCode;
	}
	public void setPrefCode(String prefCode) {
		this.prefCode = prefCode;
	}
	/* (non-Javadoc)
	 * @see nagoya.code4.resas.City#getCityCode()
	 */
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	/* (non-Javadoc)
	 * @see nagoya.code4.resas.City#getCityName()
	 */
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	/* (non-Javadoc)
	 * @see nagoya.code4.resas.City#getBigCityFlag()
	 */
	public String getBigCityFlag() {
		return bigCityFlag;
	}
	public void setBigCityFlag(String bigCityFlag) {
		this.bigCityFlag = bigCityFlag;
	}

}
