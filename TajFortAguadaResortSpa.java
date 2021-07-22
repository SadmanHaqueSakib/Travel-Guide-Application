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

public class TajFortAguadaResortSpa extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taj_fort_aguada_resort_spa);

        ImageSlider imageSlider= findViewById(R.id.tajfortaguadaresortspaslider);
        List<SlideModel> slideModels= new ArrayList<>();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.taj_fort_aguada_resort1,""));
        slideModels.add(new SlideModel(R.drawable.taj_fort_aguada_resort2,""));
        slideModels.add(new SlideModel(R.drawable.taj_fort_aguada_resort3,""));
        slideModels.add(new SlideModel(R.drawable.taj_fort_aguada_resort4,""));
        slideModels.add(new SlideModel(R.drawable.taj_fort_aguada_resort5,""));
        slideModels.add(new SlideModel(R.drawable.taj_fort_aguada_resort6,""));
        slideModels.add(new SlideModel(R.drawable.taj_fort_aguada_resort7,""));
        slideModels.add(new SlideModel(R.drawable.taj_fort_aguada_resort8,""));
        slideModels.add(new SlideModel(R.drawable.taj_fort_aguada_resort9,""));
        slideModels.add(new SlideModel(R.drawable.taj_fort_aguada_resort10,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng sadman = new LatLng(15.497848574123239, 73.76725858699584);
        map.addMarker(new MarkerOptions().position(sadman).title("Taj Fort Aguada Resort Spa"));
        map.moveCamera(CameraUpdateFactory.newLatLng(sadman));

    }
}