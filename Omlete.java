package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class Omlete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_omlete);
        ImageSlider imageSlider= findViewById(R.id.omleteslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.omelet1,""));
        slideModels.add(new SlideModel(R.drawable.omelet2,""));
        slideModels.add(new SlideModel(R.drawable.omelet3,""));
        imageSlider.setImageList(slideModels,true);
    }
}