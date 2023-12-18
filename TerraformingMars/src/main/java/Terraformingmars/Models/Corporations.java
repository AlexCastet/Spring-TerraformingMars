package Terraformingmars.Models;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Corporations")
public class Corporations {

	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int idCorporations;
	@Column(length = 50, nullable = false)
	private String Name;
	@Column(length = 100, nullable = false)
	private String Description;
	@Column
	private int Victorypoints = 0;
	@OneToOne(mappedBy = "cor", cascade = CascadeType.PERSIST)
	private Player player;
	
	@OneToMany(mappedBy = "MakerOwner", cascade = CascadeType.PERSIST)
	private Set<Makers> coorporationMakers;
	
	public Corporations() {
		
	}
	
	public Corporations(String name, String description, int victorypoints, Player player) {
		super();
		Name = name;
		Description = description;
		Victorypoints = victorypoints;
		this.player = player;
	}

	public Corporations(String name2, String desc) {
		super();
		Name = name2;
		Description = desc;
	}

	public int getIdCorporations() {
		return idCorporations;
	}

	public void setIdCorporations(int idCorporations) {
		this.idCorporations = idCorporations;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getVictorypoints() {
		return Victorypoints;
	}

	public void setVictorypoints(int victorypoints) {
		Victorypoints = victorypoints;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	@Override
	public String toString() {
		return "Corporations [idCorporations=" + idCorporations + ", Name=" + Name + ", Description=" + Description
				+ ", Victorypoints=" + Victorypoints + ", player=" + player + "]";
	}
}
