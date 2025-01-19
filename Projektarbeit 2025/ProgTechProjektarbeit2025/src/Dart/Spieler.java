package Dart;

public class Spieler {

    //Attribute
    private String name;
    private int gewinnPunkte = 301;

    //Konstruktor
    public Spieler(String name){     //wenn Spieler Objekte erstellt werden dann  ist GewinnPunkte fix, hat also keinen Nutzen hier
        this.name = name;
    }

    //Methoden
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;       //wenn Konstruktor ohne GewinnPunkte ist diese Methode redundant
    }

    public int getGewinnPunkte(){
        return gewinnPunkte;
    }

    public void setGewinnPunkte(int gewinnPunkte) {
        this.gewinnPunkte = gewinnPunkte;
    }
}
