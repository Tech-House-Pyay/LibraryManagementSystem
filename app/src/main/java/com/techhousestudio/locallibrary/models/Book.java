package com.techhousestudio.locallibrary.models;

public class Book {
    public String title,author;
    public int imageUri;
    public  String availability;

    public Book(String title, String author, int imageUri,String availability) {
        this.title = title;
        this.author = author;
        this.imageUri = imageUri;
        this.availability=availability;
    }
}
