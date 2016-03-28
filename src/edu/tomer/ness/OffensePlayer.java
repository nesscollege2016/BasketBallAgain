package edu.tomer.ness;

/**
 * Created by Dev on 28/03/2016.
 */
public class OffensePlayer extends Player {
    int numOffensiveFouls;

    public OffensePlayer() {
        super();
        this.numOffensiveFouls = IO.getInt("Enter number of offensive fouls");
    }

    @Override
    public String toString() {
        return "OffensePlayer{" +
                "numOffensiveFouls=" + numOffensiveFouls +
                "} " + super.toString();
    }
}
