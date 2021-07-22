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

public class ItmadUdDaulahsTomb extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itmad_ud_daulahs_tomb);


        ImageSlider imageSlider= findViewById(R.id.itmaduddaulahstombslider);
        List<SlideModel> slideModels= new ArrayList<>();

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        slideModels.add(new SlideModel(R.drawable.itmad_ud_daulahs_tomb2,""));
        slideModels.add(new SlideModel(R.drawable.itmad_ud_daulahs_tomb1,""));
        slideModels.add(new SlideModel(R.drawable.itmad_ud_daulahs_tomb3,""));
        imageSlider.setImageList(slideModels,true);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng Sadman = new LatLng(27.11352, 78.01519);
        map.addMarker(new MarkerOptions().position(Sadman).title("Itmad Ud Daulah's Tomb"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Sadman));

    }
}