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

public class RegionalMuseumofNaturalHistory extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regional_museumof_natural_history);


        ImageSlider imageSlider= findViewById(R.id.regionalmuseumofnaturalhistoryslider);
        List<SlideModel> slideModels= new ArrayList<>();

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        slideModels.add(new SlideModel(R.drawable.regional_museum_of_natural_history1,""));
        slideModels.add(new SlideModel(R.drawable.regional_museum_of_natural_history2,""));
        slideModels.add(new SlideModel(R.drawable.regional_museum_of_natural_history3,""));
        imageSlider.setImageList(slideModels,true);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng Sadman = new LatLng(12.305819890955048, 76.67415016841257);
        map.addMarker(new MarkerOptions().position(Sadman).title("Regional Museum of Natural History"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Sadman));

    }
}