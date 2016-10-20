package com.bt.ptetrasos;

import com.artemis.World;
import com.badlogic.gdx.Application;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
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
		Gdx.graphics.setWindowedMode(640, 480);
		Constants.game = this;
        Gdx.app.debug("Info", "Assets loading");

        assetManager.load("img/badlogic.jpg", Texture.class);
        assetManager.finishLoading(); // NEVER forget to call this guy to finish loading
        Gdx.app.debug("Info", "Assets loaded");
        showMenuScreen();
	}

	@Override
    public void render() {
        Texture tex = assetManager.get("img/badlogic.jpg", Texture.class);
        batch.begin();
        batch.draw(tex, 0, 0);
        batch.end();
	}

    // Simple format for switching between screens
	public void showMenuScreen() {setScreen(new MenuScreen(this));}


}
