package nagoya.code4.resas.townplanning;

public class TownPlanningCommuteSchoolAreaPopulationCircleRequest {
	
	public static final String url = "/townPlanning/commuteSchool/areaPopulationCircle";
	
	// 都道府県コード
	private String prefecture_cd;
	
	private String city_cd;
	
	private String mode;
	
	private String year;

	public String getPrefecture_cd() {
		return prefecture_cd;
	}

	public void setPrefecture_cd(String prefecture_cd) {
		this.prefecture_cd = prefecture_cd;
	}

	public String getCity_cd() {
		return city_cd;
	}

	public void setCity_cd(String city_cd) {
		this.city_cd = city_cd;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	
	

}
