package com.bt.ptetrasos.systems;

import com.artemis.BaseSystem;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * System that renders anything with an Image component associated with it.
 * Coordinates will be taken from Position component.
 * Also, they will be transformed to conform to the non-2D view.
 * <p>
 * Currently, this is a blueprint for the BaseSystem, which is the most basic
 * type of system implemented.
 * <p>
 * For more types of systems, refer to the AbstractScreen.
 * <p>
 */
public class RenderSystem extends BaseSystem {

    SpriteBatch spriteBatch;

    @Override
    protected void processSystem() {
    }
}
