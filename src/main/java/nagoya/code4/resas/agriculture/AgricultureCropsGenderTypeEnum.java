package nagoya.code4.resas.agriculture;

public enum AgricultureCropsGenderTypeEnum {
	
	
	Total(1),Male(1),Female(2);

	private int value;
	
	private AgricultureCropsGenderTypeEnum(int v) {
		this.value = v;
	}
	
	public int getValue(){
		return value;
	}

}
