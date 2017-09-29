package nagoya.code4.resas.partner;

import java.util.List;

public class PartnerDocomoDesitinationPref {

	
	private String prefCode;
	
	private String prefName;
	
	private String total;
	
	private List<PartnerDocomoDestinationPrefCity> cities;

	public String getPrefCode() {
		return prefCode;
	}

	public void setPrefCode(String prefCode) {
		this.prefCode = prefCode;
	}

	public String getPrefName() {
		return prefName;
	}

	public void setPrefName(String prefName) {
		this.prefName = prefName;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public List<PartnerDocomoDestinationPrefCity> getCities() {
		return cities;
	}

	public void setCities(List<PartnerDocomoDestinationPrefCity> cities) {
		this.cities = cities;
	}
}
