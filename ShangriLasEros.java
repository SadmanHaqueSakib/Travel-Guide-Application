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

public class ShangriLasEros extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shangri_las_eros);

        ImageSlider imageSlider= findViewById(R.id.shangrilaserosslider);
        List<SlideModel> slideModels= new ArrayList<>();

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.shangri_la_s_eros_hotel1,""));
        slideModels.add(new SlideModel(R.drawable.shangri_la_s_eros_hotel2,""));
        slideModels.add(new SlideModel(R.drawable.shangri_la_s_eros_hotel3,""));
        slideModels.add(new SlideModel(R.drawable.shangri_la_s_eros_hotel4,""));
        slideModels.add(new SlideModel(R.drawable.shangri_la_s_eros_hotel5,""));
        slideModels.add(new SlideModel(R.drawable.shangri_la_s_eros_hotel6,""));
        slideModels.add(new SlideModel(R.drawable.shangri_la_s_eros_hotel7,""));
        slideModels.add(new SlideModel(R.drawable.shangri_la_s_eros_hotel8,""));
        slideModels.add(new SlideModel(R.drawable.shangri_la_s_eros_hotel9,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng Akshardham = new LatLng(28.656978220792332, 77.14968264905804);
        map.addMarker(new MarkerOptions().position(Akshardham).title("Shangri-La's - Eros Hotel"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Akshardham));

    }
}