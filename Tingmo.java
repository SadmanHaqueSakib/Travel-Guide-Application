package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class Tingmo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tingmo);

        ImageSlider imageSlider= findViewById(R.id.tingmoslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.tingmo1,""));
        slideModels.add(new SlideModel(R.drawable.tingmo2,""));
        slideModels.add(new SlideModel(R.drawable.tingmo3,""));
        imageSlider.setImageList(slideModels,true);
    }
}