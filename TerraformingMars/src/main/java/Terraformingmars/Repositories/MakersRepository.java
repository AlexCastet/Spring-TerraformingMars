package TerraformingMars.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import TerraformingMars.Models.Makers;
import TerraformingMars.Models.TypeMaker;

public interface MakersRepository extends JpaRepository<Makers, Integer>{
	List<Makers> findBytypeMaker(TypeMaker ty);
}
