package kodlama.io.programmingLanguage.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.programmingLanguage.business.abstracts.LanguageService;
import kodlama.io.programmingLanguage.business.requests.languageRequests.CreateLanguageRequest;
import kodlama.io.programmingLanguage.business.responses.languageResponses.GetAllLanguageResponse;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {
	private LanguageService languageService;

	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	
	@GetMapping("/getall")
	public List<GetAllLanguageResponse> getAll(){
		return this.languageService.getAll();
	}
	
	
	@PostMapping("/add")
	public void add(CreateLanguageRequest createLanguageRequest) {
		this.languageService.add(createLanguageRequest);
	}

}
