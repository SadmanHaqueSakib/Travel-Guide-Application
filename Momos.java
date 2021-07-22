package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class Momos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_momos);

        ImageSlider imageSlider= findViewById(R.id.momosslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.momos1,""));
        slideModels.add(new SlideModel(R.drawable.momos2,""));
        slideModels.add(new SlideModel(R.drawable.momos3,""));
        imageSlider.setImageList(slideModels,true);
    }
}