package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class Bebinca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebinca);

        ImageSlider imageSlider= findViewById(R.id.bebincaslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.bebinca1,""));
        slideModels.add(new SlideModel(R.drawable.bebinca2,""));
        slideModels.add(new SlideModel(R.drawable.bebinca3,""));
        imageSlider.setImageList(slideModels,true);
    }
}