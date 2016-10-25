package com.bt.ptetrasos.screens;

import com.badlogic.gdx.Screen;

/**
 * Artemis operates in terms of screens, where all of the systems are added.
 * <p>
 * The constructor of a Screen must add all of the systems that are going to be used in that instance.
 * <p>
 * The possible types of systems are:
 * <ul>
 * <li>BaseSystem - the most basic type of system. Every other system is subclass thereof.</li>
 * <li>IntervalSystem - entity system processed every certain interval.</li>
 * <li>DelayedIteratingSystem - tracks cooldown per entity, processing said entity when the timer runs out.</li>
 * <li>BaseEntitySystem - tracks an unsorted subset of entities.</li>
 * <li>IntervalEntityProcessingSystem - process a subset every n ticks.</li>
 * <li>IntervalIteratingSystem - see above.</li>
 * <li>IntervalEntitySystem - process entities in millisecond intervals.</li>
 * </ul>
 * <p>
 * For more comprehensive documentation on the various systems, please refer to
 *
 * @see <a href="http://junkdog.github.io/javadoc/artemis-odb/2.0.0/com/artemis/systems/package-summary.html">
 * Artemis-ODB systems</a>
 */
public abstract class AbstractScreen implements Screen {

    @Override
    public void pause() {
    }

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void resume() {
    }

    @Override
    public void hide() {
    }

    @Override
    public void show() {
    }

    @Override
    public void render(float delta) {
    }

    @Override
    public void dispose() {
    }
}
