package com.chananya.cookbook;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by חנניה on 13 אוגוסט 2017.
 */

public class CookBook {
    private static Set<Recipe> recipes = new HashSet<>();
    public void addRecipe(Recipe recipe, boolean replace) {
        if(recipes.contains(recipe))
            if(!replace)
                return;

        recipes.add(recipe);
    }
    public void removeRecipe(Recipe recipe) throws Exception {
        if(recipes.contains(recipe))
            recipes.remove((recipe));
        else
            throw new Exception("Can't find and remove this recipe.");
    }
}
