package com.chananya.cookbook;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

/**
 * Created by חנניה on 12 אוגוסט 2017.
 */

public class Recipe {
    private int Id;
    private String Name;
    private String FromWhom;
    private String Description;

    private KashrutClassification Kashrut;

    private Dictionary<String, String> Ingredients;
    private String Instructions;
    private String SpecialInstructions;

    private List<Integer> Labels;


    public Recipe(int id,
                  String name,
                  String fromWhom,
                  String description,
                  KashrutClassification kashrut,
                  Dictionary<String, String> ingredients,
                  String instructions,
                  String specialInstructions,
                  List<Integer> labels) {
        Id = id;
        Name = name;
        FromWhom = fromWhom;
        Description = description;
        Kashrut = kashrut;
        Ingredients = ingredients;
        Instructions = instructions;
        SpecialInstructions = specialInstructions;
        Labels = labels;
    }
    public void addLabel(String l) {
        if(Labels.contains(Label.getId(l)))
            return;
        else
            Labels.add(Label.getId(l));
    }
    public List<String> stringLabels() {
        List<String> ret = new ArrayList<>();
        for (Integer i: Labels) {
            if(Label.getName(i) == null)    //no label with this id
                if(Labels.remove(i) == true);   //done that way to ensure using the right remove function
            else
                ret.add(Label.getName(i));
        }
        return ret;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Recipe)
            if(((Recipe)o).getId() == Id)
                return true;
        return false;
    }

    public int getId() {
        return Id;
    }
    public String getName() {
        return Name;
    }
    public String getFromWhom() {
        return FromWhom;
    }
    public String getDescription() {
        return Description;
    }
    public KashrutClassification getKashrut() {
        return Kashrut;
    }
    public Dictionary<String, String> getIngredients() {
        return Ingredients;
    }
    public String getInstructions() {
        return Instructions;
    }
    public String getSpecialInstructions() {
        return SpecialInstructions;
    }
    public List<Integer> getLabels() {
        return Labels;
    }

    public void setName(String name) {
        Name = name;
    }
    public void setFromWhom(String fromWhom) {
        FromWhom = fromWhom;
    }
    public void setDescription(String description) {
        Description = description;
    }
    public void setKashrut(KashrutClassification kashrut) {
        Kashrut = kashrut;
    }
    public void setIngredients(Dictionary<String, String> ingredients) {
        Ingredients = ingredients;
    }
    public void setInstructions(String instructions) {
        Instructions = instructions;
    }
    public void setSpecialInstructions(String specialInstructions) {
        SpecialInstructions = specialInstructions;
    }
}
