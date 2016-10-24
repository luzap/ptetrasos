package com.bt.ptetrasos.util;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.bt.ptetrasos.Constants;

/**
 * Recursive loading of assets from asset directory.
 * TODO Implement a retrieve file by name method
 */
public class AssetLoader {
    private AssetManager assets = new AssetManager();


    public AssetLoader() {
        loadAssetsFromInternal(Constants.listing);
    }

    public AssetManager getAssetManager() {
        return assets;
    }

    private void loadAssetsFromInternal(String listing) {
        String[] assetListTent = Gdx.files.internal(listing).readString().split("[\r\n]");
        String[] assetList = new String[assetListTent.length/2 + 1];
        int i = 0;
        for (String name: assetListTent) {
            if (!name.equals("")) {
                assetList[i] = name;
                i++;
            }
        }

        for (String indAsset : assetList) {
            String type = indAsset.split("[.]")[1];
            Gdx.app.debug("Asset", "Loading " + indAsset);
            assets.load(indAsset, Texture.class);
            assets.finishLoadingAsset(indAsset);
       }
    }
}




