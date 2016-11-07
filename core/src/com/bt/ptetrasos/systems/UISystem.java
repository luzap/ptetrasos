package com.bt.ptetrasos.systems;

import com.artemis.Aspect;
import com.artemis.ComponentMapper;
import com.artemis.systems.IteratingSystem;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.bt.ptetrasos.components.game.Bounds;
import com.bt.ptetrasos.components.game.Position;
import com.bt.ptetrasos.components.ui.Text;
import com.bt.ptetrasos.components.ui.UI;

/**
 * A system for processing UI elements in MenuScreen and in-game menu
 */
public class UISystem extends IteratingSystem {

    ComponentMapper<Bounds> boundsCm;
    ComponentMapper<Position> posCm;
    ComponentMapper<Text> textCm;

    BitmapFont font = new BitmapFont();

    private CameraSystem cameraSystem;
    private RenderSystem renderSystem;

    private ShapeRenderer shapeRen;

    public UISystem() {
        super(Aspect.all(Bounds.class, UI.class, Position.class, Text.class));
    }

    @Override
    protected void process(int e) {
        Bounds bounds = boundsCm.get(e);
        Position pos = posCm.get(e);
        Text text = textCm.get(e);

        shapeRen.setProjectionMatrix(cameraSystem.camera.combined);
        shapeRen.rect(Position.getX(), Position.getY(), bounds.getWidth(), bounds.getHeight());

        renderSystem.spriteBatch.begin();
        font.draw(renderSystem.spriteBatch, text.getText(), Position.getX(), Position.getY());
        renderSystem.spriteBatch.end();



    }
}
