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

public class EcoGardenResortKerala extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eco_garden_resort_kerala);
        ImageSlider imageSlider= findViewById(R.id.ecogardenresortkeralaslider);
        List<SlideModel> slideModels= new ArrayList<>();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.eco_garden_resort_kerala1,""));
        slideModels.add(new SlideModel(R.drawable.eco_garden_resort_kerala3,""));
        slideModels.add(new SlideModel(R.drawable.eco_garden_resort_kerala4,""));
        slideModels.add(new SlideModel(R.drawable.eco_garden_resort_kerala2,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng lovlu = new LatLng(11.131370, 73.223228);
        map.addMarker(new MarkerOptions().position(lovlu).title("Eco Garden Resort Kerala"));
        map.moveCamera(CameraUpdateFactory.newLatLng(lovlu));

    }
}