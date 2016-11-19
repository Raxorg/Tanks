package com.epicness.tanks.gamelogic;

/**
 * Created by Kevin Viscafe on 19/11/2016.
 * Created by Luis Frontanilla on 19/11/2016.
 */
public class GameMaster {

    private static GameMaster instance = new GameMaster();

    private GameMaster() {

    }

    public static GameMaster getInstance() {
        return instance;
    }

}
