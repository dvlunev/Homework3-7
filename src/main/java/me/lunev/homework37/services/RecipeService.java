package me.lunev.homework37.services;

import me.lunev.homework37.model.Recipe;

import java.util.List;
import java.util.Map;

public interface RecipeService {

    Recipe addRecipe(Recipe recipe);

    Recipe getRecipe(int id);

    List<Recipe> getRecipeOfIdIng(int idIng);

    Recipe getRecipeOfIdIng2(int idIng1, int idIng2);

    Recipe editRecipe(int id, Recipe recipe);

    boolean deleteRecipe(int id);

    Map<Integer, Recipe> getAllRecipes();

    void readFromFile();
}
