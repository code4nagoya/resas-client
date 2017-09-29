package nagoya.code4.resas.tourism;

import java.util.List;

public class TourismForeignersForTo {

	private String year;

	private String quarter;
	
	private String regionCode;
	
	private String regionName;

	private String countryCode;
	
	private String countryName;
	
	
	private String prefCode;

	private String prefName;

	private String purpose;

	private List<TourismForeignersForToChange> changes;

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getQuarter() {
		return quarter;
	}

	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

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

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public List<TourismForeignersForToChange> getChanges() {
		return changes;
	}

	public void setChanges(List<TourismForeignersForToChange> changes) {
		this.changes = changes;
	}

}
