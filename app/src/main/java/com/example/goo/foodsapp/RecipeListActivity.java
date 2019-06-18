package com.example.goo.foodsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RecipeListActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_list);

        findViewById(R.id.test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mProgressBar.getVisibility() == View.VISIBLE) {
                    showProgressBar(false);
                    Toast.makeText(RecipeListActivity.this, "off", Toast.LENGTH_SHORT).show();
                } else {
                    showProgressBar(true);
                    Toast.makeText(RecipeListActivity.this, "on", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
