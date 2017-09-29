package nagoya.code4.resas.partner;

import java.util.List;

public class PartnerDocomoResidencePrefCity {
	
	private String cityCode;
	
	private String cityName;
	
	private String total;
	
	private List<PartnerDocomoResidencePrefCityGender>genders;

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

	public List<PartnerDocomoResidencePrefCityGender> getGenders() {
		return genders;
	}

	public void setGenders(List<PartnerDocomoResidencePrefCityGender> genders) {
		this.genders = genders;
	}

	

}
