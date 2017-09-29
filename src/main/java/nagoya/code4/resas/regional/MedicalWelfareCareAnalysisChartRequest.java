package nagoya.code4.resas.regional;

public class MedicalWelfareCareAnalysisChartRequest {

	public static final String url = "/medicalWelfare/careAnalysis/chart";
	/**
	 * 年度
	 * 
	 * 指定可能年度:2012-2015年
	 */
	private String year;
	/**
	 * 表示方法
	 * 
	 * 1 : 実数で表示する
	 * 
	 * 2 : 65歳以上人口10万人あたりで表示する
	 */
	private String disp_type;
	/**
	 * ソート順
	 * 
	 * 1 : 降順
	 * 
	 * 2 : コード順
	 */

	private String sort_type;
	/**
	 * 表示内容(大分類)
	 * 
	 * 1 : 介護需要
	 * 
	 * 2 : 介護供給
	 * 
	 * 3 : 介護保険料・介護費用
	 */

	private String matter_1;
	/**
	 * 表示内容(中分類)
	 * 
	 * 101 : 介護サービス利用者数
	 * 
	 * 102 : 要介護（要支援）認定者数
	 * 
	 * 201 : 施設・事業所数
	 * 
	 * 202 : 定員数
	 * 
	 * 203 : 介護職員数
	 * 
	 * 204 : 看護職員数
	 * 
	 * 301 : 介護保険料（65歳以上の被保険者）
	 * 
	 * 302 : 介護費用
	 */

	private String matter_2;
	/**
	 * 表示分類コード(大分類)
	 * 
	 * 1 : 居宅サービス
	 * 
	 * 2 : 住居系サービス
	 * 
	 * 3 : 施設サービス
	 */

	private String broad_category_cd;

	/**
	 * 表示分類コード(中分類)
	 * 
	 * 100 : (居宅サービス選択時)すべての中分類
	 * 
	 * 101 : 訪問介護・介護予防訪問介護
	 * 
	 * 102 : 訪問入浴介護・介護予防訪問入浴介護
	 * 
	 * 103 : 訪問看護・介護予防訪問看護
	 * 
	 * 104 : 訪問リハビリテーション・介護予防訪問リハビリテーション
	 * 
	 * 200 : (住居系サービス)すべての中分類
	 * 
	 * 201 : 認知症対応型共同生活介護
	 * 
	 * 202 : 特定施設入居者生活介護・介護予防特定施設入居者生活介護
	 * 
	 * 203 : 地域密着型特定施設入居者生活介護
	 * 
	 * 300 : (施設サービス)すべての中分類
	 * 
	 * 301 : 介護老人福祉施設
	 * 
	 * 302 : 介護老人保険施設
	 * 
	 * 303 : 介護療養型医療施設
	 * 
	 * 304 : 地域密着型介護老人福祉施設入所者生活介護
	 */
	private String middle_category_cd;

	/**
	 * 
	 */
	private String prefCode;

	private String cityCode;

	/**
	 * 保険者コード
	 * 
	 * （非表示：－）
	 */
	private String insuranceCode;

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDisp_type() {
		return disp_type;
	}

	public void setDisp_type(String disp_type) {
		this.disp_type = disp_type;
	}

	public String getSort_type() {
		return sort_type;
	}

	public void setSort_type(String sort_type) {
		this.sort_type = sort_type;
	}

	public String getMatter_1() {
		return matter_1;
	}

	public void setMatter_1(String matter_1) {
		this.matter_1 = matter_1;
	}

	public String getMatter_2() {
		return matter_2;
	}

	public void setMatter_2(String matter_2) {
		this.matter_2 = matter_2;
	}

	public String getBroad_category_cd() {
		return broad_category_cd;
	}

	public void setBroad_category_cd(String broad_category_cd) {
		this.broad_category_cd = broad_category_cd;
	}

	public String getMiddle_category_cd() {
		return middle_category_cd;
	}

	public void setMiddle_category_cd(String middle_category_cd) {
		this.middle_category_cd = middle_category_cd;
	}

	public String getPrefCode() {
		return prefCode;
	}

	public void setPrefCode(String prefCode) {
		this.prefCode = prefCode;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getInsuranceCode() {
		return insuranceCode;
	}

	public void setInsuranceCode(String insuranceCode) {
		this.insuranceCode = insuranceCode;
	}

	public static String getUrl() {
		return url;
	}

}
