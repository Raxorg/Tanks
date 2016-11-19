package com.epicness.placeables;

import com.epicness.assets.AssetManager;

/**
 * Created by Luchox on 03/10/2015.
 * A base
 */
public class Base extends Structure {
    public Base() {
        super(AssetManager.game.baseNormal4, AssetManager.game.baseGlow4, 0, 0, 4);
    }

    public void bulletCollision(Bullet bullet) {
        super.bulletCollision(bullet);
        if (health == 3) {
            regionNormal = AssetManager.game.baseNormal3;
            regionGlow = AssetManager.game.baseGlow3;
        }
        if (health == 2) {
            regionNormal = AssetManager.game.baseNormal2;
            regionGlow = AssetManager.game.baseGlow2;
        }
        if (health == 1) {
            regionNormal = AssetManager.game.baseNormal1;
            regionGlow = AssetManager.game.baseGlow1;
        }
    }
}
