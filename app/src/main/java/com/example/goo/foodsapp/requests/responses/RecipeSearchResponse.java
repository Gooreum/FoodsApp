package com.example.goo.foodsapp.requests.responses;

import com.example.goo.foodsapp.models.Recipe;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Goo on 2019-06-18.
 */

public class RecipeSearchResponse {

    @SerializedName("count")
    @Expose()
    private int count;


    @SerializedName("recipes")
    @Expose()
    private List<Recipe> recipes;

    public int getCount() {
        return count;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    @Override
    public String toString() {
        return "RecipeSearchResponse{" +
                "count=" + count +
                ", recipes=" + recipes +
                '}';
    }
}
