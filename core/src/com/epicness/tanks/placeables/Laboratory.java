package com.epicness.placeables;

import com.epicness.assets.AssetManager;

/**
 * Created by Luchox on 03/10/2015.
 * Laboratory
 */
public class Laboratory extends Structure {
    public Laboratory() {
        super(AssetManager.game.laboratoryNormal2, AssetManager.game.laboratoryGlow2, 5, 3, 2);
    }

    public void bulletCollision(Bullet bullet) {
        super.bulletCollision(bullet);
        if (health == 1) {
            regionNormal = AssetManager.game.laboratoryNormal1;
            regionGlow = AssetManager.game.laboratoryGlow1;
        }
    }
}
