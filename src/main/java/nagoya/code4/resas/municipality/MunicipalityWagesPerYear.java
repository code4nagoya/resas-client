package nagoya.code4.resas.municipality;

import nagoya.code4.resas.AbstractResultList;

public class MunicipalityWagesPerYear extends AbstractResultList<MunicipalityWagesPerYearResultData> {
	
	private String sicCode;
	
	private String sicName;
	
	private String simcCode;
	
	private String simcName;
	
	private String prefCode;
	
	private String prefName;

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
	
	
	

}
