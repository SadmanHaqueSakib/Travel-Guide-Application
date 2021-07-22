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

public class MataNoMadhDeshDeviMaaAshapura extends AppCompatActivity implements OnMapReadyCallback {

    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mata_no_madh_desh_devi_maa_ashapura);

        ImageSlider imageSlider= findViewById(R.id.matanomadhdeshdevimaaashapuraslider);
        List<SlideModel> slideModels= new ArrayList<>();

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        slideModels.add(new SlideModel(R.drawable.mata_no_madh_desh_devi_maa_ashapura2,""));
        slideModels.add(new SlideModel(R.drawable.mata_no_madh_desh_devi_maa_ashapura1,""));
        slideModels.add(new SlideModel(R.drawable.mata_no_madh_desh_devi_maa_ashapura3,""));
        imageSlider.setImageList(slideModels,true);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng Sadman = new LatLng(23.54147708128694, 68.9488263014495);
        map.addMarker(new MarkerOptions().position(Sadman).title("Mata No Madh Desh Devi Maa Ashapura"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Sadman));

    }
}