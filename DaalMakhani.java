package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class DaalMakhani extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daal_makhani);

        ImageSlider imageSlider= findViewById(R.id.daalmakhanislider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.daal_makhni,""));
        slideModels.add(new SlideModel(R.drawable.daal_makhni3,""));
        slideModels.add(new SlideModel(R.drawable.daal_makhni1,""));
        imageSlider.setImageList(slideModels,true);
    }
}