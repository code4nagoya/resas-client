package nagoya.code4.resas.industry;

import java.util.List;

public class IndustryExpenseForLine {
	
	private String prefCode;
	
	private String prefName;


	private String sicCode;
	
	private String sicName;

	private List<IndustryExpenseForLineLabel> changes;
	
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

	public String getSicCode() {
		return sicCode;
	}

	public void setSicCode(String sicCode) {
		this.sicCode = sicCode;
	}

	public String getSicName() {
		return sicName;
	}

	public void setSicName(String sicName) {
		this.sicName = sicName;
	}

	public List<IndustryExpenseForLineLabel> getChanges() {
		return changes;
	}

	public void setChanges(List<IndustryExpenseForLineLabel> changes) {
		this.changes = changes;
	}
}
