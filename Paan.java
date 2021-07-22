package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class Paan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paan);

        ImageSlider imageSlider= findViewById(R.id.paanslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.paan1,""));
        slideModels.add(new SlideModel(R.drawable.paan2,""));
        slideModels.add(new SlideModel(R.drawable.paan3,""));
        imageSlider.setImageList(slideModels,true);
    }
}