package nagoya.code4.resas.tourism;

import nagoya.code4.resas.AbstractResultList;

public class TourismForeignersForToChange extends AbstractResultList<TourismForeignersForToResultData>{
	
	private String prefCode;
	
	private String prefName;
	
	private String rank;

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

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
	

}
