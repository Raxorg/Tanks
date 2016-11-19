package com.epicness.tanks.placeables;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.epicness.tanks.assets.AssetManager;

/**
 * Created by Luchox on 27/09/2015.
 * A class for the structures
 */
public abstract class Structure extends Placeable {

    protected int health;

    protected Structure(TextureRegion region, int cost, int health) {
        super(region, cost);
        this.health = health;
    }

    public void bulletCollision(Bullet bullet) {
        AssetManager.sounds.explosion.play();
        health--;
        if (health == 0) {
            destroy();
        }
        bullet.destroy();
    }
}
