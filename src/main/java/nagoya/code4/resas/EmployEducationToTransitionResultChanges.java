package nagoya.code4.resas;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployEducationToTransitionResultChanges 

extends AbstractResultList<EmployEducationAcademicToTransitionChange>{

	@JsonProperty("changes")
	@Override
	public List<EmployEducationAcademicToTransitionChange> getData() {
		return super.getData();
	}
	
	@JsonProperty("changes")
	@Override
	public void setData(List<EmployEducationAcademicToTransitionChange> data) {
		// TODO Auto-generated method stub
		super.setData(data);
	}

	
	
	

}
