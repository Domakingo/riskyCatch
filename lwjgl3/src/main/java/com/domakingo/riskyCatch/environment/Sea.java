package com.domakingo.riskyCatch.environment;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Sea {
    private float x = 0f;
    private float y = 0f;
    private float width = Gdx.graphics.getWidth();
    private float height = 500f;

    public Sea() {
    }

    public void render(ShapeRenderer shapeRenderer) {
        shapeRenderer.setColor(Color.BLUE);
        shapeRenderer.rect(x, y, width, height);
    }

    public float getHeight() {
        return height;
    }
}
