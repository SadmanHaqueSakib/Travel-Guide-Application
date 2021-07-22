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

public class TajHotelAgra extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taj_hotel_agra);
        ImageSlider imageSlider= findViewById(R.id.tajhotelagraslider);
        List<SlideModel> slideModels= new ArrayList<>();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.taj_hotel_agra1,""));
        slideModels.add(new SlideModel(R.drawable.taj_hotel_agra2,""));
        slideModels.add(new SlideModel(R.drawable.taj_hotel_agra3,""));
        slideModels.add(new SlideModel(R.drawable.taj_hotel_agra5,""));
        slideModels.add(new SlideModel(R.drawable.taj_hotel_agra6,""));
        slideModels.add(new SlideModel(R.drawable.taj_hotel_agra7,""));
        slideModels.add(new SlideModel(R.drawable.taj_hotel_agra8,""));
        slideModels.add(new SlideModel(R.drawable.taj_hotel_agra9,""));
        slideModels.add(new SlideModel(R.drawable.taj_hotel_agra4,""));
        slideModels.add(new SlideModel(R.drawable.taj_hotel_agra10,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng lovlu = new LatLng(27.09474, 78.03236);
        map.addMarker(new MarkerOptions().position(lovlu).title("Taj Hotel Agra"));
        map.moveCamera(CameraUpdateFactory.newLatLng(lovlu));

    }
}