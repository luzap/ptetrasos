package com.bt.ptetrasos;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Generate a text file containing the relative paths of all game resources.
 */
public class GenFileListing {
    Path listing;
    List<String> files = new ArrayList<String>();


    public GenFileListing(String filename) {
        listing = Paths.get(filename);
        File dir = new File(Gdx.files.getLocalStoragePath());


        if (dir.isDirectory()) {
            getFilesFromDir(dir.toString());
        }
        try {
            Files.write(listing, files, Charset.forName("UTF-8"));
        } catch (IOException ex) {
            Gdx.app.debug("Error", "Writing assets to file was unsuccessful");
        }
    }

    private void getFilesFromDir(String dir) {
        /**
         * Recursively look through directories for files.
         * @param dir directory that the object is looking through
         */
        FileHandle directory = new FileHandle(dir);
        FileHandle[] filesInDir = directory.list();
        for (FileHandle file : filesInDir) {
            if (file.isDirectory()) {
                getFilesFromDir(file.toString());
            } else {
                String[] relPath = file.toString().split("(assets/)");
                files.add(relPath[1]);
            }
        }
    }
}
