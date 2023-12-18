package Terraformingmars.Repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import Terraformingmars.Models.Corporations;
import Terraformingmars.Models.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer>{
	Player findByIdPlayer(int id);
	Player findBycor(Corporations cor);
}
