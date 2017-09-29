package nagoya.code4.resas.fishery;

public class FisheryRiverTraderForRiverTraderEmployeeRequest {

	public static final String url = "/fishery/riverTrader/forRiverTraderEmployee";
	
	private String prefCode;
	
	private String matter;
	
	
	private String addArea;

	public String getPrefCode() {
		return prefCode;
	}

	public void setPrefCode(String prefCode) {
		this.prefCode = prefCode;
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
