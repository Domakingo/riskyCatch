package com.domakingo.riskyCatch.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;
import com.domakingo.riskyCatch.Main;
import com.domakingo.riskyCatch.entities.Boat;
import com.domakingo.riskyCatch.utils.InputHandler;

public class GameScreen implements Screen {
    private final Main game;
    private ShapeRenderer shapeRenderer;

    private Boat boat;
    private InputHandler inputHandler;

    public GameScreen(Main game) {
        this.game = game;
    }

    @Override
    public void show() {
        shapeRenderer = new ShapeRenderer();

        float boatWidth = 100f;
        float boatHeight = 30f;
        float boatStartX = (Gdx.graphics.getWidth() - boatWidth) / 2;
        float boatStartY = 50f;
        float boatSpeed = 200f;

        boat = new Boat(boatStartX, boatStartY, boatWidth, boatHeight, boatSpeed);

        inputHandler = new InputHandler(boat, Gdx.graphics.getWidth());
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0.5f, 0.8f, 1f, 1f);

        inputHandler.handleInput(delta);

        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
        boat.render(shapeRenderer);
        shapeRenderer.end();
    }

    @Override
    public void resize(int width, int height) {}

    @Override
    public void pause() {}

    @Override
    public void resume() {}

    @Override
    public void hide() {}

    @Override
    public void dispose() {
        shapeRenderer.dispose();
    }
}
