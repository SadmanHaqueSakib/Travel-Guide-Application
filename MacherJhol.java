package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MacherJhol extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_macher_jhol);
        ImageSlider imageSlider= findViewById(R.id.macherjholslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.macher_jhol2,""));
        slideModels.add(new SlideModel(R.drawable.macher_jhol4,""));
        slideModels.add(new SlideModel(R.drawable.macher_jhol3,""));
        imageSlider.setImageList(slideModels,true);

    }
}