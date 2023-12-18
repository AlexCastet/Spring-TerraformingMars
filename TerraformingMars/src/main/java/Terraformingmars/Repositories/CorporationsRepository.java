package TerraformingMars.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import TerraformingMars.Models.Corporations;

public interface CorporationsRepository extends JpaRepository<Corporations, Integer>{
	Corporations findByidCorporations(int id);
}
