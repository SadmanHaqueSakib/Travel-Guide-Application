package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class Paratha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paratha);
        ImageSlider imageSlider= findViewById(R.id.parathaslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.paratha_agra1,""));
        slideModels.add(new SlideModel(R.drawable.paratha_agra2,""));
        slideModels.add(new SlideModel(R.drawable.paratha_agra3,""));
        imageSlider.setImageList(slideModels,true);

    }
}