package com.epicness.tanks.map;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.epicness.tanks.assets.AssetManager;

/**
 * Created by Luchox on 27/09/2015.
 * a class that stores the maps
 */
public class MapData {

    public static MapData defaultMap, squareMap;
    private TextureRegion mapNormal, mapGlow;
    private String name;
    private int[][] data;
    private int maxPlayers;

    public MapData(String name, int[][] data, int maxPlayers,
                   TextureRegion regionNormal, TextureRegion regionGlow) {
        this.data = data;
        mapNormal = regionNormal;
        mapGlow = regionGlow;
        this.name = name;
        this.maxPlayers = maxPlayers;
    }

    public static void init() {
        int[][] defaultMapData = {
                {0, 0, 0, 1, 0, 0, 0, 0, 2, 0, 0, 0},
                {0, 3, 0, 1, 0, 0, 0, 0, 2, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 2, 0, 0, 0, 0, 1, 0, 3, 0},
                {0, 0, 0, 2, 0, 0, 0, 0, 1, 0, 0, 0}
        };
        defaultMap = new MapData(
                "DEFAULT",
                defaultMapData,
                2,
                AssetManager.menus.defaultNormal,
                AssetManager.menus.defaultGlow
        );
        int[][] squareMapData = {
                {0, 0, 0, 2, 0, 0, 0, 0, 2, 0, 0, 0},
                {0, 3, 0, 2, 0, 0, 0, 0, 2, 0, 3, 0},
                {0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                {2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 2, 2, 0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0, 2, 2, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2},
                {0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 3, 0, 2, 0, 0, 0, 0, 2, 0, 3, 0},
                {0, 0, 0, 2, 0, 0, 0, 0, 2, 0, 0, 0}
        };
        squareMap = new MapData(
                "SQUARE",
                squareMapData,
                4,
                AssetManager.menus.squareNormal,
                AssetManager.menus.squareGlow
        );
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public String getName() {
        return name;
    }

    public int[][] getData() {
        return data;
    }

    public TextureRegion getRegionNormal() {
        return mapNormal;
    }

    public TextureRegion getRegionGlow() {
        return mapGlow;
    }

    public int getNumRows() {
        return data.length;
    }

    public int getNumColumns() {
        return data[0].length;
    }
}
