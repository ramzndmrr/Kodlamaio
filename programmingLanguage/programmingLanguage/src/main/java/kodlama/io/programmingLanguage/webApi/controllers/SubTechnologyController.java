package kodlama.io.programmingLanguage.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.programmingLanguage.business.abstracts.SubTechnologyService;
import kodlama.io.programmingLanguage.business.requests.techRequests.CreateSubTechnologyRequest;
import kodlama.io.programmingLanguage.business.requests.techRequests.UpdateSubTechnolgyRequest;
import kodlama.io.programmingLanguage.business.responses.techResponses.GetAllSubTechnologyResponse;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/subTechnologies")
@RequiredArgsConstructor
public class SubTechnologyController {
	private SubTechnologyService subTechnologyService;
	
	@GetMapping("/getall")
	public List<GetAllSubTechnologyResponse> getAll() {
		return this.subTechnologyService.getAll();
	}

	@PostMapping("/add")
	public void add(CreateSubTechnologyRequest request) {
		this.subTechnologyService.add(request);
	}
	
	@PostMapping("/update")
	public void update(UpdateSubTechnolgyRequest updateRequest, int id) {
		this.subTechnologyService.update(updateRequest, id);
	}
}
