package com.techhousestudio.locallibrary.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.techhousestudio.locallibrary.R;
import com.techhousestudio.locallibrary.models.BookCategory;

import java.util.List;

public class BookCatagoryRecyclerAdapter extends RecyclerView.Adapter<BookCatagoryRecyclerAdapter.BookCategoryViewHolder> {

    private List<BookCategory> bookCategoryList;
    private Context context;

    public BookCatagoryRecyclerAdapter(List<BookCategory> bookCategoryList, Context context) {
        this.bookCategoryList = bookCategoryList;
        this.context = context;
    }

    @NonNull
    @Override
    public BookCategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BookCategoryViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row_bookcategory, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BookCategoryViewHolder holder, int position) {
        BookCategory book = bookCategoryList.get(position);
        holder.tvBookCategory.setText(book.CategoryName);


        Glide.with(context).load(book.imgCategory).into(holder.ivBookCategoryImage);

    }

    @Override
    public int getItemCount() {

        return bookCategoryList.size();
    }

    public class BookCategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvBookCategory;

        ImageView ivBookCategoryImage;

        public BookCategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            tvBookCategory = itemView.findViewById(R.id.tvcategory);


            ivBookCategoryImage = itemView.findViewById(R.id.imgcategory);
        }
    }
}
