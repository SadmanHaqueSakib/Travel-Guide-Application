package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class ButterChicken extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butter_chicken);


        ImageSlider imageSlider= findViewById(R.id.butterchickenslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.butter_chicken1,""));
        slideModels.add(new SlideModel(R.drawable.butter_chicken2,""));
        slideModels.add(new SlideModel(R.drawable.butter_chicken3,""));
        imageSlider.setImageList(slideModels,true);

    }
}