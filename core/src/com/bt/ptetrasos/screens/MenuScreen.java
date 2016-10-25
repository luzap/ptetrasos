package com.bt.ptetrasos.screens;

import com.artemis.World;
import com.artemis.WorldConfiguration;
import com.artemis.WorldConfigurationBuilder;
import com.badlogic.gdx.Game;
import com.bt.ptetrasos.systems.PositionSystem;

/**
 * Implementation of the AbstractScreen class for a generic Menu
 */
public class MenuScreen extends AbstractScreen {
    Game game;
    World world;

    public MenuScreen(Game game) {
        this.game = game;

        WorldConfiguration config = new WorldConfigurationBuilder()
                .with(
                        // Put the systems you are going to use here, making sure that
                        // the render methods come last
                        new PositionSystem()
                ).build();
    }
}
