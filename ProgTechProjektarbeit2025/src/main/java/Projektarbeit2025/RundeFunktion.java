package Projektarbeit2025;

public class RundeFunktion extends Spiel{

    public RundeFunktion(int punkte, String name) {
        super(punkte, name);
    }

    //Attribute
    private boolean doppeltePunkte;
    private boolean verdreifachePunkte;

    public void verdoppelPunkte()
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

}
