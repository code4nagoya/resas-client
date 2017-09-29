package nagoya.code4.resas.partner;

import java.util.List;

public class PartnerDocomoDestination {
	
	private String total;
	
	private List<PartnerDocomoDesitinationPref> prefs;

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public List<PartnerDocomoDesitinationPref> getPrefs() {
		return prefs;
	}

	public void setPrefs(List<PartnerDocomoDesitinationPref> prefs) {
		this.prefs = prefs;
	}

}
