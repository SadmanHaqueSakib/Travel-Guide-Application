package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class ApricotJam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apricot_jam);

        ImageSlider imageSlider= findViewById(R.id.apricotjamslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.apricot_jam1,""));
        slideModels.add(new SlideModel(R.drawable.apricot_jam2,""));
        slideModels.add(new SlideModel(R.drawable.apricot_jam3,""));
        imageSlider.setImageList(slideModels,true);
    }
}