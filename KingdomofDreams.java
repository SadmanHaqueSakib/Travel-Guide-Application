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

public class KingdomofDreams extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kingdomof_dreams);
        ImageSlider imageSlider= findViewById(R.id.kingdomofdreamsslider);
        List<SlideModel> slideModels= new ArrayList<>();

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        slideModels.add(new SlideModel(R.drawable.kingdom_of_dreams1,""));
        slideModels.add(new SlideModel(R.drawable.kingdom_of_dreams2,""));
        slideModels.add(new SlideModel(R.drawable.kingdom_of_dreams3,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng Kingdomofdreams = new LatLng(28.4679, 77.0689);
        map.addMarker(new MarkerOptions().position(Kingdomofdreams).title("Kingdom of Dreams"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Kingdomofdreams));

    }
}