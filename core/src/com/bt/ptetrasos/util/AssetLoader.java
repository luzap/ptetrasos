package com.bt.ptetrasos.util;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.bt.ptetrasos.Constants;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Lukas on 22-Oct-16.
 */
public class AssetLoader {
    static String path = Gdx.files.getLocalStoragePath();
    AssetManager assets = new AssetManager();

    List<String> filetypes = Arrays.asList("jpg", "jpeg");

    public AssetLoader() {
        File dir = new File(path);
        File[] files = dir.listFiles();

        for (File item: files) {
            if (item.isDirectory() && item.getName() != "anim") {
                switch (item.getName()) {
                    case "jpg":
                    case "jpeg": loadImages(item);
                            break;
                    default:
                        break;
                }
            }

        }

        Constants.assets = assets;
    }

    private void loadImages(File file) {
        File[] files = file.listFiles();
        for (File item: files) {
            assets.load(file.getName(), Texture.class);
        }
    }

    private void loadSounds() {

    }

    private void loadAnimations() {

    }

}
