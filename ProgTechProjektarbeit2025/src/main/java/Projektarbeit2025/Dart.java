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
	private JButton SpielStartenButton;
	private JTextField SpielerListetextField;
	private JLabel RundeLabel;


	//Liste der Spieler
	ArrayList<Spiel>  spielerListe;		//wird dadurch punkte als auch Spielername gespeichert?


	public Dart(){
		// erstellt fenster
		setTitle("Dart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250,400);
		setContentPane(DartPanel);
		SpielStartenButton.setVisible(false);
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


					//erstellen neues spielobjekt mit input namen und den benötigten Punkte um zu gewinnen
					Spiel neuesSpiel = new Spiel(301, spielerName);

					//spielobjekt wird der spielerliste hinzugefügt
					spielerListe.add(neuesSpiel);

					//spielerhinzufuegen button & spielerlistetexfield werden sichtbar gesetzt
					SpielerhinzufuegenButton.setVisible(true);
					ListeSpielerTextArea.setVisible(true);

					ListeSpielerTextArea.append("- " + spielerName + "\n");

					ListeSpielerTextArea.setBackground(Color.white);

					ListeSpielerTextArea.setFont(ListeSpielerTextArea.getFont().deriveFont(Font.BOLD));
					SpielStartenButton.setVisible(true);



					System.out.println(" - " + spielerName);

					SpielStartenButton.setVisible(true);


				}
				else{
					JOptionPane.showMessageDialog(null, "Spielername darf nicht leer sein");
				}


			}
		});

		SpielStartenButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				dispose();
				Runde runde = new Runde();

			}
		});

	}

	public static void main(String[] args) {

		new Dart();
	}
}
