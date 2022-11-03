package kodlama.io.programmingLanguage.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.programmingLanguage.entities.SubTechnology;

public interface SubTechnologyRepository  extends JpaRepository<SubTechnology, Integer>{

}
