package com.bt.ptetrasos.util;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Lukas on 22-Oct-16.
 */
public class ObjectLoader {

    FileReader input = null;
    ArrayList data;
    String[] raw;

    public ObjectLoader(String file) throws IOException{
        input = new FileReader(file);
        raw = input.toString().split(",");
        System.out.println(raw);

        
    }

    public ArrayList getData() {
        return data;
    }
}
