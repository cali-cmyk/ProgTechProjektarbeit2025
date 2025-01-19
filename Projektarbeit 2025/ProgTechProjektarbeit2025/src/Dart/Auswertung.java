package Dart;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;   //Klasse zum sortieren von ArrayListen

public class Auswertung extends JFrame {

    //Attribute
    private JLabel labelDartAuswertung;
    private JLabel labelGewonnen;
    private JTextField textFieldGewonnen;
    private JLabel labelPunktedurchschnitt;
    private JTextField textFieldPunktedurchschnitt;
    private JList listPunkteListe;
    private JLabel labelPunkteliste;
    private JButton buttonAufsteigendSortierenButton;
    private JButton buttonAbsteigendSortierenButton;
    private JButton buttonBeenden;
    private JPanel panelAuswertung;

    //Konstruktor
    public Auswertung(){
        setTitle("Dart");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    //Methoden
    public double berechneDurchschnitt(){
        //return den Durchschnitt aller Punkte die in der ArrayList punkteListe stehen
        int x = 0;
        return x;
    }

    public void absteigendSortiert(){
        ArrayList <Integer> punkteListe = Spiel.getPunkteListe();
        Collections.sort(punkteListe);
    }

    public void aufsteigendSortiert(){
        ArrayList <Integer> punkteListe = Spiel.getPunkteListe();
        Collections.sort(punkteListe, Collections.reverseOrder());
    }

    public String gewonnenerSpieler(){
        // return spieler mit nähester punktzahl zur 0 || 0;
        String x = "ka";
        return x;
    }

}
