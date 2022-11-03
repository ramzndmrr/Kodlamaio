package kodlama.io.programmingLanguage.business.abstracts;

import java.util.List;

import kodlama.io.programmingLanguage.business.requests.techRequests.CreateSubTechnologyRequest;
import kodlama.io.programmingLanguage.business.requests.techRequests.UpdateSubTechnolgyRequest;
import kodlama.io.programmingLanguage.business.responses.techResponses.GetAllSubTechnologyResponse;
import kodlama.io.programmingLanguage.entities.SubTechnology;

public interface SubTechnologyService {
	
	List<GetAllSubTechnologyResponse> getAll();
	void add(CreateSubTechnologyRequest subTechnologyRequest);
	void update(UpdateSubTechnolgyRequest updateRequest, int id);
	SubTechnology getOneSubTechnology(int id);
	void delete(int id);

}
