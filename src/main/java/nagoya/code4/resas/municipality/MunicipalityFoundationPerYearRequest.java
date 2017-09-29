package nagoya.code4.resas.municipality;

public class MunicipalityFoundationPerYearRequest {
	
	public static String url = "/municipality/foundation/perYear";
	
	private String prefCode;
	
	private String cityCode;

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
	
	

}
