package com.domakingo.riskyCatch.entities;

import java.util.Arrays;

public class Species {
    private int id;
    private String name;
    private float[] weight, height, width, speed, depth;

    public Species(int id, String name, float[] weight, float[] height, float[] width, float[] speed, float[] depth) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.speed = speed;
        this.depth = depth;
    }

    // Getter e Setter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float[] getWeight() {
        return weight;
    }

    public float[] getHeight() {
        return height;
    }

    public float[] getWidth() {
        return width;
    }

    public float[] getSpeed() {
        return speed;
    }

    public float[] getDepth() {
        return depth;
    }

    @Override
    public String toString() {
        return "Species{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", weight=" + Arrays.toString(weight) +
            ", height=" + Arrays.toString(height) +
            ", width=" + Arrays.toString(width) +
            ", speed=" + Arrays.toString(speed) +
            ", depth=" + Arrays.toString(depth) +
            '}';
    }
}

