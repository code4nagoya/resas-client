package nagoya.code4.resas.fishery;

import java.util.List;

public class AbstractFisheryYear<T> {

	private List<T> years;

	public List<T> getYears() {
		return years;
	}

	public void setYears(List<T> years) {
		this.years = years;
	}

}
