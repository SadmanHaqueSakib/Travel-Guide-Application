package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class AhujaLassi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ahuja_lassi);
        ImageSlider imageSlider= findViewById(R.id.ahujalassislider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.ahuja_lassi1,""));
        slideModels.add(new SlideModel(R.drawable.ahuja_lassi2,""));
        slideModels.add(new SlideModel(R.drawable.ahuja_lassi3,""));
        imageSlider.setImageList(slideModels,true);

    }
}