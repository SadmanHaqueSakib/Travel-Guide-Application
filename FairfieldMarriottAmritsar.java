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

public class FairfieldMarriottAmritsar extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fairfield_marriott_amritsar);
        ImageSlider imageSlider= findViewById(R.id.fairfieldmarriottamritsarslider);
        List<SlideModel> slideModels= new ArrayList<>();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.fairfield_by_marriott_amritsar1,""));
        slideModels.add(new SlideModel(R.drawable.fairfield_by_marriott_amritsar2,""));
        slideModels.add(new SlideModel(R.drawable.fairfield_by_marriott_amritsar3,""));
        slideModels.add(new SlideModel(R.drawable.fairfield_by_marriott_amritsar4,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng lovlu = new LatLng(31.38102, 74.52031);
        map.addMarker(new MarkerOptions().position(lovlu).title("Fairfield Marriott Amritsar"));
        map.moveCamera(CameraUpdateFactory.newLatLng(lovlu));

    }
}