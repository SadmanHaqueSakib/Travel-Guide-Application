package com.example.travelmania.helpers;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

public class horizontalhelper {
    int image;
    String title;


    public horizontalhelper(int image, String title) {
        this.image = image;
        this.title = title;

    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }
}
