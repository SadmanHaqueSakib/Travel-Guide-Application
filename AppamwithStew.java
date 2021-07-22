package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class AppamwithStew extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appamwith_stew);

        ImageSlider imageSlider= findViewById(R.id.appamwithstewslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.appam_with_stew1,""));
        slideModels.add(new SlideModel(R.drawable.appam_with_stew2,""));
        slideModels.add(new SlideModel(R.drawable.appam_with_stew3,""));
        imageSlider.setImageList(slideModels,true);

    }
}