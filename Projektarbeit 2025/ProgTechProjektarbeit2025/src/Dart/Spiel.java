package Dart;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Spiel extends JFrame {	//Klasse Spiel erfüllt die Funktion von Klasse main

	//Attribute
	private static ArrayList<Spieler> spielerListe = new ArrayList<>();
	private static ArrayList<Integer> punkteListe = new ArrayList<>();
	private JPanel panelSpiel;
	private JLabel SpielerLabel;
	private JButton plusButton;
	private JLabel dartSpielLabel;
	private JList<Spieler> SpielerListeJList;
	private JButton NeuesSpielButton;

	public Spiel(){

		//GUI Einstellungen
		setTitle("Dart");
		setSize(300,300);
		setContentPane(panelSpiel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);	//lässt das Fenster mittig vom Bildschirm erscheinen
		setVisible(true);
		SpielerListeJList.setBackground(Color.white);
		SpielerListeJList.setForeground(Color.black);

		//Interaktive Elemente
		plusButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String spieler = JOptionPane.showInputDialog(null,"Namen: ","Spielereingabe",JOptionPane.QUESTION_MESSAGE);
				if ( spieler != null){
					addSpieler(new Spieler(spieler));	//Spieler Objekt wird erstellt und zur Liste spielerListe hinzugefügt
					Spieler[] updatedSpielerListe = spielerListe.toArray(new Spieler[0]);
					SpielerListeJList.setListData(updatedSpielerListe);		//setListData aktualisiert die Ansicht
				}
			}
		});

		NeuesSpielButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				spielStarten();
			}
		});
	}

	//Methoden------------------------------------------------------
	public void addSpieler(Spieler spieler){
		spielerListe.add(spieler);
	}

	public static ArrayList<Spieler> getSpielerListe() {
		return spielerListe;
	}

	public static void addPunkte(int punkte){
		punkteListe.add(punkte);
	}

	public static ArrayList<Integer> getPunkteListe() {
		return punkteListe;
	}

	public void spielStarten(){
		dispose();	//derzeitiges Fenster wird geschlossen
		new SpielerRunde();	//Das Fenster SpielerRunde wird geöffnet
	}

	public static void main(String[] args) {
		new Spiel();	//Das Startfenster Spiel wird geöffnet und ein neues Opbjekt Spiel wird erstellt
	}




}
