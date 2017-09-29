package nagoya.code4.resas;

import java.util.List;

public abstract class AbstractResultList<T> {
	
	
	private List<T> data;

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
	
	
}
