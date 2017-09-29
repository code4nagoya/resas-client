package nagoya.code4.resas;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PopulationFutureCities extends AbstractResultList<PopulationFutureCitiesResultCity>{

	
	@JsonProperty("cities")
	@Override
	public List<PopulationFutureCitiesResultCity> getData() {
		return super.getData();
	}


	@JsonProperty("cities")
	@Override
	public void setData(List<PopulationFutureCitiesResultCity> data) {

		super.setData(data);
	}
	
	
	

}
