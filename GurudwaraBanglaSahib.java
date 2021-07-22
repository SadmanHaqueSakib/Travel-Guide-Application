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

public class GurudwaraBanglaSahib extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gurudwara_bangla_sahib);

        ImageSlider imageSlider= findViewById(R.id.gurudwarabanglasahibaslider);
        List<SlideModel> slideModels= new ArrayList<>();

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.gurudwara_bangla_sahib1,""));
        slideModels.add(new SlideModel(R.drawable.gurudwara_bangla_sahib2,""));
        slideModels.add(new SlideModel(R.drawable.gurudwara_bangla_sahib3,""));
        imageSlider.setImageList(slideModels,true);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng Gurudwarabanglasahib = new LatLng(28.6266, 77.2091);
        map.addMarker(new MarkerOptions().position(Gurudwarabanglasahib).title("Gurudwara Bangla Sahib"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Gurudwarabanglasahib));

    }
}