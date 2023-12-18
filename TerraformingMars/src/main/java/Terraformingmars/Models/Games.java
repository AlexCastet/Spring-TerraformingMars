package TerraformingMars.Models;

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
@Table(name="Games")
public class Games {

	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idGames")
	private int idGame;
	@Column(name="Oxygen")
	private int Oxygen = 0;
	@Column(name="Temperature")
	private int Temperature = -30;
	@Column(name="Oceans")
	private int Oceans = 0;
	@Column
	private LocalDateTime DateStart = LocalDateTime.now();
	@Column
	private LocalDateTime EndDateTime = null;
	@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST,CascadeType.MERGE}, targetEntity = Player.class)
	@JoinTable(name ="PlayerGames", joinColumns = @JoinColumn(name ="PartidaID"), inverseJoinColumns = @JoinColumn(name="JugadorId"))
	private Set<Player> Jugadors = new HashSet<Player>();
	@ManyToOne
	//@JoinColumn(name="idGuanyador")
	@JoinTable(name ="GamesWins", joinColumns = @JoinColumn(name ="PartidaID"), inverseJoinColumns = @JoinColumn(name="GuanyadorID"))
	private Player Guanyador;
	
	public Games() {
		
	}
	
	public Games ( int oxygen, int temperature, int oceans, LocalDateTime dateStart,
			LocalDateTime endDateTime, Set<Player> jugadors, Player guanyador) {
		super();
		Oxygen = oxygen;
		Temperature = temperature;
		Oceans = oceans;
		DateStart = dateStart;
		EndDateTime = endDateTime;
		Jugadors = jugadors;
		Guanyador = guanyador;
	}
	
	public Games(int oxygen, int temperature, int oceans) {
		super();
		Oxygen = oxygen;
		Temperature = temperature;
		Oceans = oceans;
	}

	public int getIdGame() {
		return idGame;
	}

	public void setIdGame(int idGame) {
		this.idGame = idGame;
	}

	public int getOxygen() {
		return Oxygen;
	}

	public void addOxygen(int oxygen)
	{
		Oxygen += oxygen;
	}
	
	public void setOxygen(int oxygen) {
		Oxygen = oxygen;
	}

	public int getTemperature() {
		return Temperature;
	}

	public void addTemperature(int temperature)
	{
		Temperature += temperature;
	}
	
	public void setTemperature(int temperature) {
		Temperature = temperature;
	}

	public int getOceans() {
		return Oceans;
	}

	public void setOceans(int oceans) {
		Oceans = oceans;
	}

	public LocalDateTime getDateStart() {
		return DateStart;
	}

	public void setDateStart(LocalDateTime dateStart) {
		DateStart = dateStart;
	}

	public LocalDateTime getEndDateTime() {
		return EndDateTime;
	}

	public void setEndDateTime(LocalDateTime endDateTime) {
		EndDateTime = endDateTime;
	}

	public Set<Player> getJugadors() {
		return Jugadors;
	}
	
	public void addJugadors(Player player)
	{
	    Jugadors.add(player);
	}

	public void setJugadors(Set<Player> jugadors) {
		Jugadors = jugadors;
	}

	public Player getGuanyador() {
		return Guanyador;
	}

	public void setGuanyador(Player guanyador) {
		Guanyador = guanyador;
	}

	@Override
	public String toString() {
		return "Games [idGame=" + idGame + ", Oxygen=" + Oxygen + ", Temperature=" + Temperature + ", Oceans=" + Oceans
				+ ", DateStart=" + DateStart + ", EndDateTime=" + EndDateTime + ", Jugadors=" + Jugadors
				+ ", Guanyador=" + Guanyador + "]";
	}
	
	
}

