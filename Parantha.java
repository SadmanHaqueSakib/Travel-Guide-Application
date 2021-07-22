package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class Parantha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parantha);

        ImageSlider imageSlider= findViewById(R.id.paranthaslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.parantha1,""));
        slideModels.add(new SlideModel(R.drawable.parantha2,""));
        slideModels.add(new SlideModel(R.drawable.parantha3,""));
        imageSlider.setImageList(slideModels,true);
    }
}