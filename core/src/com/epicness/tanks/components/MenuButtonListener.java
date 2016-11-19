package com.epicness.tanks.components;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.epicness.tanks.assets.AssetManager;

/**
 * Created by Luchox on 26/09/2015.
 * A button listener
 */
public class MenuButtonListener extends InputAdapter {

    private Button[] buttons;

    public void setButtons(Button[] buttons) {
        this.buttons = buttons;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        if (pointer != 0) {
            return false;
        }
        screenY = Gdx.graphics.getHeight() - screenY;
        for (Button b : buttons) {
            if (b.isWithin(screenX, screenY)) {
                AssetManager.sounds.buttonTouchUp.play();
                b.onTouchUp();
            }
        }
        return true;
    }
}
