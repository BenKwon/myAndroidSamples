package com.example.myAndroidPractice;

import android.graphics.drawable.Drawable;

public class Item {
    private String itemName;
    private String itemPhone;
    private Drawable msgImage;
    private Drawable callImage;

    public Item(String name, String description,Drawable msgImage,Drawable callImage) {
        this.itemName = name;
        this.itemPhone = description;
        this.msgImage = msgImage;
        this.callImage = callImage;
    }
    public String getItemName() {
        return this.itemName;
    }
    public String getItemDescription() {
        return itemPhone;
    }
    public Drawable getMsgImage(){
        return this.msgImage;
    }
    public Drawable getCallImage(){
        return this.callImage;
    }
}