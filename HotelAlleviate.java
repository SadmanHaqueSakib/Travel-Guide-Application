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

public class HotelAlleviate extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_alleviate);
        ImageSlider imageSlider= findViewById(R.id.hotelalleviateslider);
        List<SlideModel> slideModels= new ArrayList<>();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.hotel_alleviate1,""));
        slideModels.add(new SlideModel(R.drawable.hotel_alleviate2,""));
        slideModels.add(new SlideModel(R.drawable.hotel_alleviate3,""));
        slideModels.add(new SlideModel(R.drawable.hotel_alleviate5,""));
        slideModels.add(new SlideModel(R.drawable.hotel_alleviate6,""));
        slideModels.add(new SlideModel(R.drawable.hotel_alleviate7,""));
        slideModels.add(new SlideModel(R.drawable.hotel_alleviate8,""));
        slideModels.add(new SlideModel(R.drawable.hotel_alleviate9,""));
        slideModels.add(new SlideModel(R.drawable.hotel_alleviate4,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng lovlu = new LatLng(27.11244, 78.01296);
        map.addMarker(new MarkerOptions().position(lovlu).title("Hotel Alleviate"));
        map.moveCamera(CameraUpdateFactory.newLatLng(lovlu));

    }
}