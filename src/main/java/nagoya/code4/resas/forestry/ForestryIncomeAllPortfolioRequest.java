package nagoya.code4.resas.forestry;

public class ForestryIncomeAllPortfolioRequest extends AbstractForestryIncomeRequest {

	
	public static final String url ="/forestry/income/allPortfolio";
	
	/** 1 都道府県単位、２：市区町村単位 */
	private String areaType;
	
	/** 2005/2010 のみ可能*/
	private String year;

	public String getAreaType() {
		return areaType;
	}

	public void setAreaType(String areaType) {
		this.areaType = areaType;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	
}
