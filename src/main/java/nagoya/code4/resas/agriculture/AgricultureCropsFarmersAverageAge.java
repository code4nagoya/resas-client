package nagoya.code4.resas.agriculture;

public class AgricultureCropsFarmersAverageAge extends AbstractAgricultureCrops<AgricultureCropsFarmersAvarageAgeResultData>{
	
	private String matter;

	private String farmersType;
	
	private String genderType;

	public String getMatter() {
		return matter;
	}

	public void setMatter(String matter) {
		this.matter = matter;
	}

	public String getFarmersType() {
		return farmersType;
	}

	public void setFarmersType(String farmersType) {
		this.farmersType = farmersType;
	}

	public String getGenderType() {
		return genderType;
	}

	public void setGenderType(String genderType) {
		this.genderType = genderType;
	}
	
	
	

}
