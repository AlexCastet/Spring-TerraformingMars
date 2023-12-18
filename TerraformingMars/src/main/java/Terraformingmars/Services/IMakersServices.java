package TerraformingMars.Services;

import java.util.List;

import TerraformingMars.Models.Makers;
import TerraformingMars.Models.TypeMaker;

public interface IMakersServices {
	List<Makers> findBytypeMaker(TypeMaker ty);
	List<Makers> getMakersByTypeWithoutCorporation (TypeMaker typeMakers);
	List<Makers> getMakersByTypeWithCorporation (TypeMaker typeMakers, int idCorporation);
}
