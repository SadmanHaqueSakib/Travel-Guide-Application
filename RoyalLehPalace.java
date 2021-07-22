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

public class RoyalLehPalace extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_royal_leh_palace);

        ImageSlider imageSlider= findViewById(R.id.royallehpalaceslider);
        List<SlideModel> slideModels= new ArrayList<>();

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.royal_leh_palace2,""));
        slideModels.add(new SlideModel(R.drawable.royal_leh_palace1,""));
        slideModels.add(new SlideModel(R.drawable.royal_leh_palace3,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng Akshardham = new LatLng(34.166115, 77.586310);
        map.addMarker(new MarkerOptions().position(Akshardham).title("Royal Leh Palace"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Akshardham));


    }
}