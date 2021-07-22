package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class AmritsariKulcha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amritsari_kulcha);
        ImageSlider imageSlider= findViewById(R.id.amritsarikulchaslider);
        List<SlideModel> slideModels= new ArrayList<>();


        slideModels.add(new SlideModel(R.drawable.amritsari_kulcha2,""));
        slideModels.add(new SlideModel(R.drawable.amritsari_kulcha4,""));
        slideModels.add(new SlideModel(R.drawable.amritsari_kulcha3,""));
        imageSlider.setImageList(slideModels,true);

    }
}