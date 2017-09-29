package nagoya.code4.resas.industry;

public class IndustryExportFromToRequest {
	
	public static final String url = "/industry/export/fromTo";

	
	private String year	;
	
	private String dataType;
	
	private String unitType;
	
	private String dispType;
	
	private String regionCode;
	
	private String countryCode;
	
	private String itemCode1;
	
	private String itemCode2;
	
	private String itemCode3;
	
	private String customsCode1;
	
	private String customsCode2;

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getUnitType() {
		return unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	public String getDispType() {
		return dispType;
	}

	public void setDispType(String dispType) {
		this.dispType = dispType;
	}

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getItemCode1() {
		return itemCode1;
	}

	public void setItemCode1(String itemCode1) {
		this.itemCode1 = itemCode1;
	}

	public String getItemCode2() {
		return itemCode2;
	}

	public void setItemCode2(String itemCode2) {
		this.itemCode2 = itemCode2;
	}

	public String getItemCode3() {
		return itemCode3;
	}

	public void setItemCode3(String itemCode3) {
		this.itemCode3 = itemCode3;
	}

	public String getCustomsCode1() {
		return customsCode1;
	}

	public void setCustomsCode1(String customsCode1) {
		this.customsCode1 = customsCode1;
	}

	public String getCustomsCode2() {
		return customsCode2;
	}

	public void setCustomsCode2(String customsCode2) {
		this.customsCode2 = customsCode2;
	}
	
	
}
