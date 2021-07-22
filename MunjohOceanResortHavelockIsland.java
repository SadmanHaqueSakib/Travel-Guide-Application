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

public class MunjohOceanResortHavelockIsland extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_munjoh_ocean_resort_havelock_island);

        ImageSlider imageSlider= findViewById(R.id.munjohoceanresorthavelockislandslider);
        List<SlideModel> slideModels= new ArrayList<>();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.munjoh_ocean_resort2,""));
        slideModels.add(new SlideModel(R.drawable.munjoh_ocean_resort3,""));
        slideModels.add(new SlideModel(R.drawable.munjoh_ocean_resort4,""));
        slideModels.add(new SlideModel(R.drawable.munjoh_ocean_resort5,""));
        slideModels.add(new SlideModel(R.drawable.munjoh_ocean_resort6,""));
        slideModels.add(new SlideModel(R.drawable.munjoh_ocean_resort7,""));
        slideModels.add(new SlideModel(R.drawable.munjoh_ocean_resort8,""));
        slideModels.add(new SlideModel(R.drawable.munjoh_ocean_resort9,""));
        slideModels.add(new SlideModel(R.drawable.munjoh_ocean_resort10,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng lovlu = new LatLng(12.00521, 93.00272);
        map.addMarker(new MarkerOptions().position(lovlu).title("Munjoh Ocean Resort Havelock Island"));
        map.moveCamera(CameraUpdateFactory.newLatLng(lovlu));

    }
}