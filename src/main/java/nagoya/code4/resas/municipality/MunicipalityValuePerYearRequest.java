package nagoya.code4.resas.municipality;

public class MunicipalityValuePerYearRequest  extends MunicipalityAbstractPerYearRequest{

	
	public static final String url = "/municipality/value/perYear";
	
	private String year;

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
}
