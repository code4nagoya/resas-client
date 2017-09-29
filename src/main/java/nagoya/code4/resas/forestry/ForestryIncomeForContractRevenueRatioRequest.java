package nagoya.code4.resas.forestry;

public class ForestryIncomeForContractRevenueRatioRequest extends AbstractForestryIncomeRequest{
	
	public static final String url = "/forestry/income/forContractRevenueRatio";
	
	private String matter;

	public String getMatter() {
		return matter;
	}

	public void setMatter(String matter) {
		this.matter = matter;
	}
	
	
	

}
