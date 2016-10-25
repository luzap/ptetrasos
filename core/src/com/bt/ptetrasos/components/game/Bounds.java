package com.bt.ptetrasos.components.game;

import com.artemis.Component;

/**
 * Created by Titas on 2016-10-21.
 */
public class Bounds extends Component {

    public float width;
    public float height;

    public Bounds() {
    }

    public Bounds(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
