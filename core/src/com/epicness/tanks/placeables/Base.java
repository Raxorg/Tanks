package com.epicness.tanks.placeables;

import com.epicness.tanks.assets.AssetManager;

/**
 * Created by Luchox on 03/10/2015.
 * A base
 */
public class Base extends Structure {
    public Base() {
        super(AssetManager.game.base3, 0, 3);
    }

    public void bulletCollision(Bullet bullet) {
        super.bulletCollision(bullet);
        if (health == 2) {
            region = AssetManager.game.base2;
        } else
        if (health == 1) {
            region = AssetManager.game.base1;
        }
    }
}
