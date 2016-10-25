package com.bt.ptetrasos;

import com.artemis.World;
import com.badlogic.gdx.assets.AssetManager;

/**
 * Class that stores important constants.
 *
 * Note that only static variables can be accessed from an un-instantiated object. So when adding variables, make
 * sure mutability is not a must.
 */

public class Constants {

    public static AssetManager assets;
    public static World gameWorld;
    public static World menuWorld;

    public static PTMain game;

    public static int WIDTH = 800;
    public static int HEIGHT = 600;

    public static String listing = "listing.txt";
}
