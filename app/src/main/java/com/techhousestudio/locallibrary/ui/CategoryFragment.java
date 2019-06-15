package com.techhousestudio.locallibrary.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.techhousestudio.locallibrary.R;
import com.techhousestudio.locallibrary.adapters.BookCatagoryRecyclerAdapter;
import com.techhousestudio.locallibrary.models.BookCategory;
import com.techhousestudio.locallibrary.utitlities.GridSpacingItemDecoration;

import java.util.ArrayList;
import java.util.List;


public class CategoryFragment extends Fragment {
    private RecyclerView bookCatagoryView;

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
        bookCatagoryView.setLayoutManager(new GridLayoutManager(getContext(), 1));

        bookCatagoryView.addItemDecoration(new GridSpacingItemDecoration(1,50,true));

        List<BookCategory> bookList = new ArrayList<>();
        bookList.add(new BookCategory("Arts & Musice","Arts & Musice", R.drawable.node));
        bookList.add(new BookCategory("Biographies","Biographies", R.drawable.node));
        bookList.add(new BookCategory("Business","Business", R.drawable.node));
        bookList.add(new BookCategory("Kids","Kids", R.drawable.node));
        bookList.add(new BookCategory("Comics","Comics", R.drawable.node));
        bookList.add(new BookCategory("Computer & Tech","Computer & Tech", R.drawable.node));
        bookList.add(new BookCategory("Cooking","Cooking", R.drawable.node));
        bookList.add(new BookCategory("Hobbies & Crafts", "Hobbies & Crafts",R.drawable.node));
        bookList.add(new BookCategory("Education & Referenes","Education & Referenes", R.drawable.node));
        bookList.add(new BookCategory("Gay & Lesbian","Gay & Lesbian", R.drawable.node));
        bookList.add(new BookCategory("Health & Fitness", "Health & Fitness",R.drawable.node));
        bookList.add(new BookCategory("History","History", R.drawable.node));
        bookList.add(new BookCategory("Home & Garden", "Home & Garden",R.drawable.node));
        bookList.add(new BookCategory("Horror","Horror", R.drawable.node));
        bookList.add(new BookCategory("Entertainment","Entertainment", R.drawable.node));
        bookList.add(new BookCategory("Literature & Fiction", "Literature & Fiction",R.drawable.node));
        bookList.add(new BookCategory("Medical", "Medical",R.drawable.node));
        bookList.add(new BookCategory("Mysteries", "Mysteries",R.drawable.node));
        bookList.add(new BookCategory("Parenting","Parenting",  R.drawable.node));
        bookList.add(new BookCategory("Social Sciences", "Social Sciences",R.drawable.node));
        bookList.add(new BookCategory("Religion","Religion",  R.drawable.node));
        bookList.add(new BookCategory("Romance","Romance", R.drawable.node));
        bookList.add(new BookCategory("Scuence & Maths", "Scuence & Maths", R.drawable.node));
        bookList.add(new BookCategory("Sci-Fi & Fatasy","Sci-Fi & Fatasy", R.drawable.node));
        bookList.add(new BookCategory("Self-Help","Self-Help", R.drawable.node));
        bookList.add(new BookCategory("Sports","Sports",  R.drawable.node));
        bookList.add(new BookCategory("Teen","Teen",  R.drawable.node));
        bookList.add(new BookCategory("Travel","Travel", R.drawable.node));
        bookList.add(new BookCategory("True Crime","True Crime", R.drawable.node));
        bookList.add(new BookCategory("Western", "Western",R.drawable.node));


        BookCatagoryRecyclerAdapter adapter = new BookCatagoryRecyclerAdapter(bookList,getContext());
        bookCatagoryView.setAdapter(adapter);




    }
}
