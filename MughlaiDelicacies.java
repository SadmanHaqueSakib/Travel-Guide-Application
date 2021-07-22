package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MughlaiDelicacies extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mughlai_delicacies);
        ImageSlider imageSlider= findViewById(R.id.mughlaidelicaciesslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.mughlai_delicacies1,""));
        slideModels.add(new SlideModel(R.drawable.mughlai_delicacies2,""));
        slideModels.add(new SlideModel(R.drawable.mughlai_delicacies3,""));
        imageSlider.setImageList(slideModels,true);

    }
}