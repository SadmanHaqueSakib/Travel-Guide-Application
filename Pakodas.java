package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class Pakodas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pakodas);

        ImageSlider imageSlider= findViewById(R.id.pakodasslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.pakodas2,""));
        slideModels.add(new SlideModel(R.drawable.pakodas3,""));
        slideModels.add(new SlideModel(R.drawable.pakodas,""));
        imageSlider.setImageList(slideModels,true);
    }
}