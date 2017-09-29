package nagoya.code4.resas;

public abstract class AbstractSimpleResult<T> {

	protected String message;
	protected T result;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}

}
