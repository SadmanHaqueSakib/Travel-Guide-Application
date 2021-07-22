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

public class ParkInnRadissonAmritsar extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_park_inn_radisson_amritsar);
        ImageSlider imageSlider= findViewById(R.id.parkinnradissonamritsarslider);
        List<SlideModel> slideModels= new ArrayList<>();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.park_inn_by_radisson_amritsar1,""));
        slideModels.add(new SlideModel(R.drawable.park_inn_by_radisson_amritsar2,""));
        slideModels.add(new SlideModel(R.drawable.park_inn_by_radisson_amritsar3,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng lovlu = new LatLng(31.39047, 74.51457);
        map.addMarker(new MarkerOptions().position(lovlu).title("Park Inn Radisson Amritsar"));
        map.moveCamera(CameraUpdateFactory.newLatLng(lovlu));

    }
}