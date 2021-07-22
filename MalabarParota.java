package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MalabarParota extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malabar_parota);

        ImageSlider imageSlider= findViewById(R.id.malabarparotaslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.malabar_parota1,""));
        slideModels.add(new SlideModel(R.drawable.malabar_parota2,""));
        slideModels.add(new SlideModel(R.drawable.malabar_parota3,""));
        imageSlider.setImageList(slideModels,true);


    }
}