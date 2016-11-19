package com.epicness.components;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by Luchox on 26/09/2015.
 * A button
 */
public abstract class Button {

    private TextureRegion normalRegion;
    private TextureRegion glowingRegion;
    private float x;
    private float y;
    private float width;
    private float height;
    protected Color color;

    public Button(TextureRegion normalRegion, TextureRegion glowingRegion, float x, float y,
                  float width, float height, Color color) {
        this.normalRegion = normalRegion;
        this.glowingRegion = glowingRegion;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public boolean isWithin(int x, int y) {
        return x >= this.x && x <= this.x + width
                && y >= this.y && y <= this.y + height;
    }

    public abstract void onTouchUp();

    public TextureRegion getNormalRegion() {
        return normalRegion;
    }
    
    public TextureRegion getGlowingRegion() {
        return glowingRegion;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
