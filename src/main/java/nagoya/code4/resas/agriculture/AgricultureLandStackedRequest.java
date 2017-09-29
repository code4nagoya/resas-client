package nagoya.code4.resas.agriculture;

public class AgricultureLandStackedRequest {

	public static final String url ="/agriculture/land/forStacked";

	
	private String prefCode;
	
	private String cityCode;
	
	private String oldCityCode;
	
	private String sectionCode;
	
	private String dispType;
	
	private String agriculturalLandType;
	
	private String matter;
	
	private String addArea;

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

	public String getSectionCode() {
		return sectionCode;
	}

	public void setSectionCode(String sectionCode) {
		this.sectionCode = sectionCode;
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

	public String getAddArea() {
		return addArea;
	}

	public void setAddArea(String addArea) {
		this.addArea = addArea;
	}
	
	
	
}
