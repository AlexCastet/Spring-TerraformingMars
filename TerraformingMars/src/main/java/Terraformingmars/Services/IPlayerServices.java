package TerraformingMars.Services;

import TerraformingMars.Models.Corporations;
import TerraformingMars.Models.Player;

public interface IPlayerServices {
	Player findByidPlayer(int id);
	Player findBycor(Corporations cor);
}
