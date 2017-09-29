package nagoya.code4.resas.industry;

import java.util.List;

import nagoya.code4.resas.AbstractResultList;

public class IndustryOverseasTransactionForColumn extends AbstractResultList<IndustryOverseasTranctionForColumnResultData>{
	
	
	private String prefCode;
	
	private String prefName;
	
	private String sicCode;
	
	private String sicName;
	
	private List<IndustryOverseasTranctionForColumnResultData> sum_data;

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

	public List<IndustryOverseasTranctionForColumnResultData> getSum_data() {
		return sum_data;
	}

	public void setSum_data(List<IndustryOverseasTranctionForColumnResultData> sum_data) {
		this.sum_data = sum_data;
	}
	
}
