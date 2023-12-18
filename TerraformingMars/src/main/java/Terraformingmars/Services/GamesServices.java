package Terraformingmars.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Terraformingmars.Models.Games;
import Terraformingmars.Repositories.GamesRepository;


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
