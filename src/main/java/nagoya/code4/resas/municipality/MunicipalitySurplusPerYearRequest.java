package nagoya.code4.resas.municipality;

public class MunicipalitySurplusPerYearRequest extends MunicipalityManufactureAbstractPerYearRequest {
	
	
	public static final String url = "/municipality/surplus/perYear";
	
	private String year ;

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	

}
