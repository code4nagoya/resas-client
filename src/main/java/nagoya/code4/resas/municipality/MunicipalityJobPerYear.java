package nagoya.code4.resas.municipality;

import nagoya.code4.resas.AbstractResultList;

public class MunicipalityJobPerYear extends AbstractResultList<MunicipalityJobPerYearResultData>{
	
	private String prefName;
	
	private String prefCode;
	
	private String iscoCode;
	
	private String iscoName;
	
	private String ismcoCode;
	
	private String ismcoName;

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

	public String getIscoCode() {
		return iscoCode;
	}

	public void setIscoCode(String iscoCode) {
		this.iscoCode = iscoCode;
	}

	public String getIscoName() {
		return iscoName;
	}

	public void setIscoName(String iscoName) {
		this.iscoName = iscoName;
	}

	public String getIsmcoCode() {
		return ismcoCode;
	}

	public void setIsmcoCode(String ismcoCode) {
		this.ismcoCode = ismcoCode;
	}

	public String getIsmcoName() {
		return ismcoName;
	}

	public void setIsmcoName(String ismcoName) {
		this.ismcoName = ismcoName;
	}
	
	

}
