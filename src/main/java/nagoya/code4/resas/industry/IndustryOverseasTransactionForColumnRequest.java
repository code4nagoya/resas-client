package nagoya.code4.resas.industry;

public class IndustryOverseasTransactionForColumnRequest {
	
	public static final String url ="/industry/overseasTransaction/forColumn";
	
	
	private String prefCode;
	
	private String dispTradeCode;
	
	private String dispIndustryCode;
	
	private String addArea;

	public String getPrefCode() {
		return prefCode;
	}

	public void setPrefCode(String prefCode) {
		this.prefCode = prefCode;
	}

	public String getDispTradeCode() {
		return dispTradeCode;
	}

	public void setDispTradeCode(String dispTradeCode) {
		this.dispTradeCode = dispTradeCode;
	}

	public String getDispIndustryCode() {
		return dispIndustryCode;
	}

	public void setDispIndustryCode(String dispIndustryCode) {
		this.dispIndustryCode = dispIndustryCode;
	}

	public String getAddArea() {
		return addArea;
	}

	public void setAddArea(String addArea) {
		this.addArea = addArea;
	}
	
	

}
