package com.example.goo.foodsapp.requests;

import com.example.goo.foodsapp.util.constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Goo on 2019-06-18.
 */

//Retrofit Singleton
public class ServiceGenerator {

    private static Retrofit.Builder retrofitBuilder =
            new Retrofit.Builder()
                    .baseUrl(constants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = retrofitBuilder.build();

    private RecipeApi recipeApi = retrofit.create(RecipeApi.class);

    private RecipeApi getRecipeApi() {
        return recipeApi;
    }
}
