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

public class BarefootHavelockIsland extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barefoot_havelock_island);

        ImageSlider imageSlider= findViewById(R.id.barefoothavelockislandslider);
        List<SlideModel> slideModels= new ArrayList<>();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.barefoot_at_havelock_havelock_island1,""));
        slideModels.add(new SlideModel(R.drawable.barefoot_at_havelock_havelock_island3,""));
        slideModels.add(new SlideModel(R.drawable.barefoot_at_havelock_havelock_island4,""));
        slideModels.add(new SlideModel(R.drawable.barefoot_at_havelock_havelock_island5,""));
        slideModels.add(new SlideModel(R.drawable.barefoot_at_havelock_havelock_island6,""));
        slideModels.add(new SlideModel(R.drawable.barefoot_at_havelock_havelock_island2,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng lovlu = new LatLng(11.59139, 92.56527);
        map.addMarker(new MarkerOptions().position(lovlu).title("Barefoot Havelock Island"));
        map.moveCamera(CameraUpdateFactory.newLatLng(lovlu));

    }
}