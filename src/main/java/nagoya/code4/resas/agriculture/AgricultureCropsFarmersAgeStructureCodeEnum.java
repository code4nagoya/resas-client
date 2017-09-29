package nagoya.code4.resas.agriculture;

public enum AgricultureCropsFarmersAgeStructureCodeEnum {
	
	fifteenthTo24(1),
	twentyFifthTo34(2),
	thirtyFifthTo44(3),
	fourtyFifthTo55(4),
	fiftyFifthTo64(5),
	sixtyFifthTo74(6),
	over75(7);
	

	private int value;
	
	private AgricultureCropsFarmersAgeStructureCodeEnum(int v) {
		this.value = v;
	}
	
	public int getValue(){
		return value;
	}
}
