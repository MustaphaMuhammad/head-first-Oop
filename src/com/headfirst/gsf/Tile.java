package com.headfirst.gsf;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Tile {


    private List  units;


    public Tile(){
        units = new LinkedList();
    }


    protected void addUnit(Unit unit) {
        units.add(unit);
    }


    protected void removeUnit(Unit unit) {
        units.remove(unit);
    }


    protected void removeUnits() {
        for(int i = 0; i< units.size(); i ++ ){
            removeUnit((Unit)units.get(i));
        }
    }


    public List<ArrayList> getUnits() {
        return units;
    }
}
