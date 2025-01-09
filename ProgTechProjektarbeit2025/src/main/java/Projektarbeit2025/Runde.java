package Projektarbeit2025;

public class Runde extends Spiel {

    //Frage: Wie bekomme ich mein Fenster wo Punkte eingetragen werden?
    //Antwort: Textfield1.getText() -> holt den Inhalt aus dem Textfield raus :)
    //Das wird benötigt um die User Daten zu bekommen

    //Attribute
    private boolean doppeltePunkte;
    private boolean verdreifachePunkte;

    //Konstruktor
    public Runde(int punkte, String name) {
        super(punkte, name);        //erbt aus Klasse Spiel

    }

    public void verdoppelPunkte()
    {
        if(doppeltePunkte)
        {
            punkte = punkte * 2;
        }
    }

    public void verdreifachePunkte()
    {
        if(verdreifachePunkte)
        {
            punkte = punkte * 3;
        }
    }

    public void verrringereGewinnPunkte()
    {
        //Hier werden die Punkte von den GewinnPunkten des jeweiligen Spielers subtrahiert bis sie genau 0 erreichen
    }
}
