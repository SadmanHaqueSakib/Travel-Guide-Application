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

public class RossandSmithIsland extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rossand_smith_island);

        ImageSlider imageSlider= findViewById(R.id.rossandsmithislandslider);
        List<SlideModel> slideModels= new ArrayList<>();

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        slideModels.add(new SlideModel(R.drawable.ross_smith_islands3,""));
        slideModels.add(new SlideModel(R.drawable.ross_smith_islands4,""));
        slideModels.add(new SlideModel(R.drawable.ross_smith_island5,""));
        imageSlider.setImageList(slideModels,true);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng Sadman = new LatLng(13.18215, 93.04201);
        map.addMarker(new MarkerOptions().position(Sadman).title("Ross and Smith Island"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Sadman));

    }
}