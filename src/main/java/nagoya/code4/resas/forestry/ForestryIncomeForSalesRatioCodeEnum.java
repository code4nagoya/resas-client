package nagoya.code4.resas.forestry;

public enum ForestryIncomeForSalesRatioCodeEnum {
	
	ToMillion(1),FromMillionTo10Mil(2),From10MilTo50Mil(3),From50MilTo100Mil(4),Over100Mil(5);
	
	private int value ;
	
	
	ForestryIncomeForSalesRatioCodeEnum(int i){
		
		this.value =i;
	}
	
	public int getValue(){
		return value;
	}

}
