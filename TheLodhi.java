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

public class TheLodhi extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ImageSlider imageSlider= findViewById(R.id.thelodhislider);
        List<SlideModel> slideModels= new ArrayList<>();


        setContentView(R.layout.activity_the_lodhi);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.the_lodhi1,""));
        slideModels.add(new SlideModel(R.drawable.the_lodhi2,""));
        slideModels.add(new SlideModel(R.drawable.the_lodhi3,""));
        slideModels.add(new SlideModel(R.drawable.the_lodhi4,""));
        slideModels.add(new SlideModel(R.drawable.the_lodhi5,""));
        slideModels.add(new SlideModel(R.drawable.the_lodhi6,""));
        slideModels.add(new SlideModel(R.drawable.the_lodhi7,""));
        slideModels.add(new SlideModel(R.drawable.the_lodhi8,""));
        slideModels.add(new SlideModel(R.drawable.the_lodhi9,""));
        slideModels.add(new SlideModel(R.drawable.the_lodhi10,""));
        slideModels.add(new SlideModel(R.drawable.the_lodhi11,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng Akshardham = new LatLng(28.5931, 77.2197);
        map.addMarker(new MarkerOptions().position(Akshardham).title("The Lodhi Hotel"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Akshardham));

    }
}