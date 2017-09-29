package nagoya.code4.resas.agriculture;

public class AbstractAgricultureCropsFarmersAgeRequest {

	private String prefCode;
	private String cityCode;
	private String oldCityCode;
	private String farmersType;
	private String genderType;
	private String matter;
	private String addArea;

	public AbstractAgricultureCropsFarmersAgeRequest() {
		super();
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

	public String getOldCityCode() {
		return oldCityCode;
	}

	public void setOldCityCode(String oldCityCode) {
		this.oldCityCode = oldCityCode;
	}

	public String getFarmersType() {
		return farmersType;
	}

	public void setFarmersType(String farmersType) {
		this.farmersType = farmersType;
	}

	public String getGenderType() {
		return genderType;
	}

	public void setGenderType(String genderType) {
		this.genderType = genderType;
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