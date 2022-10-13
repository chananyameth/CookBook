package com.chananya.cookbook;

import java.util.Dictionary;
import java.util.List;

public class RecipeBuilder {
    private int Id;
    private String name;
    private String fromWhom;
    private String description;
    private KashrutClassification kashrut = KashrutClassification.UNKNOWN;
    private Dictionary<String, String> ingredients;
    private String instructions;
    private String specialInstructions;
    private List<Integer> labels;

    public RecipeBuilder Id(int id) {
        this.Id = id;
        return this;
    }

    public RecipeBuilder Name(String name) {
        this.name = name;
        return this;
    }

    public RecipeBuilder FromWhom(String fromWhom) {
        this.fromWhom = fromWhom;
        return this;
    }

    public RecipeBuilder Description(String description) {
        this.description = description;
        return this;
    }

    public RecipeBuilder Kashrut(KashrutClassification kashrut) {
        this.kashrut = kashrut;
        return this;
    }

    public RecipeBuilder Ingredients(Dictionary<String, String> ingredients) {
        this.ingredients = ingredients;
        return this;
    }

    public RecipeBuilder Instructions(String instructions) {
        this.instructions = instructions;
        return this;
    }

    public RecipeBuilder SpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
        return this;
    }

    public RecipeBuilder Labels(List<Integer> labels) {
        this.labels = labels;
        return this;
    }

    public Recipe createRecipe() {
        return new Recipe(Id, name, fromWhom, description, kashrut, ingredients, instructions, specialInstructions, labels);
    }
}