package com.epicness.tanks.gamelogic;

import com.badlogic.gdx.graphics.Color;
import com.epicness.tanks.placeables.Placeable;

/**
 * Created by Kevin Viscafe on 19/11/2016.
 * Created by Luis Frontanilla on 19/11/2016
 */
public class Player {

    private Color color;
    private Team team;
    private int money;

    public Player(Team team) {
        this.team = team;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void removePlaceable(Placeable placeable) {

    }
}
