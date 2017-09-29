package nagoya.code4.resas.municipality;

public class MunicipalityTaxesPerYearRequest {
	
	public static final String url ="/municipality/taxes/perYear";
	
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
