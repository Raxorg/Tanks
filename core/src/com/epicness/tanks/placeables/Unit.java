package com.epicness.tanks.placeables;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.epicness.tanks.assets.AssetManager;

/**
 * Created by Luchox on 27/09/2015.
 * A class for the units
 */
public abstract class Unit extends Placeable {

    protected int health;

    protected Unit(TextureRegion regionNormal, TextureRegion regionGlow,
                   int cubeCost, int techCost, int health) {
        super(regionNormal, regionGlow, cubeCost, techCost);
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
