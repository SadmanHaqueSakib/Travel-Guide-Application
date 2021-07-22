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

public class TheTajMahal extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_taj_mahal);

        ImageSlider imageSlider= findViewById(R.id.thetajmahalslider);
        List<SlideModel> slideModels= new ArrayList<>();

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.the_taj_mahal_hotel1,""));
        slideModels.add(new SlideModel(R.drawable.the_taj_mahal_hotel2,""));
        slideModels.add(new SlideModel(R.drawable.the_taj_mahal_hotel3,""));
        slideModels.add(new SlideModel(R.drawable.the_taj_mahal_hotel4,""));
        slideModels.add(new SlideModel(R.drawable.the_taj_mahal_hotel5,""));
        slideModels.add(new SlideModel(R.drawable.the_taj_mahal_hotel6,""));
        slideModels.add(new SlideModel(R.drawable.the_taj_mahal_hotel7,""));
        slideModels.add(new SlideModel(R.drawable.the_taj_mahal_hotel8,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng Akshardham = new LatLng(18.9217, 72.8332);
        map.addMarker(new MarkerOptions().position(Akshardham).title("The Taj Mahal Hotel"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Akshardham));

    }
}