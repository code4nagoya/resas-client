package nagoya.code4.resas.forestry;

import java.util.List;

public class ForestryIncomeForSalesRatio extends AbstractForestryIncome<ForestryIncomeForSalesRatioYear>{
	


	private String matter;
	
	private List<ForestryIncomeForSalesRatioLegend> legend;

	public String getMatter() {
		return matter;
	}

	public void setMatter(String matter) {
		this.matter = matter;
	}

	public List<ForestryIncomeForSalesRatioLegend> getLegend() {
		return legend;
	}

	public void setLegend(List<ForestryIncomeForSalesRatioLegend> legend) {
		this.legend = legend;
	}

}
