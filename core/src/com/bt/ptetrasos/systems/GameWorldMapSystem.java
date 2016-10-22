package com.bt.ptetrasos.systems;

/**
 * Created by Titas on 2016-07-27.
 */

import com.artemis.BaseSystem;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.maps.Map;


import java.util.HashMap;


/**
 * System used to for map handling.
 */

public class GameWorldMapSystem extends BaseSystem {

    String TAG = GameWorldMapSystem.class.getName();

    private boolean isSetup = false;
    private HashMap<String, String> maps = new HashMap<String, String>();



    CameraSystem cameraSystem;
    String activeMapName;

    public void addMap(String name, String filepath) {
        maps.put(name, filepath);
    }

    public GameWorldMapSystem(String startingMap) {
        this.activeMapName = startingMap;
    }

    protected void initialize() {
        // add all of the maps and their reference names here
        addMap("test", "testmap.txt");
        setActiveMap(activeMapName);
        Gdx.app.debug(TAG, "Initialized with map: " + activeMapName);
    }

    public void setActiveMap(String activeMapName) {

        this.activeMapName = activeMapName;

        Gdx.app.debug(TAG, "activeMap changed");
        cameraSystem.reset();


    }


    @Override
    protected void processSystem() {

        if ( !isSetup )
        {
            isSetup = true;
        }
    }

}

