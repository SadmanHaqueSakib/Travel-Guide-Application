package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.travelmania.adapters.horizontalFoodsAdapter;
import com.example.travelmania.adapters.horizontalHotelsAdapter;
import com.example.travelmania.adapters.horizontalJaipurFoodsAdapter;
import com.example.travelmania.adapters.horizontalJaipurHotelsAdapter;
import com.example.travelmania.adapters.horizontalJaipurPlacesAdapter;
import com.example.travelmania.adapters.horizontalPlacesAdapter;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;
import java.util.List;

public class Jaipur extends AppCompatActivity {

    RecyclerView placesRecyclerView;
    RecyclerView foodsRecyclerView;
    RecyclerView hotelsRecyclerView;

    RecyclerView.Adapter adapter;
    RecyclerView.Adapter adapter2;
    RecyclerView.Adapter adapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jaipur);

        ImageSlider imageSlider= findViewById(R.id.jaipurslider);
        List<SlideModel> slideModels= new ArrayList<>();

        placesRecyclerView=findViewById(R.id.recyclerplace);
        placesRecycler();

        hotelsRecyclerView=findViewById(R.id.recyclerhotels);
        hotelsRecycler();

        foodsRecyclerView=findViewById(R.id.recyclerfood);
        foodsRecycler();



        slideModels.add(new SlideModel(R.drawable.albert_hall_museum,"Albert Hall Museum"));
        slideModels.add(new SlideModel(R.drawable.amber_fort,"Amber Fort"));
        slideModels.add(new SlideModel(R.drawable.birla_mandir,"Birla Mandir"));
        slideModels.add(new SlideModel(R.drawable.city_palace,"City Palace"));
        slideModels.add(new SlideModel(R.drawable.jantar_mantar,"Jantar Mantar"));
        imageSlider.setImageList(slideModels,true);


    }

    private void hotelsRecycler() {

        hotelsRecyclerView.setHasFixedSize(true);
        hotelsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalhotelhelpers = new ArrayList<>();
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.hilton_jaipur, "Hilton Jaipur"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.holiday_inn_jaipur_city_centre, "Holiday Inn Jaipur City Centre Hotel"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.jaipur_marriott_hotel, "Jaipur Marriott Hotel"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.radisson_blu_jaipur, "Radisson Blu Jaipur"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.trident_jaipur, "Trident Jaipur"));


        adapter3 = new horizontalJaipurHotelsAdapter(horizontalhotelhelpers);
        hotelsRecyclerView.setAdapter(adapter3);
    }

    private void foodsRecycler() {


        foodsRecyclerView.setHasFixedSize(true);
        foodsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalfoodhelpers = new ArrayList<>();
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.gol_gappa, "Gol Gappa"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.kathi_roll, "Kathi Roll"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.mutton_tikka, "Mutton Tikka"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.omelet, "Omlete"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.soda_lime_water, "Soda Lime Water"));

        adapter2 = new horizontalJaipurFoodsAdapter(horizontalfoodhelpers);
        foodsRecyclerView.setAdapter(adapter2);
    }

    private void placesRecycler(){


        placesRecyclerView.setHasFixedSize(true);
        placesRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalhelpers = new ArrayList<>();
        horizontalhelpers.add(new horizontalhelper(R.drawable.albert_hall_museum, "Albert Hall Museum"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.amber_fort, "Amber Fort"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.birla_mandir, "Birla Mandir"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.city_palace, "City Palace"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.hawa_mahal, "Hawa Mahal"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.jantar_mantar, "Jantar Mantar"));

        adapter = new horizontalJaipurPlacesAdapter(horizontalhelpers);
        placesRecyclerView.setAdapter(adapter);
    }


    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), Places.class));
        super.onBackPressed();
    }
}