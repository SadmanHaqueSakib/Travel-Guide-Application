package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class BedaiKachoriSabzi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bedai_kachori_sabzi);
        ImageSlider imageSlider= findViewById(R.id.bedaiandjalebislider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.bedai_and_jalebi1,""));
        slideModels.add(new SlideModel(R.drawable.bedai_and_jalebi2,""));
        slideModels.add(new SlideModel(R.drawable.bedai_and_jalebi3,""));
        imageSlider.setImageList(slideModels,true);

    }
}