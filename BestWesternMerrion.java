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

public class BestWesternMerrion extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best_western_merrion);
        ImageSlider imageSlider= findViewById(R.id.bestwesternmerrionslider);
        List<SlideModel> slideModels= new ArrayList<>();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.best_western_merrion1,""));
        slideModels.add(new SlideModel(R.drawable.best_western_merrion2,""));
        slideModels.add(new SlideModel(R.drawable.best_western_merrion3,""));
        slideModels.add(new SlideModel(R.drawable.best_western_merrion4,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng lovlu = new LatLng(31.39047, 74.51457);
        map.addMarker(new MarkerOptions().position(lovlu).title("Best Western Merrion"));
        map.moveCamera(CameraUpdateFactory.newLatLng(lovlu));

    }
}