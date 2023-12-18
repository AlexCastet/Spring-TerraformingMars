package Terraformingmars.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Terraformingmars.Models.Makers;
import Terraformingmars.Models.TypeMaker;
import Terraformingmars.Repositories.MakersRepository;

@Service("MakersServices")
public class MakersServices implements IMakersServices{

	@Autowired
	MakersRepository mr;

	
	@Override
	public List<Makers> findBytypeMaker(TypeMaker ty) {
		// TODO Auto-generated method stub
		
		
		return mr.findBytypeMaker(ty);
	}

	@Override
	public List<Makers> getMakersByTypeWithCorporation(TypeMaker typeMakers, int idCorporation) {
		List<Makers> Llistafinal = new ArrayList<>();
		
		for (Makers makers : mr.findAll()) {
			if(makers.getMakerOwner().getIdCorporations()==idCorporation) {
				Llistafinal.add(makers);
			}
		}
		return Llistafinal;
	}

	@Override
	public List<Makers> getMakersByTypeWithoutCorporation(TypeMaker typeMakers) {
		List<Makers> Llistafinal = new ArrayList<>();
		for (Makers makers : mr.findBytypeMaker(typeMakers)) {
			if(makers.getMakerOwner()==null) {
				Llistafinal.add(makers);
			}
		}
		return Llistafinal;
	}

}
