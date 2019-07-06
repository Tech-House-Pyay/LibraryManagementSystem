package com.techhousestudio.locallibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.techhousestudio.locallibrary.ui.BooksFragment;

public class SelectedCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_category);

        getSupportFragmentManager().beginTransaction().add(R.id.fra_category_container,new BooksFragment()).commit();
    }
}
