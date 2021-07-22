package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class Idiyappam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idiyappam);

        ImageSlider imageSlider= findViewById(R.id.idiyappamslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.idiyappam1,""));
        slideModels.add(new SlideModel(R.drawable.idiyappam2,""));
        slideModels.add(new SlideModel(R.drawable.idiyappam3,""));
        imageSlider.setImageList(slideModels,true);

    }
}