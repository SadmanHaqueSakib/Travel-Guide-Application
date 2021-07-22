package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class KeralaPrawnCurry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerala_prawn_curry);

        ImageSlider imageSlider= findViewById(R.id.keralaprawncurryslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.kerala_prawn_curry1,""));
        slideModels.add(new SlideModel(R.drawable.kerala_prawn_curry2,""));
        slideModels.add(new SlideModel(R.drawable.kerala_prawn_curry3,""));
        imageSlider.setImageList(slideModels,true);

    }
}