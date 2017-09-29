package nagoya.code4.resas.fishery;

import java.util.List;

public class AbstractFisherySeaSalesLegendAndData<T1, T2> {
	
	private List<T1> legend;
	
	private List<T2> data;

	public List<T1> getLegend() {
		return legend;
	}

	public void setLegend(List<T1> legend) {
		this.legend = legend;
	}

	public List<T2> getData() {
		return data;
	}

	public void setData(List<T2> data) {
		this.data = data;
	}
	

}
