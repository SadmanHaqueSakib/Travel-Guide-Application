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
import com.example.travelmania.adapters.horizontalPlacesAdapter;
import com.example.travelmania.adapters.horizontalRishikeshFoodsAdapter;
import com.example.travelmania.adapters.horizontalRishikeshHotelsAdapter;
import com.example.travelmania.adapters.horizontalRishikeshPlacesAdapter;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;
import java.util.List;

public class Rishikesh extends AppCompatActivity {

    RecyclerView placesRecyclerView;
    RecyclerView foodsRecyclerView;
    RecyclerView hotelsRecyclerView;

    RecyclerView.Adapter adapter;
    RecyclerView.Adapter adapter2;
    RecyclerView.Adapter adapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rishikesh);

        ImageSlider imageSlider= findViewById(R.id.rishikeshslider);
        List<SlideModel> slideModels= new ArrayList<>();

        placesRecyclerView=findViewById(R.id.recyclerplace);
        placesRecycler();

        hotelsRecyclerView=findViewById(R.id.recyclerhotels);
        hotelsRecycler();

        foodsRecyclerView=findViewById(R.id.recyclerfood);
        foodsRecycler();



        slideModels.add(new SlideModel(R.drawable.laxman_jhula,"Laxman Jhula"));
        slideModels.add(new SlideModel(R.drawable.ram_jhula,"Ram Jhula"));
        slideModels.add(new SlideModel(R.drawable.shri_bharat_mandir,"Shri Bharat Mandir"));
        slideModels.add(new SlideModel(R.drawable.shivpuri,"Shivpuri"));
        slideModels.add(new SlideModel(R.drawable.the_beatles_ashram,"The Beatles Ashram"));
        slideModels.add(new SlideModel(R.drawable.jumpin_heights,"Jumpin Heights"));
        slideModels.add(new SlideModel(R.drawable.vashistha_cave,"Vashistha Cave"));
        imageSlider.setImageList(slideModels,true);


    }

    private void hotelsRecycler() {

        hotelsRecyclerView.setHasFixedSize(true);
        hotelsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalhotelhelpers = new ArrayList<>();
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.welcomhotel_by_itc_hotels1, "Welcom hotel Rishikesh"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.jaipur_marriott_hotel, "Rishikesh Marriott Hotel"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.the_fortune_resort, "The Rishikesh Resort"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.hotel_galaxy_ladakh, "Hotel Rishikesh"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.prazeres_resort, "Prazeres Resort"));


        adapter3 = new horizontalRishikeshHotelsAdapter(horizontalhotelhelpers);
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

        adapter2 = new horizontalRishikeshFoodsAdapter(horizontalfoodhelpers);
        foodsRecyclerView.setAdapter(adapter2);
    }

    private void placesRecycler(){


        placesRecyclerView.setHasFixedSize(true);
        placesRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalhelpers = new ArrayList<>();
        horizontalhelpers.add(new horizontalhelper(R.drawable.laxman_jhula, "Laxman Jhula"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.ram_jhula, "Ram Jhula"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.shri_bharat_mandir, "Shri Bharat Mandir"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.triveni_ghat, "Triveni Ghat"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.the_beatles_ashram, "The Beatles Ashram"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.shivpuri, "Shivpuri"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.neelkanth_mahadev_temple, "Neelkanth Mahadev Temple"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.jumpin_heights, "Jumpin Heights"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.vashistha_cave, "Vashistha Cave"));

        adapter = new horizontalRishikeshPlacesAdapter(horizontalhelpers);
        placesRecyclerView.setAdapter(adapter);
    }


    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), Places.class));
        super.onBackPressed();
    }
}