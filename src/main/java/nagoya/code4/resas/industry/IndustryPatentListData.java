package nagoya.code4.resas.industry;

public class IndustryPatentListData {

	private String applyNo;

	private String patentSection;

	private String patentSubject;

	private String fiClass;

	private String patentName;

	private String patentHolder;

	private String patentHolderId;

	private String applyDate;

	private String prefCode;

	private String cityCode;
	
	private String lat;
	
	private String lng;

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	/**
	 * 0:共同出願対象ではない
	 * 
	 * 1:同出願対象である （同じ出願番号のレコードが他にもある ＝ 共同出願対象）
	 */
	private String jointlyFlg;

	public String getApplyNo() {
		return applyNo;
	}

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public String getPatentSection() {
		return patentSection;
	}

	public void setPatentSection(String patentSection) {
		this.patentSection = patentSection;
	}

	public String getPatentSubject() {
		return patentSubject;
	}

	public void setPatentSubject(String patentSubject) {
		this.patentSubject = patentSubject;
	}

	public String getFiClass() {
		return fiClass;
	}

	public void setFiClass(String fiClass) {
		this.fiClass = fiClass;
	}

	public String getPatentName() {
		return patentName;
	}

	public void setPatentName(String patentName) {
		this.patentName = patentName;
	}

	public String getPatentHolder() {
		return patentHolder;
	}

	public void setPatentHolder(String patentHolder) {
		this.patentHolder = patentHolder;
	}

	public String getPatentHolderId() {
		return patentHolderId;
	}

	public void setPatentHolderId(String patentHolderId) {
		this.patentHolderId = patentHolderId;
	}

	public String getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
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

	public String getJointlyFlg() {
		return jointlyFlg;
	}

	public void setJointlyFlg(String jointlyFlg) {
		this.jointlyFlg = jointlyFlg;
	}

}
