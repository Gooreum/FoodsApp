package com.example.goo.foodsapp.requests.responses;

import com.example.goo.foodsapp.models.Recipe;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Goo on 2019-06-18.
 */

public class RecipeResponse {

    @SerializedName("recipe")
    @Expose()
    private Recipe recipe;

    public Recipe getRecipe(){
        return recipe;
    }

    @Override
    public String toString(){
        return "RecipeResponse{" +
                "recipe=" + recipe +
                "}";
    }
}
