package Terraformingmars.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Terraformingmars.Models.Corporations;
import Terraformingmars.Models.Player;
import Terraformingmars.Repositories.PlayerRepository;

@Service("PlayerService")
public class PlayerServices implements IPlayerServices{

	@Autowired
	PlayerRepository pr;
	
	@Override
	public Player findByIdPlayer(int id) {
		// TODO Auto-generated method stub
		return pr.findByIdPlayer(id);
	}

	@Override
	public Player findBycor(Corporations cor) {
		// TODO Auto-generated method stub
		return pr.findBycor(cor);
	}

}
