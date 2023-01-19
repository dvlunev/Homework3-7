package me.lunev.homework37.services;

public interface FilesService {

    boolean saveIngredientToFile(String json);

    boolean saveRecipeToFile(String json);

    String readFromIngredientsFile();

    String readFromRecipesFile();
}
