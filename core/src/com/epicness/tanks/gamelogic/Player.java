package com.epicness.tanks.gamelogic;

import com.badlogic.gdx.graphics.Color;

/**
 * Created by Kevin Viscafe on 19/11/2016.
 */
public class Player {

    private Color color;
    private int team;

    public int getTeam() {
        return team;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
