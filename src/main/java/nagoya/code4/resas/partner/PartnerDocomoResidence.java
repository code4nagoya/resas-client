package nagoya.code4.resas.partner;

import java.util.List;

public class PartnerDocomoResidence {
	
	private String total;
	
	private List<PartnerDocomoResidencePref> prefs;

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public List<PartnerDocomoResidencePref> getPrefs() {
		return prefs;
	}

	public void setPrefs(List<PartnerDocomoResidencePref> prefs) {
		this.prefs = prefs;
	}

}
