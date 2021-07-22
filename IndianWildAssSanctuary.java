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

public class IndianWildAssSanctuary extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian_wild_ass_sanctuary);


        ImageSlider imageSlider= findViewById(R.id.indianwildasssanctuaryslider);
        List<SlideModel> slideModels= new ArrayList<>();

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        slideModels.add(new SlideModel(R.drawable.indian_wild_ass_sanctuary2,""));
        slideModels.add(new SlideModel(R.drawable.indian_wild_ass_sanctuary1,""));
        slideModels.add(new SlideModel(R.drawable.indian_wild_ass_sanctuary3,""));
        imageSlider.setImageList(slideModels,true);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng Sadman = new LatLng(23.152991320445036, 71.3957842974017);
        map.addMarker(new MarkerOptions().position(Sadman).title("Indian Wild Ass Sanctuary"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Sadman));

    }
}