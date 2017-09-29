package nagoya.code4.resas.agriculture;

public class AgricultureLandForMobilityRequest {
	
	public static final String url = "/agriculture/land/forMobility";
	
	private String prefCode;
	
	private String cityCode;
	
	private String oldCityCode;
	
	private String agriculturalLandType;
	
	private String matter;

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

	public String getOldCityCode() {
		return oldCityCode;
	}

	public void setOldCityCode(String oldCityCode) {
		this.oldCityCode = oldCityCode;
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
	
	
	
	

}
