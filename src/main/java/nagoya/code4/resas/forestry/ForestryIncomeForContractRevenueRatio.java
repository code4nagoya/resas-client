package nagoya.code4.resas.forestry;

import java.util.List;

public class ForestryIncomeForContractRevenueRatio extends AbstractForestryIncome<ForestryIncomeForContractRevenueRatioYear>{
	


	private String matter;
	
	private List<ForestryIncomeForContractRevenueRatioLegend> legend;

	public String getMatter() {
		return matter;
	}

	public void setMatter(String matter) {
		this.matter = matter;
	}

	public List<ForestryIncomeForContractRevenueRatioLegend> getLegend() {
		return legend;
	}

	public void setLegend(List<ForestryIncomeForContractRevenueRatioLegend> legend) {
		this.legend = legend;
	}

}
