package nagoya.code4.resas.industry;

import java.util.List;

public class IndustryStatisticsDistribution {
	
	private String prefCode;
	
	private String prefName;
	
	private String cityCode;
	
	private String cityName;
	
	private String year;
	
	private String sicCode;
	
	private String sicName;
	
	private String simcCode;
	
	private String simcName;
	
	private String siscCode;
	
	private String siscName;
	
	private List<IndustryStatisticsDistributionLabel> changes;

	public String getPrefCode() {
		return prefCode;
	}

	public void setPrefCode(String prefCode) {
		this.prefCode = prefCode;
	}

	public String getPrefName() {
		return prefName;
	}

	public void setPrefName(String prefName) {
		this.prefName = prefName;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getSicCode() {
		return sicCode;
	}

	public void setSicCode(String sicCode) {
		this.sicCode = sicCode;
	}

	public String getSicName() {
		return sicName;
	}

	public void setSicName(String sicName) {
		this.sicName = sicName;
	}

	public String getSimcCode() {
		return simcCode;
	}

	public void setSimcCode(String simcCode) {
		this.simcCode = simcCode;
	}

	public String getSimcName() {
		return simcName;
	}

	public void setSimcName(String simcName) {
		this.simcName = simcName;
	}

	public String getSiscCode() {
		return siscCode;
	}

	public void setSiscCode(String siscCode) {
		this.siscCode = siscCode;
	}

	public String getSiscName() {
		return siscName;
	}

	public void setSiscName(String siscName) {
		this.siscName = siscName;
	}

	public List<IndustryStatisticsDistributionLabel> getChanges() {
		return changes;
	}

	public void setChanges(List<IndustryStatisticsDistributionLabel> changes) {
		this.changes = changes;
	}

}
