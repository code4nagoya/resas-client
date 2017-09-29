package nagoya.code4.resas.agriculture;

public enum AgricultureCropsFarmersTypeEnum {
	
	
	Farmer(1),Employee(2);

	private int value;
	
	private AgricultureCropsFarmersTypeEnum(int v) {
		this.value = v;
	}
	
	public int getValue(){
		return value;
	}

}
