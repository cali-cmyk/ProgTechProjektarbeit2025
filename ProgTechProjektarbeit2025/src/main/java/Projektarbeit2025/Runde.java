package Projektarbeit2025;

import javax.swing.*;
import java.util.ArrayList;

public class Runde extends JFrame {

	private JLabel RundeLabel;
	private JPanel RundePanel;
	private JList testList;


	public Runde(){
		// erstellt fenster
		setTitle("Runde");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250,400);
		setContentPane(RundePanel);
		setVisible(true);

		//testList.get
		ArrayList<Runde> punkteListe;
		punkteListe = new ArrayList<>();

	}

	public static void main(String[] args) {

		new Runde();
	}
}
