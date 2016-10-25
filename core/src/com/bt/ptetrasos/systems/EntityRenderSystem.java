package com.bt.ptetrasos.systems;

import com.artemis.Aspect;
import com.artemis.BaseEntitySystem;
import com.artemis.ComponentMapper;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.bt.ptetrasos.Constants;
import com.bt.ptetrasos.components.game.Anim;
import com.bt.ptetrasos.components.game.Bounds;
import com.bt.ptetrasos.components.game.Position;
import com.bt.ptetrasos.util.AnimationMaker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Titas on 2016-10-22.
 */
public class EntityRenderSystem extends BaseEntitySystem {

    public EntityRenderSystem() {
        super(Aspect.all(Position.class, Bounds.class).one(Anim.class));
    }


    SpriteBatch batch = new SpriteBatch();

    String TAG = EntityRenderSystem.class.getName();

    ComponentMapper<Bounds> boundsCm;
    ComponentMapper<Position> positionCm;
    ComponentMapper<Anim> animationCm;

    // list that keeps the entities in the order they need to be rendered. Awesome.
    private List<Integer> sortedEntities = new ArrayList<Integer>();
    // boolean to track if entities need to be reorganized
    boolean entities_mixed = true;

    CameraSystem cameraSystem;

    class layerSortComperator implements Comparator<Integer> {

        @Override
        public int compare(Integer e1, Integer e2) {
            int layer1 = animationCm.get(e1).getLayer();
            int layer2 = animationCm.get(e2).getLayer();
            int comparisonValue = 0;
            if (layer1 < layer2) {
                comparisonValue = -1;
            } else if (layer1 > layer2) {
                comparisonValue = 1;
            }
            return comparisonValue;
        }


    }

    protected void inserted(int e) {
        sortedEntities.add(e);
        entities_mixed = true;
        Gdx.app.debug(TAG, e + " was added");
    }

    protected void removed(int e) {
        sortedEntities.remove((Integer) e);
        Gdx.app.debug(TAG, e + " was removed");

    }


    @Override
    protected void processSystem() {
        if (entities_mixed) {
            entities_mixed = false;
            Collections.sort(sortedEntities, new layerSortComperator());
        }
        for (int e : sortedEntities) {
            process(e);
        }
    }

    protected void process(int e) {


        float x = positionCm.get(e).getX();
        float y = positionCm.get(e).getY();
        float width = boundsCm.get(e).getWidth();
        float height = boundsCm.get(e).getHeight();

        Anim anim = animationCm.get(e);

        if (animationCm.get(e).getAnimation() == null) {
            Texture texture = Constants.assets.get(anim.getAnimationReference());
            Animation animation = AnimationMaker.spriteSheetToAnimation(texture, 1, 1, 1);
            anim.setAnimation(animation);
        }

        TextureRegion currentFrame = anim.getAnimation().getKeyFrame(anim.getAge());

        batch.setProjectionMatrix(cameraSystem.camera.combined);
        batch.begin();
        batch.draw(currentFrame, x, y, width, height);
        batch.end();

        animationCm.get(e).addAge(Gdx.graphics.getDeltaTime());
    }
}

