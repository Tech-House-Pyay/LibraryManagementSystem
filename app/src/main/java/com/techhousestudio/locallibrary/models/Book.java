package com.techhousestudio.locallibrary.models;

public class Book {
    public String title,author;
    public int imageUri;

    public Book(String title, String author, int imageUri) {
        this.title = title;
        this.author = author;
        this.imageUri = imageUri;
    }
}
