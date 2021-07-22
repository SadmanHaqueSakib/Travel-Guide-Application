package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MuttonTikka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mutton_tikka);

        ImageSlider imageSlider= findViewById(R.id.muttontikkaslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.mutton_tikka1,""));
        slideModels.add(new SlideModel(R.drawable.mutton_tikka2,""));
        slideModels.add(new SlideModel(R.drawable.mutton_tikka3,""));
        imageSlider.setImageList(slideModels,true);
    }
}