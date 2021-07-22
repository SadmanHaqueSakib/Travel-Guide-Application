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

public class WelcomhotelItcHotels extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomhotel_itc_hotels);

        ImageSlider imageSlider= findViewById(R.id.welcomhotelitchotelsslider);
        List<SlideModel> slideModels= new ArrayList<>();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.welcomhotel_by_itc_hotels2,""));
        slideModels.add(new SlideModel(R.drawable.welcomhotel_by_itc_hotels3,""));
        slideModels.add(new SlideModel(R.drawable.welcomhotel_by_itc_hotels4,""));
        slideModels.add(new SlideModel(R.drawable.welcomhotel_by_itc_hotels5,""));
        slideModels.add(new SlideModel(R.drawable.welcomhotel_by_itc_hotels6,""));
        slideModels.add(new SlideModel(R.drawable.welcomhotel_by_itc_hotels7,""));
        slideModels.add(new SlideModel(R.drawable.welcomhotel_by_itc_hotels8,""));
        slideModels.add(new SlideModel(R.drawable.welcomhotel_by_itc_hotels9,""));
        slideModels.add(new SlideModel(R.drawable.welcomhotel_by_itc_hotels10,""));
        slideModels.add(new SlideModel(R.drawable.welcomhotel_by_itc_hotels11,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng lovlu = new LatLng(11.40386, 92.44249);
        map.addMarker(new MarkerOptions().position(lovlu).title("Welcomhotel Itc Hotels"));
        map.moveCamera(CameraUpdateFactory.newLatLng(lovlu));

    }
}