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

public class GoaMarriottResortSpa extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goa_marriott_resort_spa);

        ImageSlider imageSlider= findViewById(R.id.goamarriottresortspaslider);
        List<SlideModel> slideModels= new ArrayList<>();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.goa_marriott_resort_spa1,""));
        slideModels.add(new SlideModel(R.drawable.goa_marriott_resort_spa2,""));
        slideModels.add(new SlideModel(R.drawable.goa_marriott_resort_spa3,""));
        slideModels.add(new SlideModel(R.drawable.goa_marriott_resort_spa4,""));
        slideModels.add(new SlideModel(R.drawable.goa_marriott_resort_spa5,""));
        slideModels.add(new SlideModel(R.drawable.goa_marriott_resort_spa6,""));
        slideModels.add(new SlideModel(R.drawable.goa_marriott_resort_spa7,""));
        slideModels.add(new SlideModel(R.drawable.goa_marriott_resort_spa8,""));
        slideModels.add(new SlideModel(R.drawable.goa_marriott_resort_spa9,""));
        slideModels.add(new SlideModel(R.drawable.goa_marriott_resort_spa10,""));
        slideModels.add(new SlideModel(R.drawable.goa_marriott_resort_spa11,""));
        slideModels.add(new SlideModel(R.drawable.goa_marriott_resort_spa12,""));
        slideModels.add(new SlideModel(R.drawable.goa_marriott_resort_spa13,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng sadman = new LatLng(15.487189460572035, 73.80983456998742);
        map.addMarker(new MarkerOptions().position(sadman).title("Goa Marriott Resort and Spa"));
        map.moveCamera(CameraUpdateFactory.newLatLng(sadman));

    }
}