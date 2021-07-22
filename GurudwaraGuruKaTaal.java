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

public class GurudwaraGuruKaTaal extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gurudwara_guru_ka_taal);

        ImageSlider imageSlider= findViewById(R.id.gurudwaragurukataalslider);
        List<SlideModel> slideModels= new ArrayList<>();

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        slideModels.add(new SlideModel(R.drawable.gurudwara_guru_ka_taal2,""));
        slideModels.add(new SlideModel(R.drawable.gurudwara_guru_ka_taal1,""));
        slideModels.add(new SlideModel(R.drawable.gurudwara_guru_ka_taal3,""));
        imageSlider.setImageList(slideModels,true);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng Sadman = new LatLng(27.12411, 77.58017);
        map.addMarker(new MarkerOptions().position(Sadman).title("Gurudwara Guru Ka Taal"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Sadman));

    }
}