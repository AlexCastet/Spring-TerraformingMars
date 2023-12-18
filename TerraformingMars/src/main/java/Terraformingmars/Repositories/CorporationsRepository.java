package Terraformingmars.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Terraformingmars.Models.Corporations;

public interface CorporationsRepository extends JpaRepository<Corporations, Integer>{
	Corporations findByidCorporations(int id);
}
