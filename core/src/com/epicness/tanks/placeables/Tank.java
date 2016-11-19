package com.epicness.tanks.placeables;

import com.epicness.tanks.assets.AssetManager;
import com.epicness.tanks.gamelogic.GameMaster;

/**
 * Created by Luchox on 27/09/2015.
 * The tankNormal
 */
public class Tank extends Unit {

    public Tank() {
        super(AssetManager.game.tank, 3, 1);
    }

    public void fireBullet() {
        Bullet bullet = new Bullet(this);
        GameMaster.getInstance().getWeaponManager().addBullet(bullet);
        AssetManager.sounds.fireBullet.play();
    }
}
