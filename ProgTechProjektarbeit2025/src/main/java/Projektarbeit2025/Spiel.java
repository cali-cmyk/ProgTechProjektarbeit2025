package Projektarbeit2025;

public class Spiel {

	//Attribute
	private int punkte;
	private String name;
	private int punkteGewinn;

	//Konstruktor
	public Spiel(int punkteGewinn, String name) {
		this.punkte = 0;
		this.name = name;
		this.punkteGewinn = punkteGewinn;
	}

	//Getter & Setter
	public int getPunkte() {
		return punkte;
	}

	public void setPunkte(int punkte){
		this.punkte = punkte;
	}

	public String getName() {
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public int getPunkteGewinn() {
		return punkteGewinn;
	}

	public void setPunkteGewinn(int punkteGewinn){
		this.punkteGewinn = punkteGewinn;
	}

}
