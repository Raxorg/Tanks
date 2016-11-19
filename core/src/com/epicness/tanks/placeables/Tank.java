package com.epicness.tanks.placeables;

import com.epicness.tanks.assets.AssetManager;
import com.epicness.gamelogic.GameMaster;

/**
 * Created by Luchox on 27/09/2015.
 * The tankNormal
 */
public class Tank extends Unit {

    public Tank() {
        super(AssetManager.game.tankNormal, AssetManager.game.tankGlow, 3, 0, 1);
    }

    public void fireBullet() {
        Bullet bullet = new Bullet(this);
        GameMaster.getInstance().getWeaponManager().addBullet(bullet);
        AssetManager.sounds.fireBullet.play();
    }
}
