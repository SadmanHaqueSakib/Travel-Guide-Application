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

public class TridentJaipur extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trident_jaipur);


        ImageSlider imageSlider= findViewById(R.id.tridentjaipurslider);
        List<SlideModel> slideModels= new ArrayList<>();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.trident_jaipur1,""));
        slideModels.add(new SlideModel(R.drawable.trident_jaipur2,""));
        slideModels.add(new SlideModel(R.drawable.trident_jaipur3,""));
        slideModels.add(new SlideModel(R.drawable.trident_jaipur4,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng lovlu = new LatLng(26.57271, 75.50357);
        map.addMarker(new MarkerOptions().position(lovlu).title("Trident Jaipur"));
        map.moveCamera(CameraUpdateFactory.newLatLng(lovlu));

    }
}