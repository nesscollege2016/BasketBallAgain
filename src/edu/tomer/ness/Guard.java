package edu.tomer.ness;

/**
 * Created by Dev on 28/03/2016.
 */
public class Guard extends Player {
    float numOfBlocks;

    public Guard() {
        //super();
        this.numOfBlocks = IO.getFloat("Enter number of blocks:");
    }

    @Override
    public String toString() {
        return "Guard{" +
                "numOfBlocks=" + numOfBlocks +
                "} " + super.toString();
    }
}
