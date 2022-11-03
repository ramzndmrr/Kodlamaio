package kodlama.io.programmingLanguage.business.abstracts;

import java.util.List;

import kodlama.io.programmingLanguage.business.requests.languageRequests.CreateLanguageRequest;
import kodlama.io.programmingLanguage.business.requests.languageRequests.UpdateLanguageRequest;
import kodlama.io.programmingLanguage.business.responses.languageResponses.GetAllLanguageResponse;
import kodlama.io.programmingLanguage.entities.Language;

public interface LanguageService {
	
	
	public List<GetAllLanguageResponse> getAll();
	public void add(CreateLanguageRequest languageRequest);
	public Language getOneLanguage(String name); 
	public Language getById(int id);
	public Language update(UpdateLanguageRequest updateRequest, int id);
	public void delete(int id);
}
