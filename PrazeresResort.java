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

public class PrazeresResort extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prazeres_resort);

        ImageSlider imageSlider= findViewById(R.id.prazeresresortslider);
        List<SlideModel> slideModels= new ArrayList<>();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.prazeres_resort1,""));
        slideModels.add(new SlideModel(R.drawable.prazeres_resort2,""));
        slideModels.add(new SlideModel(R.drawable.prazeres_resort3,""));
        slideModels.add(new SlideModel(R.drawable.prazeres_resort4,""));
        slideModels.add(new SlideModel(R.drawable.prazeres_resort5,""));
        slideModels.add(new SlideModel(R.drawable.prazeres_resort6,""));
        slideModels.add(new SlideModel(R.drawable.prazeres_resort7,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng sadman = new LatLng(15.512833997087643, 73.77183211029714);
        map.addMarker(new MarkerOptions().position(sadman).title("Prazeres Resort"));
        map.moveCamera(CameraUpdateFactory.newLatLng(sadman));

    }
}