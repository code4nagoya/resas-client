package nagoya.code4.resas.industry;

public class IndustrystatisticsDistributionForLineRequest {
	
	public static final String url = "/industry/statisticsDistribution/forLine";
	
	
	private String prefCode;
	
	private String cityCode;
	
	
	private String matter;
	
	private String unit;
	
	private String sicCode;
	
	private String simcCode;
	
	private String siscCode;
	
	
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


	public String getMatter() {
		return matter;
	}


	public void setMatter(String matter) {
		this.matter = matter;
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


	public String getSimcCode() {
		return simcCode;
	}


	public void setSimcCode(String simcCode) {
		this.simcCode = simcCode;
	}


	public String getSiscCode() {
		return siscCode;
	}


	public void setSiscCode(String siscCode) {
		this.siscCode = siscCode;
	}


	public String getAddArea() {
		return addArea;
	}


	public void setAddArea(String addArea) {
		this.addArea = addArea;
	}
	
	
	
	

}
