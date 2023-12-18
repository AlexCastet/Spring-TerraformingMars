package TerraformingMars.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TerraformingMars.Models.Corporations;
import TerraformingMars.Models.Player;
import TerraformingMars.Repositories.PlayerRepository;

@Service("PlayerService")
public class PlayerServices implements IPlayerServices{

	@Autowired
	PlayerRepository pr;
	
	@Override
	public Player findByidPlayer(int id) {
		// TODO Auto-generated method stub
		return pr.findByidPlayer(id);
	}

	@Override
	public Player findBycor(Corporations cor) {
		// TODO Auto-generated method stub
		return pr.findBycor(cor);
	}

}
