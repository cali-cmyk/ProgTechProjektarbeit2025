package Dart;

import javax.swing.*;

public class SpielerRunde extends JFrame{

    //Attribute
    private Spieler derzeitigerSpieler;
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

    //Methoden
    public String getDerzeitigerSpieler() {
        return derzeitigerSpieler;
    }

    public void setDerzeitigerSpieler(Spieler derzeitigerSpieler) {
        this.derzeitigerSpieler = derzeitigerSpieler;
    }

    public int getPunkte() {
        return punkte;
    }

    public void setPunkte(int punkte) {
        this.punkte = punkte;
    }

    public boolean pruefeGewonnen() {
        return;
    }

    public void wechselNaechsterspieler() {

    }

    public void verdoppelPunkte() {

    }

    public void verdreifachePunkte() {

    }

    public int statusGewinnPunkte(){
        return;
    }

    public void verringereGewinnPunkte(){

    }

    public void direktZurAuswertung(){

    }
}
