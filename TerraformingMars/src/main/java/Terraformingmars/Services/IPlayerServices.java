package Terraformingmars.Services;

import Terraformingmars.Models.Corporations;
import Terraformingmars.Models.Player;

public interface IPlayerServices {
	Player findByIdPlayer(int id);
	Player findBycor(Corporations cor);
}
