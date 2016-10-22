package com.bt.ptetrasos.util;

/**
 * Created by Titas on 2016-10-22.
 */
public class MapObject {


    float x;
    float y;
    float width;
    float height;
    int layernumber;
    String associatedImage;

    public MapObject(float x, float y, float width, float height, int layernumber, String associatedImage) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.layernumber = layernumber;
        this.associatedImage = associatedImage;
    }
}
