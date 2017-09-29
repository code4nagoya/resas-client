package nagoya.code4.resas;

import java.util.List;

public class AbstractListResult<T> {

	protected String message;
	protected List<T> result;

	public AbstractListResult() {
		super();
	}

	public List<T> getResult() {
		return result;
	}
	public void setResult(List<T> result) {
		this.result = result;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}