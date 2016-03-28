package edu.tomer.ness;

import java.util.ArrayList;

/**
 * Created by Dev on 28/03/2016.
 */
public class Team {
    String name;
    ArrayList<Player> players = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }
    //Methods:
    void addPlayer(/*String types*/){
        Player p = new Player();
        players.add(p);
    }

    void dispPlayers(){
        for (Player player : players) {
            System.out.println(player.toString());
        }
    }

    void teamThrowFromThree(){
        int sum = 0;

        for (Player p : players) {
            if (p.throwFromThree()) {
                sum += 3;
                System.out.println(p.name + " Scored");
            }else {
                System.out.println(p.name + " Failed Miserably");
            }
        }
        System.out.println(name +": " + sum);
    }
}
