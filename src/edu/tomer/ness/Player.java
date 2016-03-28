package edu.tomer.ness;

import java.util.Date;
import java.util.Random;

/**
 * Created by Dev on 28/03/2016.
 */
public class Player {
    String name;
    String birthDate;
    Float height;
    int shirtNumber;

    int pctFromTheLine;
    int pctFromTwo;
    int pctFromThree;

    static Random randGen = new Random();

    public Player() {
        this.name = IO.getString("Enter Player name:");
        this.birthDate = IO.getString("Enter Birth date:");
        this.height = IO.getFloat("Enter height:");
        this.shirtNumber = IO.getInt("Enter shirt number:");
        this.pctFromTheLine = IO.getInt("Enter pct from the Line:");
        this.pctFromThree = IO.getInt("Enter pct from the Three:");
        this.pctFromTwo = IO.getInt("Enter pct from the Two:");
    }

    void dribble() {
        System.out.println("Dribbling");
    }

    boolean throwFromTwo() {
        int rand = randGen.nextInt(101);
        return rand <= pctFromTwo;
    }

    boolean throwFromThree() {
        int rand = randGen.nextInt(101);
        return rand <= pctFromThree;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", height=" + height +
                ", shirtNumber=" + shirtNumber +
                ", pctFromTheLine=" + pctFromTheLine +
                ", pctFromTwo=" + pctFromTwo +
                ", pctFromThree=" + pctFromThree +
                '}';
    }

    boolean throwFromTheLine() {
        int rand = randGen.nextInt(101);
        return rand <= pctFromTheLine;
    }
}
