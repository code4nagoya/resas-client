package nagoya.code4.resas.tourism;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TourismGuestPrefLine {
	
	private String prefCode;
	
	private String prefName;
	
	private String cityCode;
	
	private String cityName;
	
	private List<TourismGuestPrefLineChange> changes;
	@JsonProperty("PrefCode")
	public String getPrefCode() {
		return prefCode;
	}
	@JsonProperty("PrefCode")
	public void setPrefCode(String prefCode) {
		this.prefCode = prefCode;
	}

	@JsonProperty("PrefName")
	public String getPrefName() {
		return prefName;
	}
	@JsonProperty("PrefName")
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

	public List<TourismGuestPrefLineChange> getChanges() {
		return changes;
	}

	public void setChanges(List<TourismGuestPrefLineChange> changes) {
		this.changes = changes;
	}

}
