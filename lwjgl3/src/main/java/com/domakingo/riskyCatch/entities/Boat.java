package com.domakingo.riskyCatch.entities;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Boat {
    private float x;
    private float y;
    private float width = 100f;
    private float height = 30f;
    private float speed = 200f;

    public Boat(float startX, float startY) {
        this.x = startX;
        this.y = startY;
    }

    public void moveLeft(float delta) {
        x -= speed * delta;
        if (x < 0) x = 0; // max bordo sinistro
    }

    public void moveRight(float delta, float screenWidth) {
        x += speed * delta;
        if (x > screenWidth - width) x = screenWidth - width; // max bordo destro
    }

    public void render(ShapeRenderer shapeRenderer) {
        shapeRenderer.setColor(Color.WHITE);
        shapeRenderer.rect(x, y, width, height);
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }
}
