package com.epicness.tanks.assets;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by Luchox on 27/09/2015.
 * Asset manager
 */
public class AssetManager {
    private static AssetManager instance = new AssetManager();

    public static Fonts fonts;
    public static Menus menus;
    public static Sounds sounds;
    public static Game game;

    private AssetManager() {
        fonts = new Fonts();
        menus = new Menus();
        sounds = new Sounds();
        game = new Game();
    }

    public static AssetManager getInstance() {
        return instance;
    }


    public void loadFonts() {
        fonts.load();
    }

    public void loadMenus() {
        menus.load();
    }

    public void loadSounds() {
        sounds.load();
    }

    public void loadGame() {
        game.load();
    }

    public class Fonts {
        public BitmapFont normal, glow;

        private void load() {
            normal = new BitmapFont(Gdx.files.internal("Fonts/normal.fnt"));
            glow = new BitmapFont(Gdx.files.internal("Fonts/glow.fnt"));
        }
    }

    public class Menus {
        // Common
        public Texture commonMenuButtons, loadingCircle, victory;
        public TextureRegion backNormal, backGlow, loadingCircleRegion;
        // Main menu
        public Texture mainMenuButtons;
        public TextureRegion playNormal, playGlow, optionsNormal, optionsGlow,
                scoresNormal, scoresGlow, creditsNormal, creditsGlow;
        // Mode selection
        public Texture modeSelectionButtons;
        public TextureRegion missionsNormal, missionsGlow, tutorialNormal, tutorialGlow,
                multiplayerNormal, multiplayerGlow;
        // Multiplayer
        public Texture multiplayerButtons;
        public TextureRegion mapNormal, mapGlow, playersNormal, playersGlow, beginNormal, beginGlow;
        // Map selection
        public Texture mapAtlasA;
        public TextureRegion defaultNormal, defaultGlow, squareNormal, squareGlow;
        public TextureRegion nextNormal, nextGlow;
        // Player selection
        public Texture editing;
        public TextureRegion editNormal, editGlow, emptyFrameNormal, emptyFrameGlow,
                plusNormal, plusGlow;

        private void load() {
            // Common
            commonMenuButtons = new Texture("Images/Menus/commonButtons.png");
            loadingCircle = new Texture("Images/loading.png");
            victory = new Texture("Images/victory.png");
            loadingCircleRegion = new TextureRegion(loadingCircle);
            backNormal = new TextureRegion(commonMenuButtons, 0, 0, 512, 512);
            backGlow = new TextureRegion(commonMenuButtons, 0, 512, 512, 512);
            // Main menu
            mainMenuButtons = new Texture("Images/Menus/mainMenuButtons.png");
            playNormal = new TextureRegion(mainMenuButtons, 0, 512, 1536, 512);
            playGlow = new TextureRegion(mainMenuButtons, 0, 1536, 1536, 512);
            optionsNormal = new TextureRegion(mainMenuButtons, 1536, 0, 1536, 512);
            optionsGlow = new TextureRegion(mainMenuButtons, 1536, 1024, 1536, 512);
            scoresNormal = new TextureRegion(mainMenuButtons, 1536, 512, 1536, 512);
            scoresGlow = new TextureRegion(mainMenuButtons, 1536, 1536, 1536, 512);
            creditsNormal = new TextureRegion(mainMenuButtons, 0, 0, 1536, 512);
            creditsGlow = new TextureRegion(mainMenuButtons, 0, 1024, 1536, 512);
            // Mode selection
            modeSelectionButtons = new Texture("Images/Menus/modeSelectionButtons.png");
            missionsNormal = new TextureRegion(modeSelectionButtons, 0, 0, 1536, 512);
            missionsGlow = new TextureRegion(modeSelectionButtons, 0, 512, 1536, 512);
            tutorialNormal = new TextureRegion(modeSelectionButtons, 1536, 0, 1536, 512);
            tutorialGlow = new TextureRegion(modeSelectionButtons, 1536, 512, 1536, 512);
            multiplayerNormal = new TextureRegion(modeSelectionButtons, 0, 1024, 1536, 512);
            multiplayerGlow = new TextureRegion(modeSelectionButtons, 0, 1536, 1536, 512);
            // Multiplayer
            multiplayerButtons = new Texture("Images/Menus/multiplayerButtons.png");
            mapNormal = new TextureRegion(multiplayerButtons, 0, 0, 1536, 512);
            mapGlow = new TextureRegion(multiplayerButtons, 0, 512, 1536, 512);
            playersNormal = new TextureRegion(multiplayerButtons, 1536, 0, 1536, 512);
            playersGlow = new TextureRegion(multiplayerButtons, 1536, 512, 1536, 512);
            beginNormal = new TextureRegion(multiplayerButtons, 0, 1024, 1536, 512);
            beginGlow = new TextureRegion(multiplayerButtons, 0, 1536, 1536, 512);
            // Map selection
            mapAtlasA = new Texture("Images/Menus/mapAtlasA.png");
            defaultNormal = new TextureRegion(mapAtlasA, 0, 0, 1024, 1024);
            defaultGlow = new TextureRegion(mapAtlasA, 1024, 0, 1024, 1024);
            squareNormal = new TextureRegion(mapAtlasA, 0, 1024, 1024, 1024);
            squareGlow = new TextureRegion(mapAtlasA, 1024, 1024, 1024, 1024);
            nextNormal = new TextureRegion(commonMenuButtons, 512, 0, 512, 512);
            nextGlow = new TextureRegion(commonMenuButtons, 512, 512, 512, 512);
            // Player selection
            editing = new Texture("Images/Menus/editing.png");
            editNormal = new TextureRegion(editing, 0, 0, 512, 512);
            editGlow = new TextureRegion(editing, 512, 0, 512, 512);
            plusNormal = new TextureRegion(editing, 1024, 0, 512, 512);
            plusGlow = new TextureRegion(editing, 1536, 0, 512, 512);
            emptyFrameNormal = new TextureRegion(editing, 0, 512, 2048, 512);
            emptyFrameGlow = new TextureRegion(editing, 0, 1024, 2048, 512);
        }
    }

    public class Sounds {
        public Music background;
        public Sound buttonTouchUp;
        public Sound explosion, fireBullet;

        private void load() {
            background = Gdx.audio.newMusic(Gdx.files.internal("Sounds/Music/background.wav"));
            buttonTouchUp = Gdx.audio.newSound(Gdx.files.internal("Sounds/Menus/buttonTouchUp.ogg"));

            explosion = Gdx.audio.newSound(Gdx.files.internal("Sounds/Game/explosion.wav"));
            fireBullet = Gdx.audio.newSound(Gdx.files.internal("Sounds/Game/firebullet.wav"));
        }
    }

    public class Game {

        public Texture black, transparent;
        public Texture cube, potion;
        public Texture cells, units, structures;
        public Texture gameBarButtons;
        public TextureRegion defaultCellNormal, defaultCellGlow, blockedCellNormal, blockedCellGlow,
                disabledCellNormal, disabledCellGlow, baseCellNormal, baseCellGlow;
        public TextureRegion tankNormal, tankGlow, wallNormal3, wallGlow3, wallNormal2, wallGlow2,
                wallNormal1, wallGlow1, bulletNormal, bulletGlow, baseNormal4, baseGlow4,
                baseNormal3, baseGlow3, baseNormal2, baseGlow2, baseNormal1, baseGlow1,
                refineryNormal2, refineryGlow2, refineryNormal1, refineryGlow1,
                laboratoryNormal2, laboratoryGlow2, laboratoryNormal1, laboratoryGlow1;
        public TextureRegion pauseNormal, pauseGlow, buyNormal, buyGlow, endNormal, endGlow,
                observeNormal, observeGlow;

        private void load() {
            black = new Texture("Colors/black.png");
            transparent = new Texture("Colors/transparent.png");

            cube = new Texture("Images/Game/Specials/cube.png");
            potion = new Texture("Images/Game/Specials/potion.png");

            cells = new Texture("Images/Game/cells.png");
            units = new Texture("Images/Game/Placeables/units.png");
            structures = new Texture("Images/Game/Placeables/structures.png");

            gameBarButtons = new Texture("Images/Game/HUDButtons/gameBarButtons.png");

            defaultCellNormal = new TextureRegion(cells, 0, 0, 64, 64);
            defaultCellGlow = new TextureRegion(cells, 0, 64, 64, 64);
            blockedCellNormal = new TextureRegion(cells, 64, 0, 64, 64);
            blockedCellGlow = new TextureRegion(cells, 64, 64, 64, 64);
            disabledCellNormal = new TextureRegion(cells, 128, 0, 64, 64);
            disabledCellGlow = new TextureRegion(cells, 128, 64, 64, 64);
            baseCellNormal = new TextureRegion(cells, 192, 0, 64, 64);
            baseCellGlow = new TextureRegion(cells, 192, 64, 64, 64);

            tankNormal = new TextureRegion(units, 0, 0, 64, 64);
            tankGlow = new TextureRegion(units, 0, 64, 64, 64);

            wallNormal3 = new TextureRegion(structures, 0, 0, 64, 64);
            wallGlow3 = new TextureRegion(structures, 0, 64, 64, 64);
            wallNormal2 = new TextureRegion(structures, 64, 0, 64, 64);
            wallGlow2 = new TextureRegion(structures, 64, 64, 64, 64);
            wallNormal1 = new TextureRegion(structures, 128, 0, 64, 64);
            wallGlow1 = new TextureRegion(structures, 128, 64, 64, 64);

            baseNormal4 = new TextureRegion(structures, 192, 0, 64, 64);
            baseGlow4 = new TextureRegion(structures, 192, 64, 64, 64);
            baseNormal3 = new TextureRegion(structures, 256, 0, 64, 64);
            baseGlow3 = new TextureRegion(structures, 256, 64, 64, 64);
            baseNormal2 = new TextureRegion(structures, 320, 0, 64, 64);
            baseGlow2 = new TextureRegion(structures, 320, 64, 64, 64);
            baseNormal1 = new TextureRegion(structures, 384, 0, 64, 64);
            baseGlow1 = new TextureRegion(structures, 384, 64, 64, 64);

            refineryNormal2 = new TextureRegion(structures, 0, 128, 64, 64);
            refineryGlow2 = new TextureRegion(structures, 0, 192, 64, 64);
            refineryNormal1 = new TextureRegion(structures, 64, 128, 64, 64);
            refineryGlow1 = new TextureRegion(structures, 64, 192, 64, 64);

            laboratoryNormal2 = new TextureRegion(structures, 128, 128, 64, 64);
            laboratoryGlow2 = new TextureRegion(structures, 128, 192, 64, 64);
            laboratoryNormal1 = new TextureRegion(structures, 192, 128, 64, 64);
            laboratoryGlow1 = new TextureRegion(structures, 192, 192, 64, 64);

            bulletNormal = new TextureRegion(units, 64, 0, 64, 64);
            bulletGlow = new TextureRegion(units, 64, 64, 64, 64);

            pauseNormal = new TextureRegion(gameBarButtons, 0, 0, 512, 512);
            pauseGlow = new TextureRegion(gameBarButtons, 0, 512, 512, 512);
            endNormal = new TextureRegion(gameBarButtons, 512, 0, 512, 512);
            endGlow = new TextureRegion(gameBarButtons, 512, 512, 512, 512);
            buyNormal = new TextureRegion(gameBarButtons, 1024, 0, 512, 512);
            buyGlow = new TextureRegion(gameBarButtons, 1024, 512, 512, 512);
            observeNormal = new TextureRegion(gameBarButtons, 1536, 0, 512, 512);
            observeGlow = new TextureRegion(gameBarButtons, 1536, 512, 512, 512);
        }
    }
}
