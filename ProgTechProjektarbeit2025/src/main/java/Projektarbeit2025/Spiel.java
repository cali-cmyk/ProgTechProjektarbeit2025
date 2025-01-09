package Projektarbeit2025;

public class Spiel {

	//Attribute
	public int punkte;
	private String name;

	//Konstruktor
	public Spiel(int punkte, String name) {		//Punkte die man benötigt um zu gewinnen (301 Punkte)
		this.punkte = 0;	//Punkte die man gerade wirft und einträgt -> verwende ich um zu verdoppeln ...?
		this.name = name;
		System.out.println("Neues Spiel für Spieler " + name + "erstellt.");
	}

	//Getter & Setter
	public int getPunkte() {
		return punkte;
	}

	public void setPunkte(){
		this.punkte = punkte;
	}

	public String getName() {
		return name;
	}

	public void setName(){
		this.name = name;
	}

}
