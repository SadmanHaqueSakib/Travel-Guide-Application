package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class SodaLimeWater extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soda_lime_water);
        ImageSlider imageSlider= findViewById(R.id.sodalimewaterslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.soda_lime_water1,""));
        slideModels.add(new SlideModel(R.drawable.soda_lime_water2,""));
        slideModels.add(new SlideModel(R.drawable.soda_lime_water3,""));
        imageSlider.setImageList(slideModels,true);
    }
}