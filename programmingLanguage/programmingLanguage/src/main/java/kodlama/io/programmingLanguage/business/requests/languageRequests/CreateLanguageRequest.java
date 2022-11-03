package kodlama.io.programmingLanguage.business.requests.languageRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateLanguageRequest {

	private int id;
	private String name;
}
