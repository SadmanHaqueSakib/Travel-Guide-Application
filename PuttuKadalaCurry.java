package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class PuttuKadalaCurry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puttu_kadala_curry);

        ImageSlider imageSlider= findViewById(R.id.puttukadalacurryslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.puttu_and_kadala_curry1,""));
        slideModels.add(new SlideModel(R.drawable.puttu_and_kadala_curry2,""));
        slideModels.add(new SlideModel(R.drawable.puttu_and_kadala_curry3,""));
        imageSlider.setImageList(slideModels,true);

    }
}