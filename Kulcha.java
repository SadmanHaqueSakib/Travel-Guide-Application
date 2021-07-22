package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class Kulcha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kulcha);
        ImageSlider imageSlider= findViewById(R.id.kulchaslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.kulcha1,""));
        slideModels.add(new SlideModel(R.drawable.kulcha2,""));
        slideModels.add(new SlideModel(R.drawable.kulcha3,""));
        imageSlider.setImageList(slideModels,true);

    }
}