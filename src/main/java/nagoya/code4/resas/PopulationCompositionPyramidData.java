package nagoya.code4.resas;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PopulationCompositionPyramidData {

	private String classname;

	private String man;

	private String manPercent;

	private String woman;

	private String womanPercent;

	@JsonProperty("class")
	public String getClassname() {
		return classname;
	}

	@JsonProperty("class")
	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getMan() {
		return man;
	}

	public void setMan(String man) {
		this.man = man;
	}

	public String getManPercent() {
		return manPercent;
	}

	public void setManPercent(String manPercent) {
		this.manPercent = manPercent;
	}

	public String getWoman() {
		return woman;
	}

	public void setWoman(String woman) {
		this.woman = woman;
	}

	public String getWomanPercent() {
		return womanPercent;
	}

	public void setWomanPercent(String womanPercent) {
		this.womanPercent = womanPercent;
	}

}
