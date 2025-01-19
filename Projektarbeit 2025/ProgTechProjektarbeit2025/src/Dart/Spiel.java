package Dart;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Spiel extends JFrame {	//Klasse Spiel erfüllt die Funktion von Klasse main

	//Attribute
	private ArrayList<Spieler> spielerListe = new ArrayList<>();
	private ArrayList<Integer> punkteListe = new ArrayList<>();
	private JPanel panelSpiel;
	private JLabel SpielerLabel;
	private JButton plusButton;
	private JLabel dartSpielLabel;
	private JList SpielerListeJList;
	private JButton NeuesSpielButton;

	//Konstruktor
	public Spiel(){
		setTitle("Dart");
		setSize(300,300);
		setContentPane(panelSpiel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		SpielerListeJList.setBackground(Color.white);
	}

	//Methoden
	public void addSpieler(Spieler spieler){
		spielerListe.add(spieler);
	}

	public ArrayList<Spieler> getSpielerListe() {
		return spielerListe;
	}

	public void addPunkte(int punkte){
		punkteListe.add(punkte);
	}

	public ArrayList<Integer> getPunkteListe() {
		return punkteListe;
	}

	public void SpielStarten(){
		dispose();	//derzeitiges Fenster wird geschlossen
		new SpielerRunde();	//Das Fenster SpielerRunde wird geöffnet
	}

	public void SpielBeenden(){
		dispose();
		//close Operation die das Auswertung Fenster schließt ohne das etwas gespeichert wird (reset)
	}

	public static void main(String[] args) {
		new Spiel();	//Das Startfenster Spiel wird geöffnet
	}




}
