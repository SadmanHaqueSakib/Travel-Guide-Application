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

public class PuranaQila extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purana_qila);

        ImageSlider imageSlider= findViewById(R.id.puranaqilaslider);
        List<SlideModel> slideModels= new ArrayList<>();
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.purana_qila1,""));
        slideModels.add(new SlideModel(R.drawable.purana_qila2,""));
        slideModels.add(new SlideModel(R.drawable.purana_qila3,""));
        imageSlider.setImageList(slideModels,true);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng Puranaqila = new LatLng(28.6096, 77.2437);
        map.addMarker(new MarkerOptions().position(Puranaqila).title("Purana Qila"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Puranaqila));

    }
}