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

public class MollemNationalPark extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mollem_national_park);

        ImageSlider imageSlider= findViewById(R.id.mollemnationalparkslider);
        List<SlideModel> slideModels= new ArrayList<>();

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        slideModels.add(new SlideModel(R.drawable.mollem_national_park1,""));
        slideModels.add(new SlideModel(R.drawable.mollem_national_park2,""));
        slideModels.add(new SlideModel(R.drawable.mollem_national_park3,""));
        imageSlider.setImageList(slideModels,true);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng Akshardham = new LatLng(15.37932097161664, 74.22702810397523);
        map.addMarker(new MarkerOptions().position(Akshardham).title("Mollem National Park"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Akshardham));

    }
}