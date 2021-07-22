package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class Skyu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skyu);

        ImageSlider imageSlider= findViewById(R.id.skyuslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.skyu1,""));
        slideModels.add(new SlideModel(R.drawable.skyu2,""));
        slideModels.add(new SlideModel(R.drawable.skyu3,""));
        imageSlider.setImageList(slideModels,true);
    }
}