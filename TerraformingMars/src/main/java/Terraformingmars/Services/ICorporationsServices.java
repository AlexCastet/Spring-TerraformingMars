package Terraformingmars.Services;

import java.util.List;

import Terraformingmars.Models.Corporations;

public interface ICorporationsServices {
	Corporations findByidCorporations(int id);
	List<Corporations> getCorporationsWithPlayer();
}
