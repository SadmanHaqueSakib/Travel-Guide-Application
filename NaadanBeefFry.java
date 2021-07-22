package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class NaadanBeefFry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naadan_beef_fry);

        ImageSlider imageSlider= findViewById(R.id.naadanbeeffryslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.naadan_beef_fry1,""));
        slideModels.add(new SlideModel(R.drawable.naadan_beef_fry2,""));
        slideModels.add(new SlideModel(R.drawable.naadan_beef_fry3,""));
        imageSlider.setImageList(slideModels,true);

    }
}