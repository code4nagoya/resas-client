package nagoya.code4.resas.industry;

public class IndustryPowerForAreaRequest  {
	

	public static final String url = "/industry/power/forArea";
	
	
	private String year;
	
	private String prefCode;
	
	private String areaType;
	
	private String dispType;
	
	private String sicCode;
	
	private String simcCode;
	
	private String addIndustry;

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

	public String getAreaType() {
		return areaType;
	}

	public void setAreaType(String areaType) {
		this.areaType = areaType;
	}

	public String getDispType() {
		return dispType;
	}

	public void setDispType(String dispType) {
		this.dispType = dispType;
	}

	public String getSicCode() {
		return sicCode;
	}

	public void setSicCode(String sicCode) {
		this.sicCode = sicCode;
	}

	public String getSimcCode() {
		return simcCode;
	}

	public void setSimcCode(String simcCode) {
		this.simcCode = simcCode;
	}

	public String getAddIndustry() {
		return addIndustry;
	}

	public void setAddIndustry(String addIndustry) {
		this.addIndustry = addIndustry;
	}

	public static String getUrl() {
		return url;
	}
	
	

}
