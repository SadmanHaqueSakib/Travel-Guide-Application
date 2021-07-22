package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class Petha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petha);
        ImageSlider imageSlider= findViewById(R.id.pethaslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.petha1,""));
        slideModels.add(new SlideModel(R.drawable.petha2,""));
        slideModels.add(new SlideModel(R.drawable.petha3,""));
        imageSlider.setImageList(slideModels,true);

    }
}