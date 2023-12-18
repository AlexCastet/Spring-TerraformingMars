package Terraformingmars.Services;

import java.util.List;

import Terraformingmars.Models.Makers;
import Terraformingmars.Models.TypeMaker;

public interface IMakersServices {
	List<Makers> findBytypeMaker(TypeMaker ty);
	List<Makers> getMakersByTypeWithoutCorporation (TypeMaker typeMakers);
	List<Makers> getMakersByTypeWithCorporation (TypeMaker typeMakers, int idCorporation);
}
