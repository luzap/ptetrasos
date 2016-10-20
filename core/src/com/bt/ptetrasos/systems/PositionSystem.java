package com.bt.ptetrasos.systems;

import com.artemis.Aspect;
import com.artemis.BaseEntitySystem;

/**
 * The PositionSystem (tentative) will convert between the 2D orthogonal coordinates that LibGDX uses internally, and
 * the shifted coordinates created by the viewing angle.
 */


public class PositionSystem extends BaseEntitySystem {

    public PositionSystem() {
        super(Aspect.all()); // This Aspect business is apparently necessary
    }

    protected void insert() {}

    protected void removed() {}

    @Override
    protected void processSystem() {

    }
}