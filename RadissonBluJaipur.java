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

public class RadissonBluJaipur extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radisson_blu_jaipur);

        ImageSlider imageSlider= findViewById(R.id.radissonblujaipurslider);
        List<SlideModel> slideModels= new ArrayList<>();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.radisson_blu_jaipur1,""));
        slideModels.add(new SlideModel(R.drawable.radisson_blu_jaipur2,""));
        slideModels.add(new SlideModel(R.drawable.radisson_blu_jaipur3,""));
        slideModels.add(new SlideModel(R.drawable.radisson_blu_jaipur4,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng lovlu = new LatLng(26.50336, 75.47399);
        map.addMarker(new MarkerOptions().position(lovlu).title("Radisson Blu Jaipur"));
        map.moveCamera(CameraUpdateFactory.newLatLng(lovlu));

    }
}