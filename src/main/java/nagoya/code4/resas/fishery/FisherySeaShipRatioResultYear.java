package nagoya.code4.resas.fishery;

import nagoya.code4.resas.AbstractResultList;

public class FisherySeaShipRatioResultYear extends AbstractResultList<FisherySeaShipRatioResultData>{
	
	private String year;
	
	private String label;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	

}
