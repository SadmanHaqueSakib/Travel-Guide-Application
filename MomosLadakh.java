package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MomosLadakh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_momos_ladakh);

        ImageSlider imageSlider= findViewById(R.id.momosladakhslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.momos5,""));
        slideModels.add(new SlideModel(R.drawable.momos6,""));
        slideModels.add(new SlideModel(R.drawable.momos7,""));
        imageSlider.setImageList(slideModels,true);
    }
}