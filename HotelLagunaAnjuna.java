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

public class HotelLagunaAnjuna extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_laguna_anjuna);

        ImageSlider imageSlider= findViewById(R.id.hotellagunaanjunaslider);
        List<SlideModel> slideModels= new ArrayList<>();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.hotel_laguna_anjuna1,""));
        slideModels.add(new SlideModel(R.drawable.hotel_laguna_anjuna2,""));
        slideModels.add(new SlideModel(R.drawable.hotel_laguna_anjuna3,""));
        slideModels.add(new SlideModel(R.drawable.hotel_laguna_anjuna4,""));
        slideModels.add(new SlideModel(R.drawable.hotel_laguna_anjuna5,""));
        slideModels.add(new SlideModel(R.drawable.hotel_laguna_anjuna6,""));
        slideModels.add(new SlideModel(R.drawable.hotel_laguna_anjuna7,""));
        slideModels.add(new SlideModel(R.drawable.hotel_laguna_anjuna8,""));
        slideModels.add(new SlideModel(R.drawable.hotel_laguna_anjuna9,""));
        slideModels.add(new SlideModel(R.drawable.hotel_laguna_anjuna10,""));
        slideModels.add(new SlideModel(R.drawable.hotel_laguna_anjuna11,""));
        slideModels.add(new SlideModel(R.drawable.hotel_laguna_anjuna12,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng sadman = new LatLng(15.583282630323685, 73.74412201214282);
        map.addMarker(new MarkerOptions().position(sadman).title("Hotel Laguna Anjuna"));
        map.moveCamera(CameraUpdateFactory.newLatLng(sadman));

    }
}