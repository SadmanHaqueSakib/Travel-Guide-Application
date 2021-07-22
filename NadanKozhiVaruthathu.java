package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class NadanKozhiVaruthathu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nadan_kozhi_varuthathu);

        ImageSlider imageSlider= findViewById(R.id.nadankozhivaruthathuslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.nadan_kozhi_varuthathu1,""));
        slideModels.add(new SlideModel(R.drawable.nadan_kozhi_varuthathu2,""));
        slideModels.add(new SlideModel(R.drawable.nadan_kozhi_varuthathu3,""));
        imageSlider.setImageList(slideModels,true);

    }
}