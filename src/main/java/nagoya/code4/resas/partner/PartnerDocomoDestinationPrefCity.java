package nagoya.code4.resas.partner;

import java.util.List;

public class PartnerDocomoDestinationPrefCity {
	
	private String cityCode;
	
	private String cityName;
	
	private String total;
	
	private List<PartnerDocomoDestinationPrefCityGender>genders;

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

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public List<PartnerDocomoDestinationPrefCityGender> getGenders() {
		return genders;
	}

	public void setGenders(List<PartnerDocomoDestinationPrefCityGender> genders) {
		this.genders = genders;
	}

	

}
