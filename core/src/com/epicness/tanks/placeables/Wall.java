package com.epicness.tanks.placeables;

import com.epicness.tanks.assets.AssetManager;

/**
 * Created by Luchox on 27/09/2015.
 * The wallNormal3
 */
public class Wall extends Structure {

    public Wall() {
        super(AssetManager.game.wall3, 2, 3);
    }

    public void bulletCollision(Bullet bullet) {
        super.bulletCollision(bullet);
        if (health == 2) {
            region = AssetManager.game.wall2;
        }
        if (health == 1) {
            region = AssetManager.game.wall1;
        }
    }
}
