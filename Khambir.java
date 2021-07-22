package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class Khambir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khambir);


        ImageSlider imageSlider= findViewById(R.id.khanbirslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.khambir1,""));
        slideModels.add(new SlideModel(R.drawable.khambir2,""));
        slideModels.add(new SlideModel(R.drawable.khambir3,""));
        imageSlider.setImageList(slideModels,true);
    }
}