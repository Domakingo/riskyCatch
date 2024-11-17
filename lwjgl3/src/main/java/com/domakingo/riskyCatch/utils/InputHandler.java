package com.domakingo.riskyCatch.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.domakingo.riskyCatch.entities.Boat;

public class InputHandler {
    private final Boat boat;
    private final float screenWidth;
    private boolean isPaused;

    public InputHandler(Boat boat, float screenWidth) {
        this.boat = boat;
        this.screenWidth = screenWidth;
        this.isPaused = false;
    }

    public void handleInput(float delta) {
        if (Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE)) {
            isPaused = !isPaused;
        }

        if (!isPaused) {
            if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
                boat.moveLeft(delta);
            }
            if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
                boat.moveRight(delta, screenWidth);
            }
        }
    }

    public boolean isPaused() {
        return isPaused;
    }
}
