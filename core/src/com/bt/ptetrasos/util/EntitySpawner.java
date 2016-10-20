package com.bt.ptetrasos.util;

import com.artemis.*;

import java.util.ArrayList;

/**
 * TODO Figure out if it's possible to make purely integer implementation
 *
 * Returns an entity based upon a hashmap of components and their values passed.
 *
 * Internally, Artemis handles entities in two very distinct manners:
 * <ul>
 *     <li>Entity objects: a high-level container which can be used to inject components in a rather simple manner.</li>
 *     <li>Integers: under the hood, Artemis shines when using integer look-ups. As a trade-off to speed, however, adding
 *     components becomes more complex, requiring objects called ComponentMapper's. These objects, created individually
 *     for each Component subclass, map the component in question to the integer value using some sort of black magic.
 *     </li>
 * </ul>
 *
 */
public class EntitySpawner {

    public static int spawnEntity(final World world, ArrayList<Component> components) {
        /**
         * @param world      world class from Artemis provides a basis to spawn the entity
         * @param components an array of initialized components
         * @return           an entity with the components added to it
         */

        EntityEdit entityEdit = world.createEntity().edit();
        for (Component component: components) {
            entityEdit.add(component);
        }

        return entityEdit.getEntity().getId();
    }
}
