package com.domakingo.riskyCatch;

import com.domakingo.riskyCatch.entities.Species;

import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.JsonValue;

import java.util.ArrayList;
import java.util.List;

public class GameRegistry {
    private List<Species> speciesList;

    public GameRegistry() {
        this.speciesList = new ArrayList<>();
    }

    public void loadSpeciesFromJson(String filePath) {
        try {
            JsonReader reader = new JsonReader();
            JsonValue root = reader.parse(filePath);

            for (JsonValue element : root) {
                int id = element.getInt("id");
                String name = element.getString("name");
                float[] weight = parseRange(element.get("weight"));
                float[] height = parseRange(element.get("height"));
                float[] width = parseRange(element.get("width"));
                float[] speed = parseRange(element.get("speed"));
                float[] depth = parseRange(element.get("depth"));

                Species species = new Species(id, name, weight, height, width, speed, depth);

                speciesList.add(species);
            }

            System.out.println("Loaded species from file");
        } catch (Exception e) {
            System.err.println("Error loading species from file");
        }
    }

    public List<Species> getSpeciesList() {
        return speciesList;
    }

    public void printAllSpecies() {
        for (Species species : speciesList) {
            System.out.println(species.getName());
        }
    }

    private float[] parseRange(JsonValue jsonArray) {
        float[] range = new float[jsonArray.size];
        for (int i = 0; i < jsonArray.size; i++) {
            range[i] = jsonArray.getFloat(i);
        }
        return range;
    }
}
