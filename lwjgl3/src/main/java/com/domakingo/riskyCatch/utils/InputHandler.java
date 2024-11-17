package com.domakingo.riskyCatch.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.domakingo.riskyCatch.entities.Boat;

public class InputHandler {
    private final Boat boat;
    private final float screenWidth;

    public InputHandler(Boat boat, float screenWidth) {
        this.boat = boat;
        this.screenWidth = screenWidth;
    }

    public void handleInput(float delta) {
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            boat.moveLeft(delta);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            boat.moveRight(delta, screenWidth);
        }
    }
}
