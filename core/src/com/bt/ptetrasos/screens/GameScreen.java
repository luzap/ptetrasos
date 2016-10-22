package com.bt.ptetrasos.screens;

import com.artemis.WorldConfiguration;
import com.artemis.WorldConfigurationBuilder;
import com.badlogic.gdx.Game;
import com.artemis.World;
import com.bt.ptetrasos.systems.*;

/**
 * Implementation of the AbstractScreen class for a generic Menu
 */
public class GameScreen extends AbstractScreen {
    Game game;
    World world;


    public GameScreen(Game game) {
        this.game = game;

        WorldConfiguration config = new WorldConfigurationBuilder()
                .with(
                        // Put the systems you are going to use here, making sure that
                        // the render methods come last
                        // Also, make sure the order of the systems is logical, since they depend on one another
                      new PositionSystem(),
                        new CameraSystem(),
                        new KinematicsSystem(),
                        new GameWorldMapSystem("Starting"),


                        // render systems
                        new RenderSystem()
                ).build();
    }
}
