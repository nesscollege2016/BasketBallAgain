package edu.tomer.ness;

/**
 * Created by Dev on 28/03/2016.
 */
public class Center extends Player {
    int numOfPasses;

    public Center() {
        super();
        this.numOfPasses  = IO.getInt("Enter num of passes");
    }

    @Override
    public String toString() {
        return "Center{" +
                "numOfPasses=" + numOfPasses +
                "} " + super.toString();
    }
}
