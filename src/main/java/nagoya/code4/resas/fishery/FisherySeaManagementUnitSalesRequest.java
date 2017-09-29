package nagoya.code4.resas.fishery;

public class FisherySeaManagementUnitSalesRequest extends AbstractFisherySeaRequest {

	public static final String url ="/fishery/sea/managementUnitSales";
	
	
	private	String matter;


	public String getMatter() {
		return matter;
	}


	public void setMatter(String matter) {
		this.matter = matter;
	}
	
	

}
