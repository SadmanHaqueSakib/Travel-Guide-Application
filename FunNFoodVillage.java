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

public class FunNFoodVillage extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_n_food_village);

        ImageSlider imageSlider= findViewById(R.id.funnfoodvillageslider);
        List<SlideModel> slideModels= new ArrayList<>();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        slideModels.add(new SlideModel(R.drawable.fun_n_food_village1,""));
        slideModels.add(new SlideModel(R.drawable.fun_n_food_village2,""));
        slideModels.add(new SlideModel(R.drawable.fun_n_food_village3,""));
        imageSlider.setImageList(slideModels,true);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng Funnfoodvillage = new LatLng(28.523842, 77.084709);
        map.addMarker(new MarkerOptions().position(Funnfoodvillage).title("Food N Fun Village"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Funnfoodvillage));

    }
}