package TerraformingMars.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import TerraformingMars.Models.Games;

public interface GamesRepository extends JpaRepository<Games, Integer>{
	Games findByidGame(int id);
	
}
