package com.epicness.tanks.gamelogic;

import java.util.ArrayList;

/**
 * Created by Luchox on 29/09/2015.
 * A team
 */
public class Team {

    private ArrayList<Player> players;
    private boolean defeated;
    private int team;

    public Team(int team) {
        players = new ArrayList<Player>();
        defeated = false;
        this.team = team;
    }

    public int getNumber() {
        return team;
    }

    public void addPlayer(Player p) {
        p.setTeam(this);
        players.add(p);
    }

    public void defeat() {
        defeated = true;
    }
}
