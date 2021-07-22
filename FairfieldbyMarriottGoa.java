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

public class FairfieldbyMarriottGoa extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fairfieldby_marriott_goa);

        ImageSlider imageSlider= findViewById(R.id.fairfieldbymarriottgoaslider);
        List<SlideModel> slideModels= new ArrayList<>();


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        slideModels.add(new SlideModel(R.drawable.fairfield_by_marriott_goa1,""));
        slideModels.add(new SlideModel(R.drawable.fairfield_by_marriott_goa3,""));
        slideModels.add(new SlideModel(R.drawable.fairfield_by_marriott_goa4,""));
        slideModels.add(new SlideModel(R.drawable.fairfield_by_marriott_goa5,""));
        slideModels.add(new SlideModel(R.drawable.fairfield_by_marriott_goa6,""));
        slideModels.add(new SlideModel(R.drawable.fairfield_by_marriott_goa7,""));
        slideModels.add(new SlideModel(R.drawable.fairfield_by_marriott_goa8,""));
        slideModels.add(new SlideModel(R.drawable.fairfield_by_marriott_goa9,""));
        slideModels.add(new SlideModel(R.drawable.fairfield_by_marriott_goa10,""));
        slideModels.add(new SlideModel(R.drawable.fairfield_by_marriott_goa11,""));
        imageSlider.setImageList(slideModels,true);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        LatLng sadman = new LatLng(15.57700843517405, 73.757888);
        map.addMarker(new MarkerOptions().position(sadman).title("Fairfield by Marriott Goa"));
        map.moveCamera(CameraUpdateFactory.newLatLng(sadman));

    }
}