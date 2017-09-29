package nagoya.code4.resas.partner;

import java.util.List;

public class PartnerDocomoResidencePrefCityGender {
	
	private String gender;
	
	private String total;
	
	private List<PartnerDocomoResidencePrefCityGenderAgeRange> ageRanges;

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

	public List<PartnerDocomoResidencePrefCityGenderAgeRange> getAgeRanges() {
		return ageRanges;
	}

	public void setAgeRanges(List<PartnerDocomoResidencePrefCityGenderAgeRange> ageRanges) {
		this.ageRanges = ageRanges;
	}

}
