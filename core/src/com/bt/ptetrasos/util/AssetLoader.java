package com.bt.ptetrasos.util;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import com.bt.ptetrasos.Constants;

import java.util.HashMap;

/**
 * Recursive loading of assets from asset directory.
 * TODO Implement a retrieve file by name method
 */
public class AssetLoader {
    private static FileHandle path; // This is null in html. Look at the table at https://github.com/libgdx/libgdx/wiki/File-handling.
    private AssetManager assets = new AssetManager();
    private HashMap<String, Class> typeClasses = new HashMap<String, Class>() {
    };


    public AssetLoader() {
        if (Gdx.app.getType() == Application.ApplicationType.WebGL) {
            path = new FileHandle("assets/"); // This needs changing
        } else {
            path = new FileHandle(Gdx.files.getLocalStoragePath());
        }

        assignTypes();

        FileHandle[] subDirs = path.list();
        loadAssets(subDirs);
        Constants.assets = assets;

    }

    private void loadAssets(FileHandle[] directories) {
        for (FileHandle directory : directories) {
            FileHandle currentDir = new FileHandle(directory.toString());
            FileHandle[] files = currentDir.list();

            for (FileHandle item : files) {
                String[] parts = item.toString().split("[/]");
                String[] nametype = parts[parts.length - 1].split("[.]"); // Indices 0 & 1 correspond to name and type
                if (typeClasses.containsKey(nametype[1])) {
                    assets.load(currentDir + "/" + nametype[0], typeClasses.get(nametype[1]));
                }
            }

        }
    }

    private void assignTypes() {
        typeClasses.put("jpg", Texture.class);
        typeClasses.put("jpeg", Texture.class);
        typeClasses.put("png", Texture.class);
        typeClasses.put("ogg", Sound.class);
    }
}
