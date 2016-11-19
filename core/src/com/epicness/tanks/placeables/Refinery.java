package com.epicness.placeables;

import com.epicness.assets.AssetManager;

/**
 * Created by Luchox on 03/10/2015.
 * Refinery
 */
public class Refinery extends Structure {
    public Refinery() {
        super(AssetManager.game.refineryNormal2, AssetManager.game.refineryGlow2, 5, 3, 2);
    }

    public void bulletCollision(Bullet bullet) {
        super.bulletCollision(bullet);
        if (health == 1) {
            regionNormal = AssetManager.game.refineryNormal1;
            regionGlow = AssetManager.game.refineryGlow1;
        }
    }
}
