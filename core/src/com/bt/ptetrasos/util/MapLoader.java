package com.bt.ptetrasos.util;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Lukas on 22-Oct-16.
 */
public class MapLoader {

    static FileReader input = null;
    static String[] raw;
    static MapObject map;

    public static MapObject readFile(String file) throws IOException {
        input = new FileReader(file);
        raw = input.toString().split(",");
        map = new MapObject(Float.parseFloat(raw[0]), Float.parseFloat(raw[1]), Float.parseFloat(raw[2]),
                Float.parseFloat(raw[3]), Integer.getInteger(raw[4]), raw[5]);
        return map;
    }
}
