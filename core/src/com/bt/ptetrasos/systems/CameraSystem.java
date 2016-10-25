package com.bt.ptetrasos.systems;

import com.artemis.BaseSystem;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;


public class CameraSystem extends BaseSystem {
    /**
     * This class serves to create a camera that will be used to scroll through the game.
     * This single camera is used everywhere throughout one world of the game.
     */
    public final OrthographicCamera camera;

    public static float getZOOM() {
        return ZOOM;
    }

    public static void setZOOM(float ZOOM) {
        CameraSystem.ZOOM = ZOOM;
    }

    public static float ZOOM = 1f;

    public CameraSystem() {
        camera = new OrthographicCamera(Gdx.graphics.getWidth() * ZOOM, Gdx.graphics.getHeight() * ZOOM);
        camera.setToOrtho(false, Gdx.graphics.getWidth() * ZOOM, Gdx.graphics.getHeight() * ZOOM);
        camera.update();

    }

    @Override
    protected void processSystem() {
        camera.update();
    }

    public void reset() {
        this.camera.position.x = 0;
        this.camera.position.y = 0;
        camera.setToOrtho(false, Gdx.graphics.getWidth() * ZOOM, Gdx.graphics.getHeight() * ZOOM);
        camera.update();
    }
}