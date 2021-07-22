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

public class TsgTheBlueHavelockIsland extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tsg_the_blue_havelock_island);


        ImageSlider imageSlider= findViewById(R.id.tsgthebluehavelockislandslider);
        List<SlideModel> slideModels= new ArrayList<>();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.tsg_the_blue_have_lock_island_hotel2,""));
        slideModels.add(new SlideModel(R.drawable.tsg_the_blue_have_lock_island_hotel3,""));
        slideModels.add(new SlideModel(R.drawable.tsg_the_blue_have_lock_island_hotel4,""));
        slideModels.add(new SlideModel(R.drawable.tsg_the_blue_have_lock_island_hotel5,""));
        slideModels.add(new SlideModel(R.drawable.tsg_the_blue_have_lock_island_hotel6,""));
        slideModels.add(new SlideModel(R.drawable.tsg_the_blue_have_lock_island_hotel7,""));
        slideModels.add(new SlideModel(R.drawable.tsg_the_blue_have_lock_island_hotel8,""));
        slideModels.add(new SlideModel(R.drawable.tsg_the_blue_have_lock_island_hotel9,""));
        slideModels.add(new SlideModel(R.drawable.tsg_the_blue_have_lock_island_hotel10,""));
        slideModels.add(new SlideModel(R.drawable.tsg_the_blue_have_lock_island_hotel11,""));
        slideModels.add(new SlideModel(R.drawable.tsg_the_blue_have_lock_island_hotel12,""));
        slideModels.add(new SlideModel(R.drawable.tsg_the_blue_have_lock_island_hotel13,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng lovlu = new LatLng(11.59262, 92.57187);
        map.addMarker(new MarkerOptions().position(lovlu).title("Tsg The Blue Havelock Island"));
        map.moveCamera(CameraUpdateFactory.newLatLng(lovlu));

    }
}