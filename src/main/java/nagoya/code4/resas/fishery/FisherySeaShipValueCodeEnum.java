package nagoya.code4.resas.fishery;

public enum FisherySeaShipValueCodeEnum {
	
	GyokyouMarket(1),GyokyouIgai(2),RyuutuuKakou(3),Kouri(4),Seikyou(5),Tyokubai(6),Jikahanbai(7),Sonota(8);
	
	int value;
	
	private FisherySeaShipValueCodeEnum(int v) {
		
		this.value = v;
		
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	

}
