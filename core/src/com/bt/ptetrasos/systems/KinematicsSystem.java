package com.bt.ptetrasos.systems;

import com.artemis.Aspect;
import com.artemis.BaseEntitySystem;

/**
 * Aspect matches Entities based on the components they have injected to them, essentially defining the subset of
 * entities that it affects.
 * <p>
 * This can be done in one of several ways:
 * <ul>
 * <li>Aspect.all(...), where only entities which contain all of the relevant components are detected.</li>
 * <li>Aspect.one(...), which matches entities with one of the given components.</li>
 * <li>Aspect.exclude(...), which excludes the desired components from the search criteria.</li>
 * </ul>
 * <p>
 * Note that these can be chained together, and their interactions are similar to that of sets.
 */

public class KinematicsSystem extends BaseEntitySystem {

    public KinematicsSystem() {
        super(Aspect.all());
    }

    protected void insert() {
    }

    protected void removed() {
    }

    @Override
    protected void processSystem() {

    }
}
