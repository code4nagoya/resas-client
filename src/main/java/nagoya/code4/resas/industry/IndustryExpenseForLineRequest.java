package nagoya.code4.resas.industry;

public class IndustryExpenseForLineRequest {

	public static final String url = "/industry/expense/forLine";

	private String prefCode;

	/**
	 * 1:研究開発費で表示する
	 *  2:企業数で表示する
	 * 
	 */
	private String dispType;

	/**
	 * 1:実数で表示する
	 * 
	 * 2:1企業あたりで表示する
	 * 
	 * 3:対売上高比率で表示する
	 */
	private String unit;

	/**
	 * 0:すべての産業
	 * 
	 * 1:製造業
	 * 
	 * 2:非製造業
	 */
	private String sicCode;

	private String addArea;

	public String getPrefCode() {
		return prefCode;
	}

	public void setPrefCode(String prefCode) {
		this.prefCode = prefCode;
	}

	public String getDispType() {
		return dispType;
	}

	public void setDispType(String dispType) {
		this.dispType = dispType;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getSicCode() {
		return sicCode;
	}

	public void setSicCode(String sicCode) {
		this.sicCode = sicCode;
	}

	public String getAddArea() {
		return addArea;
	}

	public void setAddArea(String addArea) {
		this.addArea = addArea;
	}

}
