package edu.tomer.ness;

public class Main {

    public static void main(String[] args) {
        Team hapoelBeerSheva = new Team("Hapoel Beer Sheva!!!");
        Team clevland = new Team("Clevland Cavalears");

        for (int i = 0; i < 5; i++) {
            hapoelBeerSheva.addPlayer();
            clevland.addPlayer();
        }

        hapoelBeerSheva.teamThrowFromThree();
        clevland.teamThrowFromThree();//hamsa hamsa shum batzal
    }
}
