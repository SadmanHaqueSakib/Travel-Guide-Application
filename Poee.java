package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class Poee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poee);

        ImageSlider imageSlider= findViewById(R.id.poeeslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.poee1,""));
        slideModels.add(new SlideModel(R.drawable.poee2,""));
        slideModels.add(new SlideModel(R.drawable.poee3,""));
        imageSlider.setImageList(slideModels,true);
    }
}