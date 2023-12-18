package Terraformingmars.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Terraformingmars.Models.Corporations;
import Terraformingmars.Repositories.CorporationsRepository;
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

}
