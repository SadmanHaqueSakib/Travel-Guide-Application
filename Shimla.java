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
import com.example.travelmania.adapters.horizontalShimlaFoodsAdapter;
import com.example.travelmania.adapters.horizontalShimlaHotelsAdapter;
import com.example.travelmania.adapters.horizontalShimlaPlacesAdapter;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;
import java.util.List;

public class Shimla extends AppCompatActivity {
    RecyclerView placesRecyclerView;
    RecyclerView foodsRecyclerView;
    RecyclerView hotelsRecyclerView;

    RecyclerView.Adapter adapter;
    RecyclerView.Adapter adapter2;
    RecyclerView.Adapter adapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shimla);

        ImageSlider imageSlider= findViewById(R.id.shimlaslider);
        List<SlideModel> slideModels= new ArrayList<>();

        placesRecyclerView=findViewById(R.id.recyclerplace);
        placesRecycler();

        hotelsRecyclerView=findViewById(R.id.recyclerhotels);
        hotelsRecycler();

        foodsRecyclerView=findViewById(R.id.recyclerfood);
        foodsRecycler();



        slideModels.add(new SlideModel(R.drawable.the_ridge_shimla,"The Ridge"));
        slideModels.add(new SlideModel(R.drawable.kufri,"Kufri"));
        slideModels.add(new SlideModel(R.drawable.christ_church,"Christ Church"));
        slideModels.add(new SlideModel(R.drawable.chadwick_falls,"Chadwick Falls"));
        slideModels.add(new SlideModel(R.drawable.annandale_shimla,"Annandale"));
        slideModels.add(new SlideModel(R.drawable.indian_institute_of_advanced_studies,"Indian Inistitute of Advanced Studies"));
        slideModels.add(new SlideModel(R.drawable.tara_devi_temple_shimla,"Tara Devi Temple"));
        imageSlider.setImageList(slideModels,true);


    }

    private void hotelsRecycler() {

        hotelsRecyclerView.setHasFixedSize(true);
        hotelsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalhotelhelpers = new ArrayList<>();
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.welcomhotel_by_itc_hotels1, "Welcom hotel Shimla"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.jaipur_marriott_hotel, "Shimla Marriott Hotel"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.the_fortune_resort, "The Shimla Resort"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.hotel_galaxy_ladakh, "Hotel Shimla"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.prazeres_resort, "Prazeres Resort"));

        adapter3 = new horizontalShimlaHotelsAdapter(horizontalhotelhelpers);
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

        adapter2 = new horizontalShimlaFoodsAdapter(horizontalfoodhelpers);
        foodsRecyclerView.setAdapter(adapter2);
    }

    private void placesRecycler(){


        placesRecyclerView.setHasFixedSize(true);
        placesRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalhelpers = new ArrayList<>();
        horizontalhelpers.add(new horizontalhelper(R.drawable.the_ridge_shimla, "The Ridge"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.kufri, "Kufri"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.jakhoo_temple, " Jakhoo Temple"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.christ_church, "Christ Church"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.chadwick_falls, "Chadwick Falls"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.summer_hill, "Summer Hill"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.annandale_shimla, "Annandale"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.indian_institute_of_advanced_studies, "Indian Inistitute of Advanced Studies"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.tara_devi_temple_shimla, "Tara Devi Temple"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.shimla_state_museum, "Shimla State Museum"));

        adapter = new horizontalShimlaPlacesAdapter(horizontalhelpers);
        placesRecyclerView.setAdapter(adapter);
    }


    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), Places.class));
        super.onBackPressed();
    }
}