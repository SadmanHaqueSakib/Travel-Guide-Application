package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class KathiRoll extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kathi_roll);

        ImageSlider imageSlider= findViewById(R.id.kathirollslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.kathi_roll1,""));
        slideModels.add(new SlideModel(R.drawable.kathi_roll2,""));
        slideModels.add(new SlideModel(R.drawable.kathi_roll3,""));
        imageSlider.setImageList(slideModels,true);
    }
}