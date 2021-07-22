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

public class YarabTso extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yarab_tso);

        ImageSlider imageSlider= findViewById(R.id.yarabtsoslider);
        List<SlideModel> slideModels= new ArrayList<>();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.yarab_tso1,""));
        slideModels.add(new SlideModel(R.drawable.yarab_tso2,""));
        slideModels.add(new SlideModel(R.drawable.yarab_tso3,""));
        slideModels.add(new SlideModel(R.drawable.yarab_tso4,""));
        slideModels.add(new SlideModel(R.drawable.yarab_tso5,""));
        slideModels.add(new SlideModel(R.drawable.yarab_tso6,""));
        slideModels.add(new SlideModel(R.drawable.yarab_tso8,""));
        slideModels.add(new SlideModel(R.drawable.yarab_tso9,""));
        slideModels.add(new SlideModel(R.drawable.yarab_tso10,""));
        slideModels.add(new SlideModel(R.drawable.yarab_tso11,""));
        slideModels.add(new SlideModel(R.drawable.yarab_tso7,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng sadman = new LatLng(34.15166116113241, 77.57250635397314);
        map.addMarker(new MarkerOptions().position(sadman).title("Yarab Tso"));
        map.moveCamera(CameraUpdateFactory.newLatLng(sadman));

    }
}