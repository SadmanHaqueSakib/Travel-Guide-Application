package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class Feni extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feni);

        ImageSlider imageSlider= findViewById(R.id.fenislider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.feni1,""));
        slideModels.add(new SlideModel(R.drawable.feni2,""));
        slideModels.add(new SlideModel(R.drawable.feni3,""));
        imageSlider.setImageList(slideModels,true);
    }
}