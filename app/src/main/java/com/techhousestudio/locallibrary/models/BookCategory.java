package com.techhousestudio.locallibrary.models;

public class BookCategory {
    public String CategoryName,Description;
    public int imgCategory;

    public BookCategory(String categoryName, String description, int imgCategory) {
        CategoryName = categoryName;
        Description = description;
        this.imgCategory = imgCategory;
    }
}
