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

public class KidZania extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kid_zania);
        ImageSlider imageSlider= findViewById(R.id.kidzaniaslider);
        List<SlideModel> slideModels= new ArrayList<>();
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        slideModels.add(new SlideModel(R.drawable.kid_zania1,""));
        slideModels.add(new SlideModel(R.drawable.kid_zania2,""));
        slideModels.add(new SlideModel(R.drawable.kid_zania3,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng Akshardham = new LatLng(28.564850242658686, 77.32204152680472);
        map.addMarker(new MarkerOptions().position(Akshardham).title("KidZania"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Akshardham));

    }
}