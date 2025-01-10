package Projektarbeit2025;

import javax.swing.*;

public class Runde extends JFrame {

	//Attribute
	private boolean doppeltePunkte;
	private boolean verdreifachePunkte;

	private JLabel RundeLabel;
	private JPanel RundePanel;
	private JList testList;

	//Konstruktor
	public Runde(int punkte, String name) {
		super(punkte, name);        //erbt aus Klasse Spiel

	}

	public Runde(){			//zählt das auch als Konstruktor?
		// erstellt fenster
		setTitle("Runde");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250,400);
		setContentPane(RundePanel);
		setVisible(true);

		//testList.get
		ArrayList<Runde>  punkteListe;
		punkteListe = new ArrayList<>();

	}

	public void verdoppelPunkte()
	{
		if(doppeltePunkte)
		{
			punkte = punkte * 2;
		}
	}

	public void verdreifachePunkte()
	{
		if(verdreifachePunkte)
		{
			punkte = punkte * 3;
		}
	}

	public void verrringereGewinnPunkte()
	{
		//Hier werden die Punkte von den GewinnPunkten des jeweiligen Spielers subtrahiert bis sie genau 0 erreichen
	}

	public static void main(String[] args) {

		new Runde();
	}
}
