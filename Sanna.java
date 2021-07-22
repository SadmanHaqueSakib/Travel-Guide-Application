package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class Sanna extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanna);

        ImageSlider imageSlider= findViewById(R.id.sannaslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.sanna1,""));
        slideModels.add(new SlideModel(R.drawable.sanna2,""));
        slideModels.add(new SlideModel(R.drawable.sanna3,""));
        imageSlider.setImageList(slideModels,true);
    }
}