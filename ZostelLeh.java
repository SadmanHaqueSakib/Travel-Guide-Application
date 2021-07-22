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

public class ZostelLeh extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zostel_leh);

        ImageSlider imageSlider= findViewById(R.id.zostellehslider);
        List<SlideModel> slideModels= new ArrayList<>();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.zostel_leh1,""));
        slideModels.add(new SlideModel(R.drawable.zostel_leh2,""));
        slideModels.add(new SlideModel(R.drawable.zostel_leh3,""));
        slideModels.add(new SlideModel(R.drawable.zostel_leh4,""));
        slideModels.add(new SlideModel(R.drawable.zostel_leh6,""));
        slideModels.add(new SlideModel(R.drawable.zostel_leh7,""));
        slideModels.add(new SlideModel(R.drawable.zostel_leh8,""));
        slideModels.add(new SlideModel(R.drawable.zostel_leh9,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng sadman = new LatLng(34.169232368534644, 77.58226661534304);
        map.addMarker(new MarkerOptions().position(sadman).title("Zostel Leh Hotel"));
        map.moveCamera(CameraUpdateFactory.newLatLng(sadman));

    }
}