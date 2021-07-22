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

public class RashtrapratiBhaban extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rashtraprati_bhaban);
        ImageSlider imageSlider= findViewById(R.id.rashtrapratibhabanslider);
        List<SlideModel> slideModels= new ArrayList<>();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.rashtrapati_bhavan1,""));
        slideModels.add(new SlideModel(R.drawable.rashtrapati_bhavan2,""));
        slideModels.add(new SlideModel(R.drawable.rashtrapati_bhavan3,""));
        imageSlider.setImageList(slideModels,true);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng Rashtrapratibhaban = new LatLng(28.6143, 77.1994);
        map.addMarker(new MarkerOptions().position(Rashtrapratibhaban).title("Rashtraprati Bhaban"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Rashtrapratibhaban));

    }
}