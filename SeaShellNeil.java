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

public class SeaShellNeil extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sea_shell_neil);

        ImageSlider imageSlider= findViewById(R.id.seashellneilslider);
        List<SlideModel> slideModels= new ArrayList<>();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.sea_shell_neil2,""));
        slideModels.add(new SlideModel(R.drawable.sea_shell_neil3,""));
        slideModels.add(new SlideModel(R.drawable.sea_shell_neil4,""));
        slideModels.add(new SlideModel(R.drawable.sea_shell_neil5,""));
        slideModels.add(new SlideModel(R.drawable.sea_shell_neil6,""));
        slideModels.add(new SlideModel(R.drawable.sea_shell_neil7,""));
        slideModels.add(new SlideModel(R.drawable.sea_shell_neil8,""));
        slideModels.add(new SlideModel(R.drawable.sea_shell_neil9,""));
        slideModels.add(new SlideModel(R.drawable.sea_shell_neil10,""));
        slideModels.add(new SlideModel(R.drawable.sea_shell_neil11,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng lovlu = new LatLng(11.50307, 93.01280);
        map.addMarker(new MarkerOptions().position(lovlu).title("Sea Shell Neil"));
        map.moveCamera(CameraUpdateFactory.newLatLng(lovlu));

    }
}