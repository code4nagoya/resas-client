package nagoya.code4.resas.forestry;

public class ForestryLandForStackedRequest {
	
	public static final String url = "/forestry/land/forStacked";
	
	
	private String prefCode;
	
	private String cityCode;
	
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

	public String getAddArea() {
		return addArea;
	}

	public void setAddArea(String addArea) {
		this.addArea = addArea;
	}
	
	

}
