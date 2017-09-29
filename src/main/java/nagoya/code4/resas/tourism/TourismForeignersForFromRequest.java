package nagoya.code4.resas.tourism;

public class TourismForeignersForFromRequest {

	public static final String url = "/tourism/foreigners/forFrom";

	/**
	 * 指定可能年度:2011-2016年
	 * 
	 * ※2011年は1-3月期のみ指定不可
	 * 
	 * ※2016年は1-3月期のみ指定可能
	 */
	private String year;

	private String prefCode;

	/**
	 * 1:すべての目的
	 * 
	 * 2:観光・レジャー目的
	 */
	private String purpose;

	/**
	 * 
	 */
	private String addArea;

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getPrefCode() {
		return prefCode;
	}

	public void setPrefCode(String prefCode) {
		this.prefCode = prefCode;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getAddArea() {
		return addArea;
	}

	public void setAddArea(String addArea) {
		this.addArea = addArea;
	}

}
