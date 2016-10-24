package com.bt.ptetrasos;

import com.artemis.World;
import com.badlogic.gdx.Application;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.bt.ptetrasos.screens.MenuScreen;
import com.bt.ptetrasos.util.AssetLoader;

/**
 * The PTMain is the entry point for the desktop and HTML versions, making it the only class that is instantiated
 * externally. As such, it contains the AssetManager, which handles the loading of all assets (synchronously and
 * asynchronously, depending on type).
 *
 * Note that assetManager.finishLoading() MUST be called in order for the assets to load. Otherwise, the process
 * moves on before they are loaded to memory. Also, due to the rather small nature of our game, we can leave
 * everything loaded at once, and just apply shaders liberally.
 *
 * Another thing to keep in mind in the proceedings is how we're going about debugging. LibGDX has a good implementation
 * of logging errors as well as extraneous information. This can be done via Gdx.app.debug(TAG (String), DESCRIPTION
 * (String)). This will be pushed to the console, bypassing the need for print statements, and will only be shown
 * if the log level is set to debug, reducing the effort make for debugging.
 *
 * IMPORTANT: For file loading to work, run the desktop version first.
 */

public class PTMain extends Game {

    World world;
    SpriteBatch batch;
    AssetManager assets;
    Texture loadThatShit;


	@Override
	public void create() {
        // If not on web, generates list of resources. Workaround for the glitchy behaviour of the AssetManager
        // in GWT.

        // Currently commented out since some types are not implemented
        //if (Gdx.app.getType() != Application.ApplicationType.WebGL) {new GenFileListing("listing.txt");}


        batch = new SpriteBatch();
		Gdx.app.setLogLevel(Application.LOG_DEBUG);
		Gdx.graphics.setWindowedMode(800, 600);

        AssetLoader assetLoader = new AssetLoader();
        assets = assetLoader.getAssetManager();

        Constants.game = this;

        //setScreen(new GameScreen(this));
	}

    @Override
    public void render() {
        Texture trial = assets.get("img/room/roombackground.png");
        batch.begin();
        batch.draw(trial, 0, 0);
        batch.end();
    }

    // Simple format for switching between screens
	public void showMenuScreen() {setScreen(new MenuScreen(this));}


}
