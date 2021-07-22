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

public class JawaharlalNehruBotanicalGarden extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jawaharlal_nehru_botanical_garden);


        ImageSlider imageSlider= findViewById(R.id.jawaharlalnehrubotanicalgardenslider);
        List<SlideModel> slideModels= new ArrayList<>();

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        slideModels.add(new SlideModel(R.drawable.jawaharlal_nehru_botanical_garden2,""));
        slideModels.add(new SlideModel(R.drawable.jawaharlal_nehru_botanical_garden1,""));
        slideModels.add(new SlideModel(R.drawable.jawaharlal_nehru_botanical_garden3,""));
        imageSlider.setImageList(slideModels,true);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng Sadman = new LatLng(8.75344072852716, 77.02632231212401);
        map.addMarker(new MarkerOptions().position(Sadman).title("Jawaharlal Nehru Botanical Garden"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Sadman));

    }
}