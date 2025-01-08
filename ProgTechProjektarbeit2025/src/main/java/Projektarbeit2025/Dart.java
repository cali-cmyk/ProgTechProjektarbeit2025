package Projektarbeit2025;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Dart extends JFrame {
	private JButton NeuesSpielbutton;

	private JPanel DartPanel;
	private JLabel SpielerLabel;
	private JButton SpielerhinzufuegenButton;
	private JTextArea ListeSpielerTextArea;
	private JLabel SpielLabel;
	private JButton NeuesSpielButton;
	private JTextField SpielerListetextField;
	private JLabel RundeLabel;


	//Liste der Spieler

	ArrayList<Spiel>  spielerListe;


	public Dart(){
		// erstellt fenster
		setTitle("Dart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250,400);
		setContentPane(DartPanel);
		setVisible(true);



		spielerListe = new ArrayList<>();


		NeuesSpielButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//lässt NeuesSpielbutton verschwinden
				NeuesSpielButton.setVisible(false);
				//macht spieler hinzufügen button und liste + andere sachen möglich
				SpielerLabel.setVisible(true);
				SpielerhinzufuegenButton.setVisible(true);
				ListeSpielerTextArea.setVisible(false);

			}
		});

		SpielerhinzufuegenButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setTitle("Spiel 1");

				String spielerName = JOptionPane.showInputDialog("Name des Spielers");

				if(spielerName != null && !spielerName.trim().isEmpty()) {


					//erstellen neues spielobjekt mit input namen
					Spiel neuesSpiel = new Spiel(301, spielerName);

					//spielobjekt wird der spielerliste hinzugefügt

					spielerListe.add(neuesSpiel);

					//spielerhinzufuegen button & spielerlistetexfield werden sichtbar gesetzt

					SpielerhinzufuegenButton.setVisible(true);
					ListeSpielerTextArea.setVisible(true);

					ListeSpielerTextArea.append( spielerName + "\n");

					ListeSpielerTextArea.setBackground(Color.white);

					ListeSpielerTextArea.setFont(ListeSpielerTextArea.getFont().deriveFont(Font.BOLD));



					System.out.println(" - " + spielerName);


				}
				else{
					JOptionPane.showMessageDialog(null, "Spielername darf nicht leer sein");
				}


			}
		});

	}

	public static void main(String[] args) {
		new Dart();
	}
}
