package nagoya.code4.resas.townplanning;

import java.util.List;

public class TownPlanningCommuteSchoolAreaPopulationCircle {
	
	private String year;
	
	private String pref;
	
	private String city;
	
	private String mode;
	
	private String noonDataSum;
	
	private String nightDataSum;
	
	private String dayNightRate;
	
	private List<TownPlanningCommuteCircleNoonData> noonData;
	

	private List<TownPlanningCommuteCircleNightData> nightData;


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public String getPref() {
		return pref;
	}


	public void setPref(String pref) {
		this.pref = pref;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getMode() {
		return mode;
	}


	public void setMode(String mode) {
		this.mode = mode;
	}


	public String getNoonDataSum() {
		return noonDataSum;
	}


	public void setNoonDataSum(String noonDataSum) {
		this.noonDataSum = noonDataSum;
	}


	public String getNightDataSum() {
		return nightDataSum;
	}


	public void setNightDataSum(String nightDataSum) {
		this.nightDataSum = nightDataSum;
	}


	public String getDayNightRate() {
		return dayNightRate;
	}


	public void setDayNightRate(String dayNightRate) {
		this.dayNightRate = dayNightRate;
	}


	public List<TownPlanningCommuteCircleNoonData> getNoonData() {
		return noonData;
	}


	public void setNoonData(List<TownPlanningCommuteCircleNoonData> noonData) {
		this.noonData = noonData;
	}


	public List<TownPlanningCommuteCircleNightData> getNightData() {
		return nightData;
	}


	public void setNightData(List<TownPlanningCommuteCircleNightData> nightData) {
		this.nightData = nightData;
	}

}
