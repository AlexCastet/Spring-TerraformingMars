package TerraformingMars.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TerraformingMars.Models.Games;
import TerraformingMars.Repositories.GamesRepository;


@Service("GamesServices")
public class GamesServices implements IGamesServices{

	@Autowired
	GamesRepository gr;
	@Override
	public Games findByidGame(int id) {
		// TODO Auto-generated method stub
		return gr.findByidGame(id);
	}

}
