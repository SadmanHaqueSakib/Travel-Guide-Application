package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class PrawnBalchao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prawn_balchao);

        ImageSlider imageSlider= findViewById(R.id.prawnbalchaoslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.prawn_balchao1,""));
        slideModels.add(new SlideModel(R.drawable.prawn_balchao2,""));
        slideModels.add(new SlideModel(R.drawable.prawn_balchao3,""));
        imageSlider.setImageList(slideModels,true);
    }
}