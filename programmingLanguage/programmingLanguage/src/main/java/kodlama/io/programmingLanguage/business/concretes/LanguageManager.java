package kodlama.io.programmingLanguage.business.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.programmingLanguage.business.abstracts.LanguageService;
import kodlama.io.programmingLanguage.business.requests.languageRequests.CreateLanguageRequest;
import kodlama.io.programmingLanguage.business.requests.languageRequests.UpdateLanguageRequest;
import kodlama.io.programmingLanguage.business.responses.languageResponses.GetAllLanguageResponse;
import kodlama.io.programmingLanguage.dataAccess.LanguageRepository;
import kodlama.io.programmingLanguage.entities.Language;

public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;
	
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	
	@Override
	public List<GetAllLanguageResponse> getAll() {
		List<Language> languages = languageRepository.findAll();
		List<GetAllLanguageResponse> languagesRespnse = new ArrayList<GetAllLanguageResponse>();
		
		for (Language language : languages) {
			GetAllLanguageResponse responseItem = new GetAllLanguageResponse();
			responseItem.setId(language.getId());
			responseItem.setName(language.getName());
			
			languagesRespnse.add(responseItem);
		}
		return languagesRespnse;
	}
	

	@Override
	public void add(CreateLanguageRequest languageRequest) {
		Language language = new Language();
		language.setName(languageRequest.getName());
		 languageRepository.save(language);
	}


	@Override
	public Language getOneLanguage(String name) {
		return this.languageRepository.findByName(name);
	}


	@Override
	public Language update(UpdateLanguageRequest updateRequest, int id) {
		Language language = getById(id);
		language.setName(updateRequest.getName());
		return language;
	}


	@Override
	public void delete(int id) {
		this.languageRepository.deleteById(id);	
	}


	@Override
	public Language getById(int id) {
		Language language = this.languageRepository.findById(id).orElse(null);
		return language;
	}

}
