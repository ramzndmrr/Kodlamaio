package kodlama.io.programmingLanguage.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.programmingLanguage.entities.Language;

public interface LanguageRepository  extends JpaRepository<Language, Integer>{

	Language findByName(String name);

}
