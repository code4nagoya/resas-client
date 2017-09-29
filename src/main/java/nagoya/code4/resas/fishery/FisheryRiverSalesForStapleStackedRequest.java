package nagoya.code4.resas.fishery;

public class FisheryRiverSalesForStapleStackedRequest {
	
	public static final String url = "/fishery/riverSales/forStapleStacked";

	
	private String prefCode;
	
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
