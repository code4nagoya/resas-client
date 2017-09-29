package nagoya.code4.resas.agriculture;

import java.util.List;

public class AgricultureCropsFarmersAgeLabelAndData {
	
	private String year;
	
	private String label;
	
	private String unit;

	private List<AgricultureCropsFarmersAgeStructureLegend> legend;
	

	private List<AgricultureCropsFarmersAgeStructureResultData> data;
	
	
	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public String getLabel() {
		return label;
	}


	public void setLabel(String label) {
		this.label = label;
	}


	public String getUnit() {
		return unit;
	}


	public void setUnit(String unit) {
		this.unit = unit;
	}


	public List<AgricultureCropsFarmersAgeStructureLegend> getLegend() {
		return legend;
	}


	public void setLegend(List<AgricultureCropsFarmersAgeStructureLegend> legend) {
		this.legend = legend;
	}


	public List<AgricultureCropsFarmersAgeStructureResultData> getData() {
		return data;
	}


	public void setData(List<AgricultureCropsFarmersAgeStructureResultData> data) {
		this.data = data;
	}


}
