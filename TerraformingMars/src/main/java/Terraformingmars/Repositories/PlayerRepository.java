package TerraformingMars.Repositories;

import TerraformingMars.Models.Player;
import TerraformingMars.Models.Corporations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer>{
	Player findByidPlayer(int id);
	Player findBycor(Corporations cor);
}
