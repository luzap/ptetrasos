package com.bt.ptetrasos.components.game;

import com.artemis.Component;

/**
 * The Position component keeps track of the location of the entity on screen. Note that these will be the final
 * coordinates, converted to compensate for the viewing angle via the PositionSystem.
 */

public class Position extends Component{

    private static float x;
    private static float y;

    public Position(float x, float y) {
        Position.x = x;
        Position.y = y;
    }

    public static float getX() {
        return x;
    }

    public static void setX(float x) {
        Position.x = x;
    }

    public static float getY() {
        return y;
    }

    public static void setY(float y) {
        Position.y = y;
    }
}
