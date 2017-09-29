package nagoya.code4.resas.agriculture;

public class AgricultureSalesShipValueRequest {
	
	
	public static final String url ="/agriculture/sales/shipValue";
	

	
	private String prefCode;
	
	private String cityCode;
	
	private String oldCityCode;
	
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

	public String getAddArea() {
		return addArea;
	}

	public void setAddArea(String addArea) {
		this.addArea = addArea;
	}
	
	
}
