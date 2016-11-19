package com.epicness.tanks.placeables;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.epicness.tanks.assets.AssetManager;

/**
 * Created by Luchox on 27/09/2015.
 * A class for the units
 */
public abstract class Unit extends Placeable {

    protected int health;

    protected Unit(TextureRegion texture, int cost, int health) {
        super(texture, cost);
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
