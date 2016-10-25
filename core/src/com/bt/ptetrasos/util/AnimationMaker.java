package com.bt.ptetrasos.util;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by Titas on 2016-10-22.
 */
public class AnimationMaker {

    public static Animation spriteSheetToAnimation(Texture texture, int framerows, int framecollumns, float time) {
        Animation animation;
        Texture sheet = texture;
        TextureRegion[] frames;
        TextureRegion currentFrame;


        TextureRegion[][] tmp = TextureRegion.split(sheet, sheet.getWidth() / framecollumns, sheet.getHeight() / framerows);              // #10
        frames = new TextureRegion[framecollumns * framerows];
        int index = 0;
        for (int i = 0; i < framerows; i++) {
            for (int j = 0; j < framecollumns; j++) {
                frames[index++] = tmp[i][j];
            }
        }
        animation = new Animation(time, frames);
        return animation;
    }
}
