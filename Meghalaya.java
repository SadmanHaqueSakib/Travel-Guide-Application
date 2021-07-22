package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.travelmania.adapters.horizontalLadakhFoodsAdapter;
import com.example.travelmania.adapters.horizontalLadakhHotelsAdapter;
import com.example.travelmania.adapters.horizontalLadakhPlacesAdapter;
import com.example.travelmania.adapters.horizontalMeghalayaFoodsAdapter;
import com.example.travelmania.adapters.horizontalMeghalayaHotelsAdapter;
import com.example.travelmania.adapters.horizontalMeghalayaPlacesAdapter;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;
import java.util.List;

public class Meghalaya extends AppCompatActivity {
    RecyclerView placesRecyclerView;
    RecyclerView foodsRecyclerView;
    RecyclerView hotelsRecyclerView;

    RecyclerView.Adapter adapter;
    RecyclerView.Adapter adapter2;
    RecyclerView.Adapter adapter3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meghalaya);

        ImageSlider imageSlider= findViewById(R.id.meghalayaslider);
        List<SlideModel> slideModels= new ArrayList<>();

        placesRecyclerView=findViewById(R.id.recyclerplace);
        placesRecycler();

        hotelsRecyclerView=findViewById(R.id.recyclerhotels);
        hotelsRecycler();

        foodsRecyclerView=findViewById(R.id.recyclerfood);
        foodsRecycler();



        slideModels.add(new SlideModel(R.drawable.cherrapunji,"Cherrapunji"));
        slideModels.add(new SlideModel(R.drawable.balpakram_national_park,"Balpakram National Park"));
        slideModels.add(new SlideModel(R.drawable.shillong,"Shillong"));
        slideModels.add(new SlideModel(R.drawable.elephant_falls,"Elephant Falls"));
        slideModels.add(new SlideModel(R.drawable.the_living_root_bridgesjpg3,"The Living Root Bridge"));
        slideModels.add(new SlideModel(R.drawable.tura,"Tura"));
        slideModels.add(new SlideModel(R.drawable.umiam_lake3,"Umiam Lake"));
        imageSlider.setImageList(slideModels,true);


    }

    private void hotelsRecycler() {

        hotelsRecyclerView.setHasFixedSize(true);
        hotelsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalhotelhelpers = new ArrayList<>();
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.welcomhotel_by_itc_hotels1, "Welcom hotel Meghalaya"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.jaipur_marriott_hotel, "Meghalaya Marriott Hotel"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.the_fortune_resort, "The Meghalaya Resort"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.hotel_galaxy_ladakh, "Hotel Meghalaya"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.prazeres_resort, "Prazeres Resort"));


        adapter3 = new horizontalMeghalayaHotelsAdapter(horizontalhotelhelpers);
        hotelsRecyclerView.setAdapter(adapter3);
    }

    private void foodsRecycler() {


        foodsRecyclerView.setHasFixedSize(true);
        foodsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalfoodhelpers = new ArrayList<>();
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.mutton_tikka, "Mutton Tikka"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.momos, "Momos"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.omelet, "Omelte"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.pakodas1, "Pakodas"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.kebabs2, "Kabab"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.chicken_tikka_masala1, "Chicken Tikka Masala"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.parantha1, "Parantha"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.barbeque_food1, "Barbeque Food"));

        adapter2 = new horizontalMeghalayaFoodsAdapter(horizontalfoodhelpers);
        foodsRecyclerView.setAdapter(adapter2);
    }

    private void placesRecycler(){


        placesRecyclerView.setHasFixedSize(true);
        placesRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalhelpers = new ArrayList<>();
        horizontalhelpers.add(new horizontalhelper(R.drawable.cherrapunji, "Cherrapunji"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.balpakram_national_park, "Balpakram National Park"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.shillong, "Shillong"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.elephant_falls, "Elephant Falls"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.the_living_root_bridgesjpg, "The Living Root Bridge"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.mawlynnong_village, "Mawlynnong Village"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.nohkalikai_falls, "Nohkalikai Falls"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.tura, "Tura"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.kyllang_rock, "Kyllang Rock"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.umiam_lake, "Umiam Lake"));

        adapter = new horizontalMeghalayaPlacesAdapter(horizontalhelpers);
        placesRecyclerView.setAdapter(adapter);
    }


    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), Places.class));
        super.onBackPressed();
    }
}