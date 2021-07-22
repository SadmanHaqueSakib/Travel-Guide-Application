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

public class NamgyalTsemoGompa extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namgyal_tsemo_gompa);
        ImageSlider imageSlider= findViewById(R.id.namgyaltsemogompaslider);
        List<SlideModel> slideModels= new ArrayList<>();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.namgyal_tsemo_gompa2,""));
        slideModels.add(new SlideModel(R.drawable.namgyal_tsemo_gompa1,""));
        slideModels.add(new SlideModel(R.drawable.namgyal_tsemo_gompa3,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng Akshardham = new LatLng(34.167680, 77.590120);
        map.addMarker(new MarkerOptions().position(Akshardham).title("Namgyal Tsemo Gompa"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Akshardham));


    }
}