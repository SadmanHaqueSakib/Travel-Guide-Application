package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class DaulatKiChaatJalebis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daulat_ki_chaat_jalebis);

        ImageSlider imageSlider= findViewById(R.id.daulatkichaatjalebisslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.daulat_ki_chaat_jalebis1,""));
        slideModels.add(new SlideModel(R.drawable.daulat_ki_chaat_jalebis2,""));
        slideModels.add(new SlideModel(R.drawable.daulat_ki_chaat_jalebis3,""));
        slideModels.add(new SlideModel(R.drawable.daulat_ki_chaat_jalebis4,""));
        imageSlider.setImageList(slideModels,true);
    }
}