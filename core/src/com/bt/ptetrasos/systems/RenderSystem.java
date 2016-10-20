package com.bt.ptetrasos.systems;

import com.artemis.BaseSystem;

/**
 * System that renders anything with an Image component associated with it.
 * Coordinates will be taken from Position component.
 * Also, they will be transformed to conform to the non-2D view.
 *
 * Currently, this is a blueprint for the BaseSystem, which is the most basic
 * type of system implemented.
 *
 * For more types of systems, refer to the AbstractScreen.
 *
 * TODO Write about Aspect
 */
public class RenderSystem extends BaseSystem {


    @Override
    protected void processSystem() {

    }
}
