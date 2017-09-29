package nagoya.code4.resas.partner;

import java.util.List;

public class PartnerDocomoDestinationPrefCityGender {
	
	private String gender;
	
	private String total;
	
	private List<PartnerDocomoDestinationPrefCityGenderAgeRange> ageRanges;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public List<PartnerDocomoDestinationPrefCityGenderAgeRange> getAgeRanges() {
		return ageRanges;
	}

	public void setAgeRanges(List<PartnerDocomoDestinationPrefCityGenderAgeRange> ageRanges) {
		this.ageRanges = ageRanges;
	}

}
