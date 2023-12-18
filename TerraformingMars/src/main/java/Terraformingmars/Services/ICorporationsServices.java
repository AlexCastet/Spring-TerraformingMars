package TerraformingMars.Services;

import java.util.List;

import TerraformingMars.Models.Corporations;
import TerraformingMars.Models.TypeMaker;

public interface ICorporationsServices {
	Corporations findByidCorporations(int id);
	List<Corporations> getCorporationsWithPlayer();
	List<Corporations> getCorporationsWithPlayer(TypeMaker tmk);
}
