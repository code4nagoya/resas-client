package nagoya.code4.resas;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PopulationSumPerYearList extends AbstractResultList<PopulationSumPerYearResultData> {

	private String sum;
	
	private String year;
	
	
	
	public String getSum() {
		return sum;
	}

	public void setSum(String sum) {
		this.sum = sum;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@JsonProperty("class")
	@Override
	public List<PopulationSumPerYearResultData> getData() {
		// TODO Auto-generated method stub
		return super.getData();
	}

	@JsonProperty("class")
	@Override
	public void setData(List<PopulationSumPerYearResultData> data) {
		// TODO Auto-generated method stub
		super.setData(data);
	}
	
	
		

}
