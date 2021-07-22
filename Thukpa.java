package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class Thukpa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thukpa);

        ImageSlider imageSlider= findViewById(R.id.thukpaslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.thukpa1,""));
        slideModels.add(new SlideModel(R.drawable.thukpa2,""));
        slideModels.add(new SlideModel(R.drawable.thukpa3,""));
        imageSlider.setImageList(slideModels,true);
    }
}