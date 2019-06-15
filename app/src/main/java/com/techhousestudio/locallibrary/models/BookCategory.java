package com.techhousestudio.locallibrary.models;

public class BookCategory {
    public String CategoryName,CustomText;
    public int imgCategory;

    public BookCategory(String categoryName, String customText, int imgCategory) {
        CategoryName = categoryName;
        CustomText = customText;
        this.imgCategory = imgCategory;
    }
}
