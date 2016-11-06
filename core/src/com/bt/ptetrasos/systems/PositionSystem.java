package com.bt.ptetrasos.systems;

import com.artemis.Aspect;
import com.artemis.systems.IteratingSystem;
import com.bt.ptetrasos.components.game.Position;

/**
 * The PositionSystem (tentative) will convert between the 2D orthogonal coordinates that LibGDX uses internally, and
 * the shifted coordinates created by the viewing angle.
 */


public class PositionSystem extends IteratingSystem {

    public PositionSystem() {
        super(Aspect.all(Position.class));
    }

    protected void insert() {
    }

    protected void removed() {
    }


    @Override
    protected void process(int e) {
    }


}
