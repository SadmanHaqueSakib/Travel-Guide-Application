package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class BarbequeFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barbeque_food);
        ImageSlider imageSlider= findViewById(R.id.barbequefoodslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.barbeque_food2,""));
        slideModels.add(new SlideModel(R.drawable.barbeque_food4,""));
        slideModels.add(new SlideModel(R.drawable.barbeque_food3,""));
        imageSlider.setImageList(slideModels,true);

    }
}