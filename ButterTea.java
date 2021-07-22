package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class ButterTea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butter_tea);

        ImageSlider imageSlider= findViewById(R.id.butterteaslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.butter_tea1,""));
        slideModels.add(new SlideModel(R.drawable.butter_tea2,""));
        slideModels.add(new SlideModel(R.drawable.butter_tea3,""));
        imageSlider.setImageList(slideModels,true);
    }
}