package nagoya.code4.resas.agriculture;

public class AgricultureCropsFarmersAgeStructure extends AbstractAgricultureCrops<AgricultureCropsFarmersAgeLabelAndData>{
	
	private String farmersType;
	
	private String genderType;
	
	private String matter;

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

	public String getMatter() {
		return matter;
	}

	public void setMatter(String matter) {
		this.matter = matter;
	}
	
	
	

}
