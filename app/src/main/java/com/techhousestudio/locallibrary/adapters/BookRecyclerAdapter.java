package com.techhousestudio.locallibrary.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
//import com.techhousestudio.locallibrary.BookDetailsActivity;
import com.techhousestudio.locallibrary.BookDetailsActivity;
import com.techhousestudio.locallibrary.R;
import com.techhousestudio.locallibrary.models.Book;

import java.util.List;

public class BookRecyclerAdapter extends RecyclerView.Adapter<BookRecyclerAdapter.BookViewHolder> {
    private List<Book> bookList;
    private Context context;

    public BookRecyclerAdapter(Context context, List<Book> bookList) {
        this.bookList = bookList;
        this.context = context;
    }

    @NonNull
    @Override
    public BookRecyclerAdapter.BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BookViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row_books, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull BookRecyclerAdapter.BookViewHolder holder, int position) {
        final Book book = bookList.get(position);
        holder.tvBookTitle.setText(book.title);
        holder.tvBookAuthor.setText(book.author);
        Glide.with(context).load(book.imageUri).into(holder.ivBookImage);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, BookDetailsActivity.class);
                Bundle bundle=new Bundle();
                bundle.putString("BookTitle",book.title);
                bundle.putInt("bookImage",book.imageUri);
                bundle.putString("bookAvailability",book.availability);
                bundle.putString("bookAuthor",book.author);
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

    public class BookViewHolder extends RecyclerView.ViewHolder {
        TextView tvBookTitle, tvBookAuthor;
        ImageView ivBookImage, ivBookFavourite;

        public BookViewHolder(@NonNull final View itemView) {
            super(itemView);
            tvBookAuthor = itemView.findViewById(R.id.tvBookAuthor);
            tvBookTitle = itemView.findViewById(R.id.tvBookTitle);
            ivBookFavourite = itemView.findViewById(R.id.ivBookFavourite);
            ivBookImage = itemView.findViewById(R.id.ivBookImage);


        }

    }

}
