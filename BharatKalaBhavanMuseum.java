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

public class BharatKalaBhavanMuseum extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bharat_kala_bhavan_museum);

        ImageSlider imageSlider= findViewById(R.id.bharatkalabhavanmuseumslider);
        List<SlideModel> slideModels= new ArrayList<>();

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        slideModels.add(new SlideModel(R.drawable.bharat_kala_bhavan_museum2,""));
        slideModels.add(new SlideModel(R.drawable.bharat_kala_bhavan_museum1,""));
        slideModels.add(new SlideModel(R.drawable.bharat_kala_bhavan_museum3,""));
        imageSlider.setImageList(slideModels,true);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng Sadman = new LatLng(25.27203329652515, 82.99583306491198);
        map.addMarker(new MarkerOptions().position(Sadman).title("Bharat Kala Bhavan Museum"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Sadman));

    }
}