package com.bt.ptetrasos.systems;

import com.artemis.Aspect;
import com.artemis.BaseEntitySystem;
import com.bt.ptetrasos.components.game.Bounds;
import com.bt.ptetrasos.components.game.Position;
import com.bt.ptetrasos.components.ui.Text;

/**
 * Created by Lukas on 06-Nov-16.
 */
public class UISystem extends BaseEntitySystem {


    public UISystem() {
        super(Aspect.all(Bounds.class, Position.class, Text.class));
    }

    @Override
    protected void processSystem() {

    }
}
