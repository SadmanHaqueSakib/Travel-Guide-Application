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

public class HyattRegency extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hyatt_regency);

        ImageSlider imageSlider= findViewById(R.id.hyattregencyslider);
        List<SlideModel> slideModels= new ArrayList<>();

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.hyatt_regency1,""));
        slideModels.add(new SlideModel(R.drawable.hyatt_regency2,""));
        slideModels.add(new SlideModel(R.drawable.hyatt_regency3,""));
        slideModels.add(new SlideModel(R.drawable.hyatt_regency4,""));
        slideModels.add(new SlideModel(R.drawable.hyatt_regency5,""));
        slideModels.add(new SlideModel(R.drawable.hyatt_regency6,""));
        slideModels.add(new SlideModel(R.drawable.hyatt_regency7,""));
        slideModels.add(new SlideModel(R.drawable.hyatt_regency8,""));
        slideModels.add(new SlideModel(R.drawable.hyatt_regency9,""));
        slideModels.add(new SlideModel(R.drawable.hyatt_regency10,""));
        slideModels.add(new SlideModel(R.drawable.hyatt_regency11,""));
        slideModels.add(new SlideModel(R.drawable.hyatt_regency12,""));
        slideModels.add(new SlideModel(R.drawable.hyatt_regency13,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng Akshardham = new LatLng(28.5691, 77.1857);
        map.addMarker(new MarkerOptions().position(Akshardham).title("Hyatt Regency Hotel"));
        map.moveCamera(CameraUpdateFactory.newLatLng(Akshardham));

    }
}