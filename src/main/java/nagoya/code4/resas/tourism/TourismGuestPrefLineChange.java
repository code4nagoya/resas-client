package nagoya.code4.resas.tourism;

import nagoya.code4.resas.AbstractResultList;

public class TourismGuestPrefLineChange extends AbstractResultList<TourismGuestPrefLineResultData>{
	
	private String oppPrefCode;
	
	private String oppPrefName;
	
	private String rank;

	public String getOppPrefCode() {
		return oppPrefCode;
	}

	public void setOppPrefCode(String oppPrefCode) {
		this.oppPrefCode = oppPrefCode;
	}

	public String getOppPrefName() {
		return oppPrefName;
	}

	public void setOppPrefName(String oppPrefName) {
		this.oppPrefName = oppPrefName;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	

}
