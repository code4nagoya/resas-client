package nagoya.code4.resas.industry;

public class IndustryPowerForIndustryRequest {
	
	public static final String url = "/industry/power/forIndustry";

	
	private String year;
	
	private String prefCode;
	
	private String cityCode;
	
	private String sicCode;

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

	public String getSicCode() {
		return sicCode;
	}

	public void setSicCode(String sicCode) {
		this.sicCode = sicCode;
	}
	
	
}
