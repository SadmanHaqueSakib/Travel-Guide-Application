package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class LangarKaPrasad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_langar_ka_prasad);
        ImageSlider imageSlider= findViewById(R.id.langarkaprasadslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.langar_ka_prasad1,""));
        slideModels.add(new SlideModel(R.drawable.langar_ka_prasad2,""));
        slideModels.add(new SlideModel(R.drawable.langar_ka_prasad3,""));
        imageSlider.setImageList(slideModels,true);

    }
}