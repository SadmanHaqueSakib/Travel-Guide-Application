package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class Bhalla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhalla);
        ImageSlider imageSlider= findViewById(R.id.bhallaslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.bhalla1,""));
        slideModels.add(new SlideModel(R.drawable.bhalla2,""));
        slideModels.add(new SlideModel(R.drawable.bhalla3,""));
        imageSlider.setImageList(slideModels,true);

    }
}