package nagoya.code4.resas.municipality;

import java.util.List;

public class MunicipalityFinanceForSettlementAmount {
	
	private String prefCode;
	
	private String prefName;
	
	private String cityCode;
	
	private String cityName;
	
	private String matter;
	
	private List<MunicipalityFinanceForSettlementAmountYear> years;

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

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getMatter() {
		return matter;
	}

	public void setMatter(String matter) {
		this.matter = matter;
	}

	public List<MunicipalityFinanceForSettlementAmountYear> getYears() {
		return years;
	}

	public void setYears(List<MunicipalityFinanceForSettlementAmountYear> years) {
		this.years = years;
	}
	

}
