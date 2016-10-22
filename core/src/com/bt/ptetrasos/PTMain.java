package com.bt.ptetrasos;

import com.artemis.World;
import com.badlogic.gdx.Application;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.bt.ptetrasos.screens.GameScreen;
import com.bt.ptetrasos.screens.MenuScreen;

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
 */

public class PTMain extends Game {

    World world;
    AssetManager assetManager = new AssetManager();
    SpriteBatch batch;


	@Override
	public void create() {
        batch = new SpriteBatch();
		Gdx.app.setLogLevel(Application.LOG_DEBUG);
		Gdx.graphics.setWindowedMode(800, 600);

        Constants.assets = assetManager;


        Gdx.app.debug("Info", "Assets loading");
        Constants.assets.load("img/room/Room-Background.png", Texture.class);
        Constants.assets.load("img/room/Room-BackWall.png", Texture.class);
        Constants.assets.load("img/room/Room-Floor.png", Texture.class);
        Constants.assets.finishLoading(); // NEVER forget to call this guy to finish loading
        Gdx.app.debug("Info", "Assets loaded");

        System.out.println(Constants.assets.getAssetNames());

        Constants.game = this;


        setScreen(new GameScreen(this));

	}



    // Simple format for switching between screens
	public void showMenuScreen() {setScreen(new MenuScreen(this));}


}
