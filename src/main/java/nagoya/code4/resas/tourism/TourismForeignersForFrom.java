package nagoya.code4.resas.tourism;

import java.util.List;

public class TourismForeignersForFrom {
	
	private String year;
	
	private String quarter;
	
	private String prefCode;
	
	private String prefName;
	
	private String purpose;
	
	private List<TourismForeignersForFromChange> changes;

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

	public List<TourismForeignersForFromChange> getChanges() {
		return changes;
	}

	public void setChanges(List<TourismForeignersForFromChange> changes) {
		this.changes = changes;
	}

}
