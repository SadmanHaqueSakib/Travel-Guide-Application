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

public class TheGrandDragonLadakh extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_grand_dragon_ladakh);

        ImageSlider imageSlider= findViewById(R.id.thegranddragonladakhslider);
        List<SlideModel> slideModels= new ArrayList<>();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.the_grand_dragon_ladakh1,""));
        slideModels.add(new SlideModel(R.drawable.the_grand_dragon_ladakh2,""));
        slideModels.add(new SlideModel(R.drawable.the_grand_dragon_ladakh3,""));
        slideModels.add(new SlideModel(R.drawable.the_grand_dragon_ladakh4,""));
        slideModels.add(new SlideModel(R.drawable.the_grand_dragon_ladakh5,""));
        slideModels.add(new SlideModel(R.drawable.the_grand_dragon_ladakh6,""));
        slideModels.add(new SlideModel(R.drawable.the_grand_dragon_ladakh7,""));
        slideModels.add(new SlideModel(R.drawable.the_grand_dragon_ladakh8,""));
        slideModels.add(new SlideModel(R.drawable.the_grand_dragon_ladakh9,""));
        slideModels.add(new SlideModel(R.drawable.the_grand_dragon_ladakh10,""));
        slideModels.add(new SlideModel(R.drawable.the_grand_dragon_ladakh11,""));
        slideModels.add(new SlideModel(R.drawable.the_grand_dragon_ladakh12,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng sadman = new LatLng(34.15669577501128, 77.58023611958649);
        map.addMarker(new MarkerOptions().position(sadman).title("TheGrandDragonLadakh"));
        map.moveCamera(CameraUpdateFactory.newLatLng(sadman));

    }
}