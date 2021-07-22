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

public class RamadaPlazaAgra extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramada_plaza_agra);
        ImageSlider imageSlider= findViewById(R.id.ramadaplazaagraslider);
        List<SlideModel> slideModels= new ArrayList<>();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.ramada_plaza_agra1,""));
        slideModels.add(new SlideModel(R.drawable.ramada_plaza_agra2,""));
        slideModels.add(new SlideModel(R.drawable.ramada_plaza_agra3,""));
        slideModels.add(new SlideModel(R.drawable.ramada_plaza_agra5,""));
        slideModels.add(new SlideModel(R.drawable.ramada_plaza_agra6,""));
        slideModels.add(new SlideModel(R.drawable.ramada_plaza_agra7,""));
        slideModels.add(new SlideModel(R.drawable.ramada_plaza_agra8,""));
        slideModels.add(new SlideModel(R.drawable.ramada_plaza_agra9,""));
        slideModels.add(new SlideModel(R.drawable.ramada_plaza_agra4,""));
        slideModels.add(new SlideModel(R.drawable.ramada_plaza_agra10,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng lovlu = new LatLng(27.08166, 78.05303);
        map.addMarker(new MarkerOptions().position(lovlu).title("Ramada Plaza Agra"));
        map.moveCamera(CameraUpdateFactory.newLatLng(lovlu));

    }
}