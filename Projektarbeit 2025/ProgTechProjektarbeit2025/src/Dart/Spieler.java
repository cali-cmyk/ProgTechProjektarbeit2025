package Dart;

public class Spieler {

    //Attribute
    private String name;
    private static int gewinnPunkte = 301;

    //Konstruktor
    public Spieler(String name){     //wenn Spieler Objekte erstellt werden dann ist GewinnPunkte fix, hat also keinen Nutzen hier
        this.name = name;
    }

    //Methoden---------------------------------------------------
    public String getName(){
        return name;
    }

    public static int getGewinnPunkte(){
        return gewinnPunkte;
    }

    public static void setGewinnPunkte(int gewinnPunkte) {
        Spieler.gewinnPunkte = gewinnPunkte;
    }
}
