package com.bt.ptetrasos.util;

import java.util.ArrayList;

/**
 * Utility used to process custom made maps
 */
public class Map {

    ArrayList<MapObject> mapObjects = new ArrayList<MapObject>();

    public void addMapObject(MapObject mapObject) {
        mapObjects.add(mapObject);
    }

    public void createFromFile(String filepath){

    }
}
