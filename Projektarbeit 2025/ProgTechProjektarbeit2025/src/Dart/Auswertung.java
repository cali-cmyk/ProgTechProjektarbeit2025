package Dart;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        setTitle("Auswertung");
        setSize(300,300);
        setContentPane(panelAuswertung);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        listPunkteListe.setBackground(Color.white);
        listPunkteListe.setForeground(Color.black);

        buttonAufsteigendSortierenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        buttonAbsteigendSortierenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        buttonBeenden.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
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
