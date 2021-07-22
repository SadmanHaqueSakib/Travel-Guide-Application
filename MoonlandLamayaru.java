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

public class MoonlandLamayaru extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moonland_lamayaru);
        ImageSlider imageSlider= findViewById(R.id.moonlandlamayaruslider);
        List<SlideModel> slideModels= new ArrayList<>();
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.moonland2,""));
        slideModels.add(new SlideModel(R.drawable.moonland11,""));
        slideModels.add(new SlideModel(R.drawable.moonland3,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng Akshardham = new LatLng(34.079090, 76.817566);
        map.addMarker(new MarkerOptions().position(Akshardham).title("Moonland Lamayaru"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Akshardham));


    }
}