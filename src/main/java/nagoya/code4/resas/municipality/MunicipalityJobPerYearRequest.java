package nagoya.code4.resas.municipality;

public class MunicipalityJobPerYearRequest {
	
	public static final String url = "/municipality/job/perYear";
	
	private String prefCode;
	
	private String iscoCode;
	
	private String ismcoCode;

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

	public String getIsmcoCode() {
		return ismcoCode;
	}

	public void setIsmcoCode(String ismcoCode) {
		this.ismcoCode = ismcoCode;
	}
	
	

}
