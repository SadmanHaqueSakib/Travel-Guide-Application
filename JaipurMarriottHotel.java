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

public class JaipurMarriottHotel extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jaipur_marriott_hotel);

        ImageSlider imageSlider= findViewById(R.id.jaipurmarriotthotelslider);
        List<SlideModel> slideModels= new ArrayList<>();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.jaipur_marriott_hotel1,""));
        slideModels.add(new SlideModel(R.drawable.jaipur_marriott_hotel2,""));
        slideModels.add(new SlideModel(R.drawable.jaipur_marriott_hotel3,""));
        slideModels.add(new SlideModel(R.drawable.jaipur_marriott_hotel4,""));
        slideModels.add(new SlideModel(R.drawable.jaipur_marriott_hotel5,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng lovlu = new LatLng(26.50301, 75.47491);
        map.addMarker(new MarkerOptions().position(lovlu).title("Jaipur Marriott Hotel"));
        map.moveCamera(CameraUpdateFactory.newLatLng(lovlu));

    }
}