package Projektarbeit2025;

public class RundeFunktion extends Spiel{

    public RundeFunktion(int punkteGewinn, int punkte, String name) {   //!!!muss RundeFunktion in das UML eingebaut werden (Wie?)!!!
        super(punkteGewinn, punkte, name);
    }

    //Attribute
    private boolean doppeltePunkte;
    private boolean verdreifachePunkte;

    public void verdoppelPunkte()   //kann genutzt werden wenn Objekt gebildet wurde
    {
        if(doppeltePunkte)
        {
            int verdoppeltePunkte = getPunkte() * 2;
            setPunkte(verdoppeltePunkte);
        }
    }

    public void verdreifachePunkte()
    {
        if(verdreifachePunkte)
        {
            int verdreifachtePunkte = getPunkte() * 3;
            setPunkte(verdreifachtePunkte);
        }
    }

    public void verrringereGewinnPunkte()
    {
        int gewinnPunkte = getPunkteGewinn();
        int abzuziehendePunkte = getPunkte();
        int resulierendePunkte;

        resulierendePunkte = gewinnPunkte - abzuziehendePunkte;
        setPunkteGewinn(resulierendePunkte);
    }

    //Methode für switch von einem Spieler auf den anderen während einer Runde (benutzen des name Attributs)

}
