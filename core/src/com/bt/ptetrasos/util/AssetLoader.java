package com.bt.ptetrasos.util;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ObjectMap;
import com.bt.ptetrasos.Constants;


/**
 * Recursive loading of assets from asset directory.
 * TODO Implement a retrieve file by name method
 */
public class AssetLoader {
    private AssetManager assets = new AssetManager();
    private ObjectMap<String, Class> typeClasses = new ObjectMap<>();


    public AssetLoader() {
        typeClasses.put("png", Texture.class);
        loadAssetsFromInternal(Constants.listing);
    }

    public AssetManager getAssetManager() {
        return assets;
    }

    private void loadAssetsFromInternal(String listing) {
        /**
         * Loads all assets in the resource list into the AssetManager.
         * <p>
         * @param listing relative path to the file containing the internal paths to all assets
         */

        // Generate an Iterator from the file, removing removing empty characters
        String[] assetList = Gdx.files.internal(listing).readString().split("[\r\n]");

        for (String item : assetList) {
            if (item.length() > 0) {
                String type = item.split("[.]")[1];
                if (typeClasses.containsKey(type)) {
                    assets.load(item, typeClasses.get(type));
                    assets.finishLoadingAsset(item);
                    Gdx.app.debug("Asset", "loading asset " + item);
                }
            }
        }
    }
}




