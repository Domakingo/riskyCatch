package com.domakingo.riskyCatch.entities;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.Random;

public class Fish {
    private float x, y;
    private float width;
    private float height;
    private float weight;
    private float speed;
    private float depth;
    private Species species;

    public Fish(Species species, float x, float y) {
        this.species = species;
        this.x = x;
        this.y = y;

        this.width = getRandomInRange(species.getWidth());
        this.height = getRandomInRange(species.getHeight());
        this.weight = getRandomInRange(species.getWeight());
        this.speed = getRandomInRange(species.getSpeed());
        this.depth = getRandomInRange(species.getDepth()); // Value in % in relation with sea height
    }

    private float getRandomInRange(float[] range) {
        if (range == null || range.length != 2) {
            throw new IllegalArgumentException("Range must have 2 values (min & max)");
        }

        float min = range[0];
        float max = range[1];

        if (min > max) {
            throw new IllegalArgumentException("Range must not be greater than max");
        }

        Random random = new Random();
        return min + random.nextFloat() * (max - min);
    }

    public void update(float delta) {
    }

    public void render(ShapeRenderer shapeRenderer) {
        shapeRenderer.setColor(Color.RED);
        shapeRenderer.rect(x, y, width, height);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    public Species getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "Fish{" +
            "x=" + x +
            ", y=" + y +
            ", width=" + width +
            ", height=" + height +
            ", weight=" + weight +
            ", speed=" + speed +
            ", depth=" + depth +
            ", species=" + species +
            '}';
    }
}


