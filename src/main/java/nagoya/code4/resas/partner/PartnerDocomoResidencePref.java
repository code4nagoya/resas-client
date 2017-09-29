package nagoya.code4.resas.partner;

import java.util.List;

public class PartnerDocomoResidencePref {

	
	private String prefCode;
	
	private String prefName;
	
	private String total;
	
	private List<PartnerDocomoResidencePrefCity> cities;

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

	public List<PartnerDocomoResidencePrefCity> getCities() {
		return cities;
	}

	public void setCities(List<PartnerDocomoResidencePrefCity> cities) {
		this.cities = cities;
	}
}
