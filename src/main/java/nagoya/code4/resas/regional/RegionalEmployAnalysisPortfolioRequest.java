package nagoya.code4.resas.regional;

public class RegionalEmployAnalysisPortfolioRequest {

	public static final String url = "/regionalEmploy/analysis/portfolio";

	private String prefCode;

	/**
	 * 指定可能年度:2012-2015年
	 */
	private String year;
	/**
	 * 表示内容
	 * 
	 * 1．有効求職者数（総数）
	 * 
	 * 2．有効求職者数（男性）
	 * 
	 * 3．有効求職者数（女性）
	 * 
	 * 4．有効求人数
	 * 
	 * 5．就職件数
	 */
	private String matter;

	/**
	 * 1．職業大分類で見る
	 * 
	 * 2．職業中分類で見る
	 */
	private String clazz;

}
