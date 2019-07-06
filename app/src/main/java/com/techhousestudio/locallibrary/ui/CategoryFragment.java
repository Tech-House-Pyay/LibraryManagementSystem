package com.techhousestudio.locallibrary.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.techhousestudio.locallibrary.MainActivity;
import com.techhousestudio.locallibrary.R;
import com.techhousestudio.locallibrary.adapters.BookCatagoryRecyclerAdapter;
import com.techhousestudio.locallibrary.models.BookCategory;
import com.techhousestudio.locallibrary.utitlities.GridSpacingItemDecoration;

import java.util.ArrayList;
import java.util.List;


public class CategoryFragment extends Fragment {
    private RecyclerView bookCatagoryView;
    private ImageView selectedImage;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        bookCatagoryView=view.findViewById(R.id.rvBookCategory);
        selectedImage=view.findViewById(R.id.imgcategory);


        bookCatagoryView.setLayoutManager(new GridLayoutManager(getContext(), 1));

        bookCatagoryView.addItemDecoration(new GridSpacingItemDecoration(1,0,true));

        List<BookCategory> bookList = new ArrayList<>();
        bookList.add(new BookCategory("Arts & Musice", R.drawable.node));
        bookList.add(new BookCategory("Biographies", R.drawable.node));
        bookList.add(new BookCategory("Business", R.drawable.node));
        bookList.add(new BookCategory("Kids", R.drawable.node));
        bookList.add(new BookCategory("Comics", R.drawable.node));
        bookList.add(new BookCategory("Computer & Tech", R.drawable.node));
        bookList.add(new BookCategory("Cooking", R.drawable.node));
        bookList.add(new BookCategory("Hobbies & Crafts", R.drawable.node));
        bookList.add(new BookCategory("Education & Referenes", R.drawable.node));
        bookList.add(new BookCategory("Gay & Lesbian", R.drawable.node));
        bookList.add(new BookCategory("Health & Fitness", R.drawable.node));
        bookList.add(new BookCategory("History", R.drawable.node));
        bookList.add(new BookCategory("Home & Garden", R.drawable.node));
        bookList.add(new BookCategory("Horror", R.drawable.node));
        bookList.add(new BookCategory("Entertainment",R.drawable.node));
        bookList.add(new BookCategory("Literature & Fiction", R.drawable.node));
        bookList.add(new BookCategory("Medical", R.drawable.node));
        bookList.add(new BookCategory("Mysteries", R.drawable.node));
        bookList.add(new BookCategory("Parenting", R.drawable.node));
        bookList.add(new BookCategory("Social Sciences", R.drawable.node));
        bookList.add(new BookCategory("Religion", R.drawable.node));
        bookList.add(new BookCategory("Romance",R.drawable.node));
        bookList.add(new BookCategory("Scuence & Maths", R.drawable.node));
        bookList.add(new BookCategory("Sci-Fi & Fatasy", R.drawable.node));
        bookList.add(new BookCategory("Self-Help", R.drawable.node));
        bookList.add(new BookCategory("Sports",  R.drawable.node));

        bookList.add(new BookCategory("Travel", R.drawable.node));
        bookList.add(new BookCategory("True Crime", R.drawable.node));
        bookList.add(new BookCategory("Western", R.drawable.node));


        BookCatagoryRecyclerAdapter adapter = new BookCatagoryRecyclerAdapter(bookList,getContext());
        bookCatagoryView.setAdapter(adapter);




    }

}
