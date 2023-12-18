package Terraformingmars.Models;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Makers")
public class Makers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idmakers;

	@Column(name = "Name")
	String name;

	@Column(name = "MaxNeightbours", nullable = false)
	int maxneightbours = 0;

	@Enumerated(EnumType.STRING)
	@Column(name = "TypeMaker")
	TypeMaker typeMaker;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="Corporation")
	Corporations MakerOwner;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			name="MakersNeightbours", //NOM TAULA
			joinColumns = @JoinColumn(name="id_neightbour_1"), //NOM CLAU QUE PORTA EL PES
			inverseJoinColumns = @JoinColumn(name="id_neightbour_2") //NOM DE LA CLAU QUE NO PORTA EL PES
	)
	private Set<Makers> neightbours = new HashSet<Makers>();

	public int getIdmakers() {
		return idmakers;
	}

	public void setIdmakers(int idmakers) {
		this.idmakers = idmakers;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public int getMaxneightbours() {
		return maxneightbours;
	}


	public void setMaxneightbours(int maxneightbours) {
		this.maxneightbours = maxneightbours;
	}


	public TypeMaker getTypeMaker() {
		return typeMaker;
	}


	public void setTypeMaker(TypeMaker typeMaker) {
		this.typeMaker = typeMaker;
	}
	
	public Corporations getMakerOwner() {
		return MakerOwner;
	}

	public void setMakerOwner(Corporations makerOwner) {
		MakerOwner = makerOwner;
	}
	
	public void AddNeightbour(Makers m) {
		this.neightbours.add(m);
	}

	public Set<Makers> getNeightbours() {
		return neightbours;
	}

	public void setNeightbours(Set<Makers> neightbours) {
		this.neightbours = neightbours;
	}

	public Makers(String name, int maxneightbours, TypeMaker typeMaker) {
		super();
		this.name = name;
		this.maxneightbours = maxneightbours;
		this.typeMaker = typeMaker;
	}
	
	public Makers(String name, int maxneighbours) {
		super();
		this.maxneightbours = maxneighbours;
		this.name = name;
	}

	public Makers() {
		super();
	}

	@Override
	public String toString() {
		return "Makers [idmakers=" + idmakers + ", name=" + name + ", description=" + ", maxneightbours="
				+ maxneightbours + ", typeMaker=" + typeMaker + "]";
	}

}