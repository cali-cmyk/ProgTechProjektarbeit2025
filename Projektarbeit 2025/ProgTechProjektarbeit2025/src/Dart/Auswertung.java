package Dart;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;   //Klasse zum sortieren von ArrayListen

public class Auswertung extends JFrame {

    //Attribute
    private JLabel labelDartAuswertung;
    private JLabel labelGewonnen;
    private JTextField textFieldGewonnen;
    private JLabel labelPunktedurchschnitt;
    private JTextField textFieldPunktedurchschnitt;
    private JList<Integer> listPunkteListe;
    private JLabel labelPunkteliste;
    private JButton buttonAufsteigendSortieren;
    private JButton buttonAbsteigendSortieren;
    private JButton buttonBeenden;
    private JPanel panelAuswertung;
    
    public Auswertung(){

        //GUI Einstellungen
        setTitle("Auswertung");
        setSize(300,300);
        setContentPane(panelAuswertung);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        listPunkteListe.setBackground(Color.white);
        listPunkteListe.setForeground(Color.black);

        //Interaktive Elemente
        buttonAufsteigendSortieren.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aufsteigendSortiert();
            }
        });

        buttonAbsteigendSortieren.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                absteigendSortiert();
            }
        });

        buttonBeenden.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Spiel.spielBeenden();
            }
        });
    }

    //Methoden---------------------------------------------------
    public double berechneDurchschnitt() {
        ArrayList<Integer> punkteListe = Spiel.getPunkteListe();
        if (punkteListe.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (int punkt : punkteListe) {
            sum += punkt;
        }
        return sum / punkteListe.size();
    }

    public void absteigendSortiert(){
        ArrayList <Integer> punkteListe = Spiel.getPunkteListe();
        Collections.sort(punkteListe);
        listPunkteListe.setListData(punkteListe.toArray(new Integer[0]));
    }

    public void aufsteigendSortiert(){
        ArrayList <Integer> punkteListe = Spiel.getPunkteListe();
        Collections.sort(punkteListe, Collections.reverseOrder());
        listPunkteListe.setListData(punkteListe.toArray(new Integer[0]));
    }

    public Spieler gewonnenerSpieler() {
        ArrayList<Spieler> spielerListe = Spiel.getSpielerListe();
        if (spielerListe.isEmpty()) {
            return null;
        }

        Spieler gewinner = spielerListe.getFirst();
        int naechstesGewinnPunkte = gewinner.getGewinnPunkte();     //ist Vergleichsoperator

        for (Spieler spieler : spielerListe) {      //Methode iteriert durch alle Spieler in der spielerListe
            int aktuelleGewinnPunkte = spieler.getGewinnPunkte();
            if (aktuelleGewinnPunkte < naechstesGewinnPunkte) {
                gewinner = spieler;
                naechstesGewinnPunkte = aktuelleGewinnPunkte;
            }
        }
        return gewinner;
    }
}
