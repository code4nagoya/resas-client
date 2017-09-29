package nagoya.code4.resas.municipality;

public class MunicipalitySalesPerYearRequest extends MunicipalityManufactureAbstractPerYearRequest {
	
	
	public static final String url = "/municipality/sales/perYear";
	
	private String dispType ;

	public String getDispType() {
		return dispType;
	}

	public void setDispType(String dispType) {
		this.dispType = dispType;
	}
	
	

}
