package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class Kabab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kabab);

        ImageSlider imageSlider= findViewById(R.id.kababslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.kebabs1,""));
        slideModels.add(new SlideModel(R.drawable.kebabs2,""));
        slideModels.add(new SlideModel(R.drawable.kebabs3,""));
        imageSlider.setImageList(slideModels,true);
    }
}