package nagoya.code4.resas.tourism;

import nagoya.code4.resas.AbstractResultList;

public class TourismForeignersForFromChange extends AbstractResultList<TourismForeignersForFromResultData> {
	
	private String countryCode;
	
	private String countryName;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	

}
