package nagoya.code4.resas.regional;

import nagoya.code4.resas.AbstractResultList;

public class MedicalWelfareCareAnalysisChart extends AbstractResultList<MedicalWelfareCareAnalysisChartResultData> {

	private String sort;

	private String dispType;

	private String matter1;

	private String matter2;

	private String broadCategoryCode;

	private String middleCategoryCode;

	private String year;

	private String prefecture_cd;

	private String municipality_cd;

	private String insurance_cd;

	private String code;



	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getDispType() {
		return dispType;
	}

	public void setDispType(String dispType) {
		this.dispType = dispType;
	}


	public String getMatter1() {
		return matter1;
	}

	public void setMatter1(String matter1) {
		this.matter1 = matter1;
	}

	public String getMatter2() {
		return matter2;
	}

	public void setMatter2(String matter2) {
		this.matter2 = matter2;
	}

	public String getBroadCategoryCode() {
		return broadCategoryCode;
	}

	public void setBroadCategoryCode(String broadCategoryCode) {
		this.broadCategoryCode = broadCategoryCode;
	}

	public String getMiddleCategoryCode() {
		return middleCategoryCode;
	}

	public void setMiddleCategoryCode(String middleCategoryCode) {
		this.middleCategoryCode = middleCategoryCode;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getPrefecture_cd() {
		return prefecture_cd;
	}

	public void setPrefecture_cd(String prefecture_cd) {
		this.prefecture_cd = prefecture_cd;
	}

	public String getMunicipality_cd() {
		return municipality_cd;
	}

	public void setMunicipality_cd(String municipality_cd) {
		this.municipality_cd = municipality_cd;
	}

	public String getInsurance_cd() {
		return insurance_cd;
	}

	public void setInsurance_cd(String insurance_cd) {
		this.insurance_cd = insurance_cd;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
