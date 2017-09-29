package nagoya.code4.resas.fishery;

public class FisherySeaBoatForBoatTypeStacked extends AbstractFisheryYear<FisherySeaBoatForBoatTypeStackedYear>{
	
	private String prefCode;
	
	private String prefName;

	private String cityCode;
	
	private String cityName;
	
	
	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
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
