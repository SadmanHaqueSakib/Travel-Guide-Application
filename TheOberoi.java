package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

public class TheOberoi extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_oberoi);

        ImageSlider imageSlider= findViewById(R.id.oberoislider);
        List<SlideModel> slideModels= new ArrayList<>();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.the_oberoi_new_delhi2,""));
        slideModels.add(new SlideModel(R.drawable.the_oberoi_new_delhi3,""));
        slideModels.add(new SlideModel(R.drawable.the_oberoi_new_delhi4,""));
        slideModels.add(new SlideModel(R.drawable.the_oberoi_new_delhi5,""));
        slideModels.add(new SlideModel(R.drawable.the_oberoi_new_delhi6,""));
        slideModels.add(new SlideModel(R.drawable.the_oberoi_new_delhi7,""));
        slideModels.add(new SlideModel(R.drawable.the_oberoi_new_delhi8,""));
        slideModels.add(new SlideModel(R.drawable.the_oberoi_new_delhi9,""));
        slideModels.add(new SlideModel(R.drawable.the_oberoi_new_delhi10,""));
        slideModels.add(new SlideModel(R.drawable.the_oberoi_new_delhi11,""));
        slideModels.add(new SlideModel(R.drawable.the_oberoi_new_delhi12,""));
        slideModels.add(new SlideModel(R.drawable.the_oberoi_new_delhi13,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng lovlu = new LatLng(28.50217, 77.088228);
        map.addMarker(new MarkerOptions().position(lovlu).title("The Oberoi Hotel"));
        map.moveCamera(CameraUpdateFactory.newLatLng(lovlu));

    }
}