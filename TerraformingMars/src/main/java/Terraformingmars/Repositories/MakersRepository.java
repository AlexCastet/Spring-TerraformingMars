package Terraformingmars.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Terraformingmars.Models.Makers;
import Terraformingmars.Models.TypeMaker;

public interface MakersRepository extends JpaRepository<Makers, Integer>{
	List<Makers> findBytypeMaker(TypeMaker ty);
}
