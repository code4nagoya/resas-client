package nagoya.code4.resas.population;

public class AbtractPopulationMeshRequest {

	private String year;
	private String prefecture_cd;
	private String city_cd;
	private String matter;
	private String displayMethod;

	public AbtractPopulationMeshRequest() {
		super();
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

	public String getCity_cd() {
		return city_cd;
	}

	public void setCity_cd(String city_cd) {
		this.city_cd = city_cd;
	}

	public String getMatter() {
		return matter;
	}

	public void setMatter(String matter) {
		this.matter = matter;
	}

	public String getDisplayMethod() {
		return displayMethod;
	}

	public void setDisplayMethod(String displayMethod) {
		this.displayMethod = displayMethod;
	}

}