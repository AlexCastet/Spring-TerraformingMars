package Terraformingmars.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Terraformingmars.Models.Games;

public interface GamesRepository extends JpaRepository<Games, Integer>{
	Games findByidGame(int id);
	
}
