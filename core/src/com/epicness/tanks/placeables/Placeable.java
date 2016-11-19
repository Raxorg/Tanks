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

    protected TextureRegion regionNormal, regionGlow;
    protected float angle;
    protected int cubeCost, techCost;
    protected Map.Cell cell;
    protected Player owner;

    protected Placeable(TextureRegion regionNormal, TextureRegion regionGlow,
                        int cubeCost, int techCost) {
        this.regionNormal = regionNormal;
        this.regionGlow = regionGlow;
        this.cubeCost = cubeCost;
        this.techCost = techCost;
    }

    public TextureRegion getRegionNormal() {
        return regionNormal;
    }

    public TextureRegion getRegionGlow() {
        return regionGlow;
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }

    public int getCubeCost() {
        return cubeCost;
    }

    public int getTechCost() {
        return techCost;
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
