package com.epicness.tanks.placeables;

import com.badlogic.gdx.utils.Timer;
import com.epicness.tanks.assets.AssetManager;
import com.epicness.tanks.gamelogic.GameMaster;
import com.epicness.tanks.gamelogic.Team;

/**
 * Created by Luchox on 01/10/2015.
 * Bullet
 */
public class Bullet extends Special {

    private float xPos, yPos, initXPos, initYPos;
    private Timer timer;

    public Bullet(Tank tank) {
        super(AssetManager.game.bulletNormal, AssetManager.game.bulletGlow, 0, 0);

        xPos = tank.cell.getColumn() * GameMaster.getInstance().getMap().getCellSize();
        yPos = tank.cell.getRow() * GameMaster.getInstance().getMap().getCellSize();
        initXPos = xPos;
        initYPos = yPos;
        angle = tank.angle;
        owner = tank.owner;
        timer = new Timer();
    }

    public float getInitYPos() {
        return initYPos;
    }

    public float getInitXPos() {
        return initXPos;
    }

    public float getXPos() {
        return xPos;
    }

    public float getYPos() {
        return yPos;
    }

    public void setXPos(float xPos) {
        this.xPos = xPos;
    }

    public void setYPos(float yPos) {
        this.yPos = yPos;
    }

    public Team getTeam() {
        return owner.getTeam();
    }

    public void destroy() {
        timer.clear();
        GameMaster.getInstance().getWeaponManager().removeBullet(this);
    }

}
