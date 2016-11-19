package com.epicness.tanks.placeables;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.epicness.tanks.gamelogic.GameMaster;
import com.epicness.tanks.gamelogic.Player;
import com.epicness.tanks.map.Map;

/**
 * Created by Luchox on 27/09/2015.
 * The interface for everything that can be placed on a map
 */
public abstract class Placeable {

    protected TextureRegion region;
    protected float angle;
    protected int cost;
    protected Map.Cell cell;
    protected Player owner;

    protected Placeable(TextureRegion texture, int cost) {
        this.region = texture;
        this.cost = cost;
    }

    public TextureRegion getRegion() {
        return region;
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }

    public int getCost() {
        return cost;
    }

    public boolean place(Map.Cell cell) {
        return cell.setContent(this);
    }

    protected void destroy() {
        owner.removePlaceable(this);
    }

    public Map.Cell getCell() {
        return cell;
    }

    public void setCell(Map.Cell cell) {
        this.cell = cell;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player player) {
        owner = player;
    }

    public float getXPos() {
        return cell.getColumn() * GameMaster.getInstance().getMap().getCellSize();
    }

    public float getYPos() {
        return cell.getRow() * GameMaster.getInstance().getMap().getCellSize();
    }
}
