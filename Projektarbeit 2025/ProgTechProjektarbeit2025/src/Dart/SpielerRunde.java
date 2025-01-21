package Dart;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    public SpielerRunde(){

        //GUI Einstellungen
        setTitle("Runde");
        setSize(300,300);
        setContentPane(panelSpielerRunde);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        //Interaktive Elemente
        buttonVerzweifachen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verdoppelPunkte();
            }
        });

        buttonVerdreifachen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verdreifachePunkte();
            }
        });


        buttonNaechster.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int punkte = Integer.parseInt(textFieldPunkte.getText());
                setPunkte(punkte);
                Spiel.addPunkte(getPunkte());
                verringereGewinnPunkte();
                pruefeGewonnen();
                wechselNaechsterspieler();
                initialisiereSpielerRunde();    //beim wechsel auf den nächsten Spieler wird ebenfalls das Fenster geupdated
            }
        });

        buttonSpielAbbrechen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                direktZurAuswertung();
            }
        });
    }

    //Methoden-----------------------------------------------
    public Spieler getDerzeitigerSpieler(){
        return derzeitigerSpieler;
    }

    public void initialisiereSpielerRunde() {    //eine Methode die beim aufrufen des SpielerRunde Objekts ausgeführt wird
        textFieldSpieler.setText(derzeitigerSpieler.getName());     //trägt den Namen des derzeitigen Spielers in das Textfeld ein (editable unchecked)
        textFieldStatus.setText(String.valueOf(statusGewinnPunkte()));  //konvertierung des int aus statusGewinnPunkte() in einen String der im textFieldStatus benutzt werden kann (editable unchecked)
        textFieldPunkte.setText("");    //folgende Methode cleart textFieldPunkte um einen neuen Eintrag zu ermöglichen
        setPunkte(0);     //punkte werden nach Eintrag wieder auf 0 gesetzt
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
        int gewinnPunkte = Spieler.getGewinnPunkte();   //Überlegung: Spieler auf derzeitigerSpieler setzen
        if(gewinnPunkte == 0){
            new Auswertung();
        }
        return false;
    }

    //!!Problem: es muss nicht nur SpielerName sondern auch die zum Spieler passenden gewinnPunkte gespeichert werden
    //Überlegung: derzeitigerSpieler.setGewinnPunkte(statusGewinnPunkte());
    public void wechselNaechsterspieler(){
        ArrayList<Spieler> spielerListe = Spiel.getSpielerListe();
        int derzeitigerIndex = spielerListe.indexOf(getDerzeitigerSpieler());

        if (derzeitigerIndex == spielerListe.size() - 1) {      //wenn der letzte Index(AnzahlIndexe-1, da von 0 gezählt) erreicht wurde dann:
            setDerzeitigerSpieler(spielerListe.getFirst());     //reset auf den ersten Spieler, also wechsel vom letzten
        } else {
            setDerzeitigerSpieler(spielerListe.get(derzeitigerIndex + 1));  //derzeitigerIndex wird auf den nächsten Spieler gerichtet, also wechselt
        }

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
        try {
            int gewinnPunkte = Spieler.getGewinnPunkte() - getPunkte();
            if (gewinnPunkte < 0) {
                throw new Exception("Die Punkte zum gewinnen dürfen nicht unter 0 kommen!");
            }
            Spieler.setGewinnPunkte(gewinnPunkte);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Folgender Fehler ist aufgetreten: " + e.getMessage(), "Fehler", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void direktZurAuswertung(){
        dispose();
        new Auswertung();
    }

}
