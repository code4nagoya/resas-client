package nagoya.code4.resas.tourism;

public class TourismAttractionsRequest {
	
	public static final String url = "/tourism/attractions";
	
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
