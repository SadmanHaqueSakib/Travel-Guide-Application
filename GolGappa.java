package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class GolGappa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gol_gappa);

        ImageSlider imageSlider= findViewById(R.id.golgappaslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.gol_gappa1,""));
        slideModels.add(new SlideModel(R.drawable.gol_gappa2,""));
        slideModels.add(new SlideModel(R.drawable.gol_gappa3,""));
        imageSlider.setImageList(slideModels,true);
    }
}