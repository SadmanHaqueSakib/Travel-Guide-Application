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

public class HotelGalaxyLadakh extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_galaxy_ladakh);

        ImageSlider imageSlider= findViewById(R.id.hotelgalaxyladakhslider);
        List<SlideModel> slideModels= new ArrayList<>();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.hotel_galaxy_ladakh1,""));
        slideModels.add(new SlideModel(R.drawable.hotel_galaxy_ladakh2,""));
        slideModels.add(new SlideModel(R.drawable.hotel_galaxy_ladakh3,""));
        slideModels.add(new SlideModel(R.drawable.hotel_galaxy_ladakh4,""));
        slideModels.add(new SlideModel(R.drawable.hotel_galaxy_ladakh5,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng sadman = new LatLng(34.16974610941368, 77.58227381164502);
        map.addMarker(new MarkerOptions().position(sadman).title("Zostel Leh Hotel"));
        map.moveCamera(CameraUpdateFactory.newLatLng(sadman));

    }
}