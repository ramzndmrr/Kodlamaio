package kodlama.io.programmingLanguage.business.responses.techResponses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetAllSubTechnologyResponse {

	private int id;
	private String name;
	private String language;
}
