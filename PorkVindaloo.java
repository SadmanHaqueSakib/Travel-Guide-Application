package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class PorkVindaloo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pork_vindaloo);


        ImageSlider imageSlider= findViewById(R.id.porkvindalooslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.pork_vindaloo1,""));
        slideModels.add(new SlideModel(R.drawable.pork_vindaloo2,""));
        slideModels.add(new SlideModel(R.drawable.pork_vindaloo3,""));
        imageSlider.setImageList(slideModels,true);
    }
}