package TerraformingMars.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import TerraformingMars.Models.Corporations;
import TerraformingMars.Models.TypeMaker;
import TerraformingMars.Repositories.CorporationsRepository;
@Service("CorporationsServices")
public class CorporationsServices implements ICorporationsServices{
	
	@Autowired
	CorporationsRepository cr;
	
	@Override
	public Corporations findByidCorporations(int id) {
		// TODO Auto-generated method stub
		return cr.findByidCorporations(id);
	}

	@Override
	public List<Corporations> getCorporationsWithPlayer() {
		// TODO Auto-generated method stub
		List<Corporations> llistaFinal = new ArrayList<>();
		for (Corporations corporations : cr.findAll()) {
			if(corporations.getPlayer()!=null) {
				llistaFinal.add(corporations);
			}
		}
		return llistaFinal;
	}

	@Override
	public List<Corporations> getCorporationsWithPlayer(TypeMaker tmk) {
		List<Corporations> llistaFinal = new ArrayList<>();
		for (Corporations corporations : cr.findAll()) {
			if(corporations.getPlayer()!=null) {
				
			}
		}
		return llistaFinal;
	}
}
