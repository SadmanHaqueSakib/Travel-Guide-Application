package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class Kingfish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kingfish);

        ImageSlider imageSlider= findViewById(R.id.kingfishslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.kingfish1,""));
        slideModels.add(new SlideModel(R.drawable.kingfish2,""));
        slideModels.add(new SlideModel(R.drawable.kingfish3,""));
        imageSlider.setImageList(slideModels,true);
    }
}