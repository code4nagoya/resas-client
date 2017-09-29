package nagoya.code4.resas.fishery;

public class FisherySeaAquacultureManagementUnitSalesRequest extends AbstractFisherySeaRequest {

	public static final String url ="/fishery/sea/aquacultureManagementUnitSales";
	
	
	private	String matter;


	public String getMatter() {
		return matter;
	}


	public void setMatter(String matter) {
		this.matter = matter;
	}
	
	

}
