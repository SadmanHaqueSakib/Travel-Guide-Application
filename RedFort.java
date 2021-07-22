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

public class RedFort extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red_fort);
        ImageSlider imageSlider= findViewById(R.id.redfortslider);
        List<SlideModel> slideModels= new ArrayList<>();
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        slideModels.add(new SlideModel(R.drawable.red_fort2,""));
        slideModels.add(new SlideModel(R.drawable.red_fort1,""));
        slideModels.add(new SlideModel(R.drawable.red_fort3,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng Redfort = new LatLng(28.6562, 77.2410);
        map.addMarker(new MarkerOptions().position(Redfort).title("Red Fort"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Redfort));

    }

}