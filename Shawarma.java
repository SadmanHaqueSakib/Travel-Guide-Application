package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class Shawarma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shawarma);
        ImageSlider imageSlider= findViewById(R.id.shawarmaslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.shawarma1,""));
        slideModels.add(new SlideModel(R.drawable.shawarma2,""));
        slideModels.add(new SlideModel(R.drawable.shawarma3,""));
        imageSlider.setImageList(slideModels,true);

    }
}