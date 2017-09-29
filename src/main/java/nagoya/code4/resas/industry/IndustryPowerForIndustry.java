package nagoya.code4.resas.industry;

import nagoya.code4.resas.AbstractResultList;

public class IndustryPowerForIndustry extends AbstractResultList<IndustryPowerForIndustryResultData> {
	
	private String prefName;
	
	private String prefCode;
	
	private String sicCode;
	
	private String sicName;

	public String getPrefName() {
		return prefName;
	}

	public void setPrefName(String prefName) {
		this.prefName = prefName;
	}

	public String getPrefCode() {
		return prefCode;
	}

	public void setPrefCode(String prefCode) {
		this.prefCode = prefCode;
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
	
	

}
