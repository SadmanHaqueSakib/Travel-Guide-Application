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

public class DudhsagarWaterfalls extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dudhsagar_waterfalls);

        ImageSlider imageSlider= findViewById(R.id.dudhsagarwaterfallsslider);
        List<SlideModel> slideModels= new ArrayList<>();

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        slideModels.add(new SlideModel(R.drawable.dudhsagar_waterfalls1,""));
        slideModels.add(new SlideModel(R.drawable.dudhsagar_waterfalls2,""));
        slideModels.add(new SlideModel(R.drawable.dudhsagar_waterfalls3,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng sadman = new LatLng(15.33588469271145, 74.24480271331169);
        map.addMarker(new MarkerOptions().position(sadman).title("Dudhsagar Waterfalls"));
        map.moveCamera(CameraUpdateFactory.newLatLng(sadman));

    }
}