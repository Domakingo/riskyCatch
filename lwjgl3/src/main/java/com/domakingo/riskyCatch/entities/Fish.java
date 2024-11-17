package com.domakingo.riskyCatch.entities;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public abstract class Fish {
    private float x, y;
    private float width, height;
    private float speed;

    public Fish(float startX, float startY, float width, float height, float speed) {
        this.x = startX;
        this.y = startY;
        this.width = width;
        this.height = height;
        this.speed = speed;
    }

    public void update(float delta) {
    }

    public void render(ShapeRenderer shapeRenderer) {
        shapeRenderer.rect(x, y, width, height);
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getSpeed() {
        return speed;
    }
}
