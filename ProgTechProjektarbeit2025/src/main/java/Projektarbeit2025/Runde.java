package Projektarbeit2025;

import javax.swing.*;

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

	}

	public static void main(String[] args) {
		new Runde();
	}
}
