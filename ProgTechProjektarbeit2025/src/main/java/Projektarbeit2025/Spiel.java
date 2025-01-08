package Projektarbeit2025;

public class Spiel {

	//Attribute
	private int punkte;
	private String name;

	//Konstruktor
	public Spiel(int punkte, String name) {
		this.punkte = 0;
		this.name = name;
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
