package nagoya.code4.resas;

import java.util.List;

public class PopulationCompositionPyramidSummary {
	
	private String year;
	private String oldAgeCount;
	
	private String oldAgePercent;
	
	private String middleAgeCount;
	
	private String middleAgePercent;
	
	private String newAgeCount;
	
	private String newAgePercent;
	
	private List<PopulationCompositionPyramidData> data;

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getOldAgeCount() {
		return oldAgeCount;
	}

	public void setOldAgeCount(String oldAgeCount) {
		this.oldAgeCount = oldAgeCount;
	}

	public String getOldAgePercent() {
		return oldAgePercent;
	}

	public void setOldAgePercent(String oldAgePercent) {
		this.oldAgePercent = oldAgePercent;
	}

	public String getMiddleAgeCount() {
		return middleAgeCount;
	}

	public void setMiddleAgeCount(String middleAgeCount) {
		this.middleAgeCount = middleAgeCount;
	}

	public String getMiddleAgePercent() {
		return middleAgePercent;
	}

	public void setMiddleAgePercent(String middleAgePercent) {
		this.middleAgePercent = middleAgePercent;
	}

	public String getNewAgeCount() {
		return newAgeCount;
	}

	public void setNewAgeCount(String newAgeCount) {
		this.newAgeCount = newAgeCount;
	}

	public String getNewAgePercent() {
		return newAgePercent;
	}

	public void setNewAgePercent(String newAgePercent) {
		this.newAgePercent = newAgePercent;
	}

	public List<PopulationCompositionPyramidData> getData() {
		return data;
	}

	public void setData(List<PopulationCompositionPyramidData> data) {
		this.data = data;
	}
	
	

}
