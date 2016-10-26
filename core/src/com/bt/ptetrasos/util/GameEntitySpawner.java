package com.bt.ptetrasos.util;

import com.artemis.Entity;
import com.artemis.World;
import com.artemis.managers.TagManager;
import com.bt.ptetrasos.components.game.Anim;
import com.bt.ptetrasos.components.game.Bounds;
import com.bt.ptetrasos.components.game.Position;

/**
 * Created by Titas on 2016-10-21.
 */
public class GameEntitySpawner{

    protected TagManager tagManager;

    public static Entity spawnStaticImage(final World world, final float x, final float y,
                                          float width, float height, String animRef, int layer) {
        Entity entity = world.createEntity().edit()
                .add(new Bounds(width, height))
                .add(new Position(x, y))
                .add(new Anim(animRef, layer))
                .getEntity();
        return entity;
    }

}
