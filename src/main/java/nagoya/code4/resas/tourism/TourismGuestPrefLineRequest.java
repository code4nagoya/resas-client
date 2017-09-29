package nagoya.code4.resas.tourism;

public class TourismGuestPrefLineRequest {

	public static final String url = "/tourism/guest/prefLine";

	/**
	 * 
	 * 指定可能年度:2013-2015年
	 */
	private String year;

	private String prefCode;

	private String cityCode;

	private String addOppPrefCode;

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

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getAddOppPrefCode() {
		return addOppPrefCode;
	}

	public void setAddOppPrefCode(String addOppPrefCode) {
		this.addOppPrefCode = addOppPrefCode;
	}

}
