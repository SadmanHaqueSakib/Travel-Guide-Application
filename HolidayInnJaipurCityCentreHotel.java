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

public class HolidayInnJaipurCityCentreHotel extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holiday_inn_jaipur_city_centre_hotel);

        ImageSlider imageSlider= findViewById(R.id.holidayinnjaipurcitycentrehotelslider);
        List<SlideModel> slideModels= new ArrayList<>();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.holiday_inn_jaipur_city_centre1,""));
        slideModels.add(new SlideModel(R.drawable.holiday_inn_jaipur_city_centre2,""));
        slideModels.add(new SlideModel(R.drawable.holiday_inn_jaipur_city_centre3,""));
        slideModels.add(new SlideModel(R.drawable.holiday_inn_jaipur_city_centre4,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng lovlu = new LatLng(26.54119, 75.47355);
        map.addMarker(new MarkerOptions().position(lovlu).title("Holiday Inn Jaipur City Centre"));
        map.moveCamera(CameraUpdateFactory.newLatLng(lovlu));

    }
}