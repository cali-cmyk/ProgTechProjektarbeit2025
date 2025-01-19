package Dart;

import javax.swing.*;
import java.util.ArrayList;

public class SpielerRunde extends JFrame{

    //Attribute
    private Spieler derzeitigerSpieler = Spiel.getSpielerListe().getFirst();
    private int punkte;

    private JTextField textFieldSpieler;
    private JLabel labelSpieler;
    private JTextField textFieldPunkte;
    private JLabel labelPunkte;
    private JButton buttonVerdreifachen;
    private JButton buttonVerzweifachen;
    private JTextField textFieldStatus;
    private JButton buttonSpielAbbrechen;
    private JButton buttonNaechster;
    private JLabel labelStatus;
    private JPanel panelSpielerRunde;

    //Konstruktor
    public SpielerRunde(){
        setTitle("Dart");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    //Methoden
    public Spieler getDerzeitigerSpieler(){
        return derzeitigerSpieler;
    }

    public void setDerzeitigerSpieler(Spieler derzeitigerSpieler){
        this.derzeitigerSpieler = derzeitigerSpieler;
    }

    public int getPunkte(){
        return punkte;
    }

    public void setPunkte(int punkte){
        this.punkte = punkte;
    }

    public boolean pruefeGewonnen(){

        int gewinnPunkte = Spieler.getGewinnPunkte();
        if(gewinnPunkte == 0){
            new Auswertung();
        }
        return false;
    }

    public void wechselNaechsterspieler(){
        ArrayList <Spieler> spielerListe = Spiel.getSpielerListe();
        setDerzeitigerSpieler(spielerListe.iterator().next());   //derzeitiger Spieler wird auf nächsten Spieler in der spielerListe gesetzt
    }

    public void verdoppelPunkte(){
        punkte = punkte*2;
    }

    public void verdreifachePunkte(){
        punkte = punkte*3;
    }

    public int statusGewinnPunkte(){
        return Spieler.getGewinnPunkte();
    }

    public void verringereGewinnPunkte(){
        int gewinnPunkte;
        gewinnPunkte = Spieler.getGewinnPunkte() - getPunkte();
        Spieler.setGewinnPunkte(gewinnPunkte);
    }

    public void direktZurAuswertung(){
        dispose();
        new Auswertung();
    }

}
