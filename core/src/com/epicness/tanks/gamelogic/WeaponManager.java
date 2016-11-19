package com.epicness.tanks.gamelogic;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.epicness.tanks.assets.AssetManager;
import com.epicness.tanks.map.Map;
import com.epicness.tanks.placeables.Bullet;
import com.epicness.tanks.placeables.Structure;
import com.epicness.tanks.placeables.Unit;

import java.util.ArrayList;

/**
 * Created by Luchox on 29/09/2015.
 * Detector
 */
public class WeaponManager {

    private ArrayList<Bullet> bullets;

    public WeaponManager() {
        bullets = new ArrayList<Bullet>();
    }

    public void addBullet(Bullet bullet) {
        Gdx.input.setInputProcessor(null);
        bullets.add(bullet);
    }

    public void removeBullet(Bullet bullet) {
        bullets.remove(bullet);
        if (bullets.size() == 0) {
            GameMaster.getInstance().getTurnObserver().passTurn();
            GameMaster.getInstance().activateInput(0);
        }
    }

    public void render(SpriteBatch batch, float alpha) {
        batch.begin();
        for (Bullet b : bullets) {
            batch.setColor(1, 1, 1, alpha);
            batch.draw(
                    AssetManager.game.bulletNormal,
                    b.getXPos(),
                    b.getYPos(),
                    GameMaster.getInstance().getMap().getCellSize() / 2,
                    GameMaster.getInstance().getMap().getCellSize() / 2,
                    GameMaster.getInstance().getMap().getCellSize(),
                    GameMaster.getInstance().getMap().getCellSize(),
                    1,
                    1,
                    b.getAngle()
            );
            batch.setColor(GameMaster.getInstance().getColorWithAlpha(
                            b.getOwner().getColor()
                    )
            );
            batch.draw(
                    AssetManager.game.bulletGlow,
                    b.getXPos(),
                    b.getYPos(),
                    GameMaster.getInstance().getMap().getCellSize() / 2,
                    GameMaster.getInstance().getMap().getCellSize() / 2,
                    GameMaster.getInstance().getMap().getCellSize(),
                    GameMaster.getInstance().getMap().getCellSize(),
                    1,
                    1,
                    b.getAngle()
            );
        }
        batch.end();
        checkForCollision();
        moveBullets();
    }

    private void checkForCollision() {
        for (Bullet b : bullets) {
            for (Player p : GameMaster.getInstance().getPlayers()) {
                if (p.getTeam() != b.getTeam()) {
                    for (Structure s : p.getStructures()) {
                        if (!(b.getXPos() > s.getXPos() + 9 ||
                                b.getXPos() + 9 < s.getXPos() ||
                                b.getYPos() > s.getYPos() + 9 ||
                                b.getYPos() + 9 < s.getYPos())) {
                            s.bulletCollision(b);
                            return;
                        }
                    }
                    for (Unit u : p.getUnits()) {
                        if (!(b.getXPos() > u.getXPos() + 9 ||
                                b.getXPos() + 9 < u.getXPos() ||
                                b.getYPos() > u.getYPos() + 9 ||
                                b.getYPos() + 9 < u.getYPos())) {
                            u.bulletCollision(b);
                            return;
                        }
                    }
                }
            }
            for (Map.Cell c : GameMaster.getInstance().getMap().getBlockedCells()) {
                if (!(b.getXPos() > c.getColumn() * 20 + 9 ||
                        b.getXPos() + 9 < c.getColumn() * 20 ||
                        b.getYPos() > c.getRow() * 20 + 9 ||
                        b.getYPos() + 9 < c.getRow() * 20)) {
                    b.destroy();
                    AssetManager.sounds.explosion.play();
                    return;
                }
            }
        }
    }

    private void moveBullets() {
        for (Bullet b : bullets) {
            b.setXPos((float) (b.getXPos() + (Math.cos(Math.toRadians(b.getAngle() + 90)))));
            b.setYPos((float) (b.getYPos() + (Math.sin(Math.toRadians(b.getAngle() + 90)))));
            if (b.getXPos() >= GameMaster.getInstance().getMap().getColumns() * 20 ||
                    b.getYPos() >= GameMaster.getInstance().getMap().getRows() * 20 ||
                    b.getXPos() <= -20 || b.getYPos() <= -20) {
                b.destroy();
                return;
            }
            // TESTING
            if (Math.abs(b.getXPos() - b.getInitXPos()) >= 65 ||
                    Math.abs(b.getYPos() - b.getInitYPos()) >= 65) {
                b.destroy();
                return;
            }
        }
    }
}
