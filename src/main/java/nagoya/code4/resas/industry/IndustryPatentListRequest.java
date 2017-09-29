package nagoya.code4.resas.industry;

public class IndustryPatentListRequest {

	public static final String url = "/industry/patent/list";

	/**
	 * 年度
	 * 
	 * 指定可能年度:2014年
	 */
	private String year;

	/**
	 * 1:都道府県市区町村モード
	 * 
	 * 2:特許権者モード
	 */
	private String mode;

	private String prefCode;

	private String cityCode;

	private String patentHolderId;
	/**
	 * ソート1
	 * 
	 * 1:出願番号
	 * 
	 * 2:セクション
	 * 
	 * 3:主題事項
	 * 
	 * 4:FIクラス
	 * 
	 * 5:特許技術テーマ名
	 * 
	 * 6:特許権者
	 * 
	 * 7:出願年月日
	 */
	private String sort1;

	/**
	 * ソート2
	 * 
	 * 1:昇順
	 * 
	 * 2:降順
	 */
	private String sort2;

	private String offset;

	private String addTec;

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
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

	public String getPatentHolderId() {
		return patentHolderId;
	}

	public void setPatentHolderId(String patentHolderId) {
		this.patentHolderId = patentHolderId;
	}

	public String getSort1() {
		return sort1;
	}

	public void setSort1(String sort1) {
		this.sort1 = sort1;
	}

	public String getSort2() {
		return sort2;
	}

	public void setSort2(String sort2) {
		this.sort2 = sort2;
	}

	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

	public String getAddTec() {
		return addTec;
	}

	public void setAddTec(String addTec) {
		this.addTec = addTec;
	}

}
