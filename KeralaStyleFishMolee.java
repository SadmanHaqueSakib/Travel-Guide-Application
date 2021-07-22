package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class KeralaStyleFishMolee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerala_style_fish_molee);

        ImageSlider imageSlider= findViewById(R.id.keralastylefishmoleeslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.kerala_style_fish_molee1,""));
        slideModels.add(new SlideModel(R.drawable.kerala_style_fish_molee2,""));
        slideModels.add(new SlideModel(R.drawable.kerala_style_fish_molee3,""));
        imageSlider.setImageList(slideModels,true);

    }
}