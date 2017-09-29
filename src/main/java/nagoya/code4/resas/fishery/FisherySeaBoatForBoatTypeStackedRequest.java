package nagoya.code4.resas.fishery;

public class FisherySeaBoatForBoatTypeStackedRequest {
	
	public static final String url ="/fishery/seaBoat/forBoatTypeStacked";
	
	private String prefCode;
	
	private String cityCode;
	
	
	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	private String addArea;

	public String getPrefCode() {
		return prefCode;
	}

	public void setPrefCode(String prefCode) {
		this.prefCode = prefCode;
	}

	public String getAddArea() {
		return addArea;
	}

	public void setAddArea(String addArea) {
		this.addArea = addArea;
	}
	
	

}
