package nagoya.code4.resas.fishery;

public class FisherySeaTraderForEmployeeRequest {
	
	public static final String url ="/fishery/seaTrader/forEmployee";
	
	private String prefCode;
	
	private String cityCode;
	
	private String matter;

	private String addArea;

	
	public String getMatter() {
		return matter;
	}

	public void setMatter(String matter) {
		this.matter = matter;
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

	public String getAddArea() {
		return addArea;
	}

	public void setAddArea(String addArea) {
		this.addArea = addArea;
	}
	
	

}
