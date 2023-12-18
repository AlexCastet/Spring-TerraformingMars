package Terraformingmars.Models;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Player")
public class Player {

	@Override
	public String toString() {
		return "Players [IdPlayer=" + IdPlayer + ", Name=" + Name + ", Wins=" + Wins + ", cor=" + cor + ", Partides="
				+ Partides + ", Guanyades=" + Guanyades + "]";
	}
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idPlayer")
	private int IdPlayer;
	@Column(name = "Name", length = 50, nullable = false)
	private String Name;
	@Column(name = "Wins")
	private int Wins = 0;
	@OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
	private Corporations cor;
	@ManyToMany(mappedBy = "Jugadors", cascade = {CascadeType.MERGE})
	private Set<Games> Partides = new HashSet<Games>();
	@OneToMany(mappedBy = "Guanyador")
	private Set<Games> Guanyades = new HashSet<Games>();
	
	public Player() {
		
	}

	public Player(String name) {
		super();
		Name = name;
	}
	
	public Player(String name, int wins, Corporations cor, Set<Games> partides, Set<Games> guanyades) {
		super();
		Name = name;
		Wins = wins;
		this.cor = cor;
		Partides = partides;
		Guanyades = guanyades;
	}

	public int getIdPlayer() {
		return IdPlayer;
	}
	public void setIdPlayer(int idPlayer) {
		IdPlayer = idPlayer;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getWins() {
		return Wins;
	}
	public void setWins(int wins) {
		Wins = wins;
	}
	public Corporations getCor() {
		return cor;
	}

	public void setCor(Corporations cor) {
		this.cor = cor;
	}

	public Set<Games> getPartides() {
		return Partides;
	}

	public void setPartides(Set<Games> partides) {
		Partides = partides;
	}

	public Set<Games> getGuanyades() {
		return Guanyades;
	}

	public void setGuanyades(Set<Games> guanyades) {
		Guanyades = guanyades;
	}
}
