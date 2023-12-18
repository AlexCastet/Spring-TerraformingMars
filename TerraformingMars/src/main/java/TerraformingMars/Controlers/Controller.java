package TerraformingMars.Controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import TerraformingMars.Models.Corporations;
import TerraformingMars.Models.Games;
import TerraformingMars.Models.Makers;
import TerraformingMars.Models.Player;
import TerraformingMars.Models.TypeMaker;
import TerraformingMars.Services.CorporationsServices;
import TerraformingMars.Services.GamesServices;
import TerraformingMars.Services.MakersServices;
import TerraformingMars.Services.PlayerServices;

@RestController
public class Controller {

	@Autowired
	CorporationsServices cr;
	
	@Autowired
	GamesServices gm;
	
	@Autowired
	MakersServices mk;
	
	@Autowired
	PlayerServices pl;
	
	@GetMapping(path="/test")
	public String test() {
		return "PRUEBA";
	}
	
	@GetMapping(path="/getCorporationsWithPlayer")
	public String getCorporationsWithPlayer() {
		 
		List<Corporations> withPlayer = cr.getCorporationsWithPlayer();
		return withPlayer.toString();
	}
	
	@GetMapping(path="/getMakersByTypeWithoutCorporation")
	public String getMakersByTypeWithoutCorporation(@RequestParam String tmk) {
		TypeMaker tm = null;
		
		if (tmk.equalsIgnoreCase("bosc")) {
			tm = TypeMaker.BOSC;
		}else if (tmk.equalsIgnoreCase("ciutat")) {
			tm = TypeMaker.CIUTAT;
		}else if (tmk.equalsIgnoreCase("ocea")) {
			tm = TypeMaker.OCEA;
		}
		
		List<Makers> withoutCoorp = mk.getMakersByTypeWithoutCorporation(tm);
		return withoutCoorp.toString();
	}
	
	@GetMapping(path="/getMakersByTypeWithCorporation")
	public String getMakersByTypeWithCorporation(@RequestParam String tmk, @RequestParam int corp) {
		TypeMaker tm = null;
		
		if (tmk.equalsIgnoreCase("bosc")) {
			tm = TypeMaker.BOSC;
		}else if (tmk.equalsIgnoreCase("ciutat")) {
			tm = TypeMaker.CIUTAT;
		}else if (tmk.equalsIgnoreCase("ocea")) {
			tm = TypeMaker.OCEA;
		}
		
		List<Makers> withoutCoorp = mk.getMakersByTypeWithCorporation(tm, corp);
		return withoutCoorp.toString();
	}
	@GetMapping(path="/rollingDices")
	public String rollingDices() {
		
		return "NOT IMPLEMENTED";
	}
	
	@GetMapping(path="/resolveDices")
	public String resolveDices() {
		
		return "NOT IMPLEMENTED";
	}
	
	@GetMapping(path="/isEndGame")
	public String isEndGame() {
		
		return "NOT IMPLEMENTED";
	}
	
	@GetMapping(path="/setVictoryPointsMakers")
	public String setVictoryPointsMakers() {
		
		return "NOT IMPLEMENTED";
	}
	
	@GetMapping(path="/setWinnerGame")
	public String setWinnerGame() {
		
		return "NOT IMPLEMENTED";
	}
}
