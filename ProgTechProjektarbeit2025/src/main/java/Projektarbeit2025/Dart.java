package Projektarbeit2025;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Dart extends JFrame {
	private JButton NeuesSpielbutton;

	private JPanel DartPanel;
	private JLabel SpielerHinzufuegenLabel;
	private JButton SpielerhinzufuegenButton;
	private JTextArea ListeSpielerTextArea;
	private JTextField SpielerListetextField;
	private JLabel RundeLabel;


	//Liste der Spieler

	ArrayList<Spiel>  spielerListe;


	public Dart(){
		// erstellt fenster
		setTitle("Dart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,350);
		setContentPane(DartPanel);
		setVisible(true);

		spielerListe = new ArrayList<>();


		NeuesSpielbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//lässt NeuesSpielbutton verschwinden
				NeuesSpielbutton.setVisible(false);

				//macht spieler hinzufügen button und liste + andere sachen möglich
				SpielerHinzufuegenLabel.setVisible(true);
				SpielerhinzufuegenButton.setVisible(true);

			}
		});

		SpielerhinzufuegenButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {


				String spielerName = JOptionPane.showInputDialog("Name des Spielers");

				if(spielerName != null && !spielerName.trim().isEmpty()) {


					//erstellen neues spielobjekt mit input namen
					Spiel neuesSpiel = new Spiel(301, spielerName);

					//spielobjekt wird der spielerliste hinzugefügt

					spielerListe.add(neuesSpiel);

					//spielerhinzufuegen button & spielerlistetexfield werden sichtbar gesetzt

					SpielerhinzufuegenButton.setVisible(true);

					ListeSpielerTextArea.setVisible(true);

					ListeSpielerTextArea.setText(spielerName);

					//Debug
					System.out.println("Aktuelle Spieler-Liste: ");
					for (Spiel spiel : spielerListe) {
						System.out.println("- " + spiel.getName());
					}
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
