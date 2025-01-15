package Projektarbeit2025;

import javax.swing.*;
import java.util.ArrayList;

public class Runde extends JFrame {

	private JPanel RundePanel;

	public Runde(){
		//erstellt fenster
		setTitle("Runde");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250,400);
		setContentPane(RundePanel);	//!!!!sind diese angaben noch aktuell oder ist das durch die Swing Unit egal geworden?!!!!
		setVisible(true);

		//Liste um Punkte sortieren zu können zwischenspeichern
		ArrayList<Integer> punkteListe;
		punkteListe = new ArrayList<>();

		//RundeFunktion runde1 = new RundeFunktion(dieSichErgebendeGewinnPunkte, diePunkteDieEingetragenWurden, denNamenDesDerzeitigenSpielers);
		//runde1.verdoppelPunkte();
	}

	public static void main(String[] args) {
		new Runde();
	}

}
