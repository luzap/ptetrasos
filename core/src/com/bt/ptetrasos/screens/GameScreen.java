package com.bt.ptetrasos.screens;

import com.artemis.World;
import com.artemis.WorldConfiguration;
import com.artemis.WorldConfigurationBuilder;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.bt.ptetrasos.Constants;
import com.bt.ptetrasos.systems.*;

/**
 * Implementation of the AbstractScreen class for a generic Menu
 */
public class GameScreen extends AbstractScreen {
    Game game;

    public GameScreen(Game game) {
        this.game = game;
        WorldConfiguration config = new WorldConfigurationBuilder()
                .with(
                        // Put the systems you are going to use here, making sure that
                        // the render methods come last
                        // Also, make sure the order of the systems is logical, since they depend on one another
                        new CameraSystem(),
                        new KinematicsSystem(),
                        new GameWorldMapSystem("Starting"),


                        // render systems
                        new EntityRenderSystem(),
                        new RenderSystem()
                ).build();
        Constants.gameWorld = new World(config);
    }

    public void render(float deltaTime) {
        // clear the game
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        // process the menuWorld
        Constants.gameWorld.process();
    }
}

