package com.epicness.tanks.map;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

import java.util.ArrayList;

/**
 * Created by Luchox on 26/09/2015.
 * A map
 */
public class Map {

    private float cellSize;
    private Cell[][] cells;
    private int rows, columns, maxPlayers;
    private MapData mapData;
    private ArrayList<Cell> blockedCells;

    public Map(float cellSize, MapData mapData) {
        this.cellSize = cellSize;
        this.mapData = mapData;
        rows = mapData.getNumRows();
        columns = mapData.getNumColumns();
        cells = new Cell[rows][columns];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                cells[r][c] = new Cell(r, c);
            }
        }
        maxPlayers = mapData.getMaxPlayers();
        blockedCells = new ArrayList<Cell>();
    }

    public void addToBlocked(Cell c) {
        blockedCells.add(c);
    }

    public ArrayList<Cell> getBlockedCells() {
        return blockedCells;
    }

    public String toString() {
        return mapData.getName().toUpperCase();
    }

    public float getCellSize() {
        return cellSize;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public TextureRegion getRegionGlow() {
        return mapData.getRegionGlow();
    }

    public TextureRegion getRegionNormal() {
        return mapData.getRegionNormal();
    }

    public MapData getMapData() {
        return mapData;
    }

    public float getWidth() {
        return columns * cellSize;
    }

    public float getHeight() {
        return rows * cellSize;
    }

    public Cell getCell(int row, int column) {
        if (row < 0 || column < 0 || row >= rows || column >= columns) {
            return null;
        }
        return cells[row][column];
    }

    public class Cell {
        private int row, column;
        private TextureRegion regionNormal, regionGlow;
        private com.epicness.tanks.placeables.Placeable content;

        public Cell(int row, int column) {
            this.row = row;
            this.column = column;
        }

        public int getRow() {
            return row;
        }

        public int getColumn() {
            return column;
        }

        public TextureRegion getRegionNormal() {
            return regionNormal;
        }

        public void setRegionNormal(TextureRegion region) {
            this.regionNormal = region;
        }

        public TextureRegion getRegionGlow() {
            return regionGlow;
        }

        public void setRegionGlow(TextureRegion regionGlow) {
            this.regionGlow = regionGlow;
        }

        public com.epicness.tanks.placeables.Placeable getContent() {
            return content;
        }

        public boolean setContent(com.epicness.tanks.placeables.Placeable p) {
            if (content == null) {
                content = p;
                p.setCell(this);
                return true;
            }
            return false;
        }

        public void clearContent() {
            content = null;
        }

        public boolean isEmpty() {
            return content == null;
        }

        public boolean isBlocked() {
            return mapData.getData()[row][column] == 1 || mapData.getData()[row][column] == 2;
        }

        public boolean isBaseCell() {
            return mapData.getData()[row][column] == 3;
        }
    }
}
