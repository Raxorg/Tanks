package com.epicness.placeables;

import com.epicness.assets.AssetManager;

/**
 * Created by Luchox on 27/09/2015.
 * The wallNormal3
 */
public class Wall extends Structure {

    public Wall() {
        super(AssetManager.game.wallNormal3, AssetManager.game.wallGlow3, 2, 0, 3);
    }

    public void bulletCollision(Bullet bullet) {
        super.bulletCollision(bullet);
        if (health == 2) {
            regionNormal = AssetManager.game.wallNormal2;
            regionGlow = AssetManager.game.wallGlow2;
        }
        if (health == 1) {
            regionNormal = AssetManager.game.wallNormal1;
            regionGlow = AssetManager.game.wallGlow1;
        }
    }
}
