package nagoya.code4.resas.partner;

public class PartnerDocomoDestinationRequest {

	public static final String url = "/partner/docomo/destination";

	private String year;

	private String month;

	/**
	 * 平休日コード
	 * 
	 * 1.平日 2.休日
	 */
	private String periodOfDay;

	/**
	 * 4:4時台 10:10時台 14:14時台 20:20時台
	 * 
	 */
	private String periodOfTime;
	/**
	 * 1: 男性 2: 女性 -: 指定なし
	 * 
	 */
	private String gender;

	/**
	 * 15 : 15 ～ 19歳 20 : 20 ～ 29歳 30 : 30 ～ 39歳 40 : 40 ～ 49歳 50 : 50 ～ 59歳 60
	 * : 60 ～ 69歳 70 : 70 ～ 79歳 - : 指定無し
	 */
	private String ageRange;
	
	private String prefCodeDestination;
	
	private String cityCodeDestination;
	
	private String prefCodeResidence;
	
	private String cityCodeResidence;

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getPeriodOfDay() {
		return periodOfDay;
	}

	public void setPeriodOfDay(String periodOfDay) {
		this.periodOfDay = periodOfDay;
	}

	public String getPeriodOfTime() {
		return periodOfTime;
	}

	public void setPeriodOfTime(String periodOfTime) {
		this.periodOfTime = periodOfTime;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAgeRange() {
		return ageRange;
	}

	public void setAgeRange(String ageRange) {
		this.ageRange = ageRange;
	}

	public String getPrefCodeDestination() {
		return prefCodeDestination;
	}

	public void setPrefCodeDestination(String prefCodeDestination) {
		this.prefCodeDestination = prefCodeDestination;
	}

	public String getCityCodeDestination() {
		return cityCodeDestination;
	}

	public void setCityCodeDestination(String cityCodeDestination) {
		this.cityCodeDestination = cityCodeDestination;
	}

	public String getPrefCodeResidence() {
		return prefCodeResidence;
	}

	public void setPrefCodeResidence(String prefCodeResidence) {
		this.prefCodeResidence = prefCodeResidence;
	}

	public String getCityCodeResidence() {
		return cityCodeResidence;
	}

	public void setCityCodeResidence(String cityCodeResidence) {
		this.cityCodeResidence = cityCodeResidence;
	}
	

}
