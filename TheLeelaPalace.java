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

public class TheLeelaPalace extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_leela_palace);

        ImageSlider imageSlider= findViewById(R.id.theleelapalaceslider);
        List<SlideModel> slideModels= new ArrayList<>();

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.the_leela_palace_new_delhi,""));
        slideModels.add(new SlideModel(R.drawable.the_leela_palace_new_delhi2,""));
        slideModels.add(new SlideModel(R.drawable.the_leela_palace_new_delhi3,""));
        slideModels.add(new SlideModel(R.drawable.the_leela_palace_new_delhi4,""));
        slideModels.add(new SlideModel(R.drawable.the_leela_palace_new_delhi5,""));
        slideModels.add(new SlideModel(R.drawable.the_leela_palace_new_delhi6,""));
        slideModels.add(new SlideModel(R.drawable.the_leela_palace_new_delhi7,""));
        slideModels.add(new SlideModel(R.drawable.the_leela_palace_new_delhi8,""));
        slideModels.add(new SlideModel(R.drawable.the_leela_palace_new_delhi9,""));
        slideModels.add(new SlideModel(R.drawable.the_leela_palace_new_delhi10,""));
        slideModels.add(new SlideModel(R.drawable.the_leela_palace_new_delhi11,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng Akshardham = new LatLng(13.0170, 80.2737);
        map.addMarker(new MarkerOptions().position(Akshardham).title("The Leela Palace"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Akshardham));

    }
}