package nagoya.code4.resas.forestry;

public abstract class AbstractForestryIncomeRequest {

	private String cityCode;
	
	private String prefCode;
	
	private String addArea;
	

	public String getAddArea() {
		return addArea;
	}

	public void setAddArea(String addArea) {
		this.addArea = addArea;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getPrefCode() {
		return prefCode;
	}

	public void setPrefCode(String prefCode) {
		this.prefCode = prefCode;
	}
	

}