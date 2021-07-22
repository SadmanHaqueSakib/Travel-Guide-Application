package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class Dalmoth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dalmoth);
        ImageSlider imageSlider= findViewById(R.id.dalmothslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.dalmoth1,""));
        slideModels.add(new SlideModel(R.drawable.dalmoth2,""));
        slideModels.add(new SlideModel(R.drawable.dalmoth3,""));
        imageSlider.setImageList(slideModels,true);

    }
}