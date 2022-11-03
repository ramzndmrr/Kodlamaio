package kodlama.io.programmingLanguage.business.requests.techRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateSubTechnologyRequest {

	private int id;
	private String name;
}
