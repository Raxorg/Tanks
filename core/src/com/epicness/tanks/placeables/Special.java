package com.epicness.placeables;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by Luchox on 01/10/2015.
 * Special
 */
public abstract class Special extends Placeable {

    protected Special(TextureRegion regionNormal, TextureRegion regionGlow,
                      int cubeCost, int techCost) {
        super(regionNormal, regionGlow, cubeCost, techCost);
    }
}
