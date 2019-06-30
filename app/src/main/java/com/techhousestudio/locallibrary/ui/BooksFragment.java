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
import com.techhousestudio.locallibrary.adapters.BookRecyclerAdapter;
import com.techhousestudio.locallibrary.models.Book;
import com.techhousestudio.locallibrary.utitlities.GridSpacingItemDecoration;

import java.util.ArrayList;
import java.util.List;


public class BooksFragment extends Fragment {
    private RecyclerView rvBookList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_books, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvBookList = view.findViewById(R.id.rvBookList);
        rvBookList.setLayoutManager(new GridLayoutManager(getContext(), 2));

        rvBookList.addItemDecoration(new GridSpacingItemDecoration(2,10,true));

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Android Development", "Mark", R.drawable.node,"Available"));
        bookList.add(new Book("Android Development", "Mark", R.drawable.node,"Available"));
        bookList.add(new Book("History Development", "Mark", R.drawable.node,"Available"));
        bookList.add(new Book("Html Development", "Mark", R.drawable.node,"Not Available"));
        bookList.add(new Book("Web Development", "Mark", R.drawable.node,"Available"));
        bookList.add(new Book("Android Development", "Mark", R.drawable.node,"Available"));
        bookList.add(new Book("Android Development", "Mg Aung", R.drawable.node,"Available"));
        bookList.add(new Book("Android Development", "Mark", R.drawable.node,"Not Available"));
        bookList.add(new Book("Android Development", "Mark", R.drawable.node,"Not Available"));
        bookList.add(new Book("Android Development", "Mark", R.drawable.node,"Available"));
        bookList.add(new Book("Android Development", "Mark", R.drawable.node,"Available"));
        bookList.add(new Book("Android Development", "Mark", R.drawable.node,"Available"));


        BookRecyclerAdapter adapter = new BookRecyclerAdapter(getContext(), bookList);
        rvBookList.setAdapter(adapter);

    }

}
