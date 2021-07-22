package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MuttonChaap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mutton_chaap);
        ImageSlider imageSlider= findViewById(R.id.muttonchaapslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.mutton_chaap1,""));
        slideModels.add(new SlideModel(R.drawable.mutton_chaap2,""));
        slideModels.add(new SlideModel(R.drawable.mutton_chaap3,""));
        imageSlider.setImageList(slideModels,true);

    }
}