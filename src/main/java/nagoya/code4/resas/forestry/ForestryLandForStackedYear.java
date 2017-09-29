package nagoya.code4.resas.forestry;

public class ForestryLandForStackedYear {
	
	private String year;
	
	/** 国有林 公有林ha(ヘクタール) */
	private String privatearea;
	
	/** 民有林 ha */
	private String statearea;

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getPrivatearea() {
		return privatearea;
	}

	public void setPrivatearea(String privatearea) {
		this.privatearea = privatearea;
	}

	public String getStatearea() {
		return statearea;
	}

	public void setStatearea(String statearea) {
		this.statearea = statearea;
	}

}
