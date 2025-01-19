package Dart;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Spiel extends JFrame {
	private ArrayList<Spieler> String;
	private ArrayList<Integer>punkteListe;
	private JPanel spielPanel;
	private JLabel SpielerLabel;
	private JButton plusButton;
	private JLabel dartSpielLabel;
	private JList SpielerListeJList;
	private JButton NeuesSpielButton;


	public Spiel(){
		setTitle("Dart");
		setSize(300,300);
		setContentPane(spielPanel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		SpielerListeJList.setBackground(Color.white);

	}

	public void addSpieler(){


	}

	public void addName(){


	}

	public void SpielStarten(){

	}

	public void SpielBeenden(){

	}

	public static void main(String[] args) {
		new Spiel();
	}




}
