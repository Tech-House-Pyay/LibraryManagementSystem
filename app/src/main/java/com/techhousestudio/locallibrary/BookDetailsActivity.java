package com.techhousestudio.locallibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class BookDetailsActivity extends AppCompatActivity {
    TextView bookTitle,bookAvailability,bookAuthor;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);
        bookTitle=findViewById(R.id.bookDetailsTitle);
        imageView=findViewById(R.id.imgbookdetail);
        bookAvailability=findViewById(R.id.bookAvailability);
        bookAuthor=findViewById(R.id.tvBookDetailsAuthor);


        Bundle bundle=getIntent().getExtras();
        bookTitle.setText(bundle.getString("BookTitle"));

       Glide.with(this).load(bundle.getInt("bookImage")).into(imageView);
       bookAvailability.setText(bundle.getString("bookAvailability"));
       bookAuthor.setText(bundle.getString("bookAuthor"));

    }
}
