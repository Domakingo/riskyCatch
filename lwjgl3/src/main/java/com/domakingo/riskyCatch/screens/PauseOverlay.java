package com.domakingo.riskyCatch.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class PauseOverlay {
    private ShapeRenderer shapeRenderer;

    public PauseOverlay() {
        shapeRenderer = new ShapeRenderer();
    }

    public void render() {
        // Enable blending for transparency
        Gdx.gl.glEnable(GL20.GL_BLEND);
        Gdx.gl.glBlendFunc(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);

        // Render a semi-transparent dark layer
        shapeRenderer.begin(ShapeType.Filled);
        shapeRenderer.setColor(new Color(0, 0, 0, 0.75f));
        shapeRenderer.rect(0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        shapeRenderer.end();

        // Calculate button dimensions and positions based on current window size
        float buttonWidth = 200;
        float buttonHeight = 50;
        float centerX = (Gdx.graphics.getWidth() - buttonWidth) / 2;
        float resumeButtonY = ((float) Gdx.graphics.getHeight() / 2) + 30;
        float optionsButtonY = ((float) Gdx.graphics.getHeight() / 2) - 80;

        // Render buttons
        shapeRenderer.begin(ShapeType.Filled);
        shapeRenderer.setColor(Color.GRAY);
        shapeRenderer.rect(centerX, resumeButtonY, buttonWidth, buttonHeight); // Resume button
        shapeRenderer.rect(centerX, optionsButtonY, buttonWidth, buttonHeight); // Options button
        shapeRenderer.end();

        // Disable blending after rendering
        Gdx.gl.glDisable(GL20.GL_BLEND);
    }

    public void dispose() {
        shapeRenderer.dispose();
    }
}
