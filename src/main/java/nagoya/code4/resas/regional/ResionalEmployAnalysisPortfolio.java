package nagoya.code4.resas.regional;

import com.fasterxml.jackson.annotation.JsonProperty;

import nagoya.code4.resas.AbstractResultList;

public class ResionalEmployAnalysisPortfolio extends AbstractResultList<ResionalEmployAnalysisPortfolioResultData>{

	private String prefCode;

	private String prefName;

	private String year;

	private String matter;

	private String clazz;
	
	private String allcount;
	
	private String otherscount;
	

	public String getAllcount() {
		return allcount;
	}

	public void setAllcount(String allcount) {
		this.allcount = allcount;
	}

	public String getOtherscount() {
		return otherscount;
	}

	public void setOtherscount(String otherscount) {
		this.otherscount = otherscount;
	}

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

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMatter() {
		return matter;
	}

	public void setMatter(String matter) {
		this.matter = matter;
	}

	@JsonProperty(value = "class")
	public String getClazz() {
		return clazz;
	}

	@JsonProperty(value = "class")
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

}
