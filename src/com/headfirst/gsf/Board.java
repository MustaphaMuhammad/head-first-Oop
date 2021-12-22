package com.headfirst.gsf;

import java.util.ArrayList;
import java.util.List;

public class Board {


    public int width, height, longe;
    public List<ArrayList> tiles;


    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.longe = height;

        initialize();
    }


    private void initialize() {
        tiles = new ArrayList<>(width);
        for (int i = 0; i < width; i++) {
            tiles.add(i, new ArrayList(height));
            for (int j = 0; j < height; j++) {
                (tiles.get(i)).add(j, new Tile());
            }
        }
    }


    public Tile getTile(int x, int y) {
        return (Tile) tiles.get(x - 1).get(y - 1);
    }


    public void addUnit(Unit unit, int x, int y) {
        Tile tile = getTile(x, y);
        tile.addUnit(unit);
    }


    public void removeUnit(Unit unit, int x, int y){
        Tile tile = getTile(x, y);
        tile.removeUnit(unit);
    }


    public void removeUnits(int x, int y){
        Tile tile = getTile(x, y);
        tile.removeUnits();
    }

    //we delegate to the Tile class.
    //Since a tile stores the units on
    //it, it’s really the tile’s job to
    //handle retrieving those units.
    public List<ArrayList> getTiles(int x, int y) {
        return getTile(x, y).getUnits();
    }


}
