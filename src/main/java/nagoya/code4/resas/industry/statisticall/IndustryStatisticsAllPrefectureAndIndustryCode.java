package nagoya.code4.resas.industry.statisticall;

import java.util.List;

public class IndustryStatisticsAllPrefectureAndIndustryCode {
	
	private String prefCode;
	
	private String prefName;
	private String cityCode;
	private String cityName;
	
	private String matter;
	
	private String sicCode;
	
	private String simcCode;
	
	private List<IndustryStatisticsForAllEntireStackInductryCode> changes;

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

	public String getMatter() {
		return matter;
	}

	public void setMatter(String matter) {
		this.matter = matter;
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

	public List<IndustryStatisticsForAllEntireStackInductryCode> getChanges() {
		return changes;
	}

	public void setChanges(List<IndustryStatisticsForAllEntireStackInductryCode> changes) {
		this.changes = changes;
	}

}
