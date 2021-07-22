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

public class SindhuDarshanFestival extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sindhu_darshan_festival);

        ImageSlider imageSlider= findViewById(R.id.sindhudarshanfestivalslider);
        List<SlideModel> slideModels= new ArrayList<>();

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.sindhu_darshan_festival2,""));
        slideModels.add(new SlideModel(R.drawable.sindhu_darshan_festival1,""));
        slideModels.add(new SlideModel(R.drawable.sindhu_darshan_festival3,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng Akshardham = new LatLng(34.170000, 77.580000);
        map.addMarker(new MarkerOptions().position(Akshardham).title("Sindhu Darshan Festival"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Akshardham));


    }
}