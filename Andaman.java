package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.travelmania.adapters.horizontalAndamanFoodsAdapter;
import com.example.travelmania.adapters.horizontalAndamanHotelsAdapter;
import com.example.travelmania.adapters.horizontalAndamanPlacesAdapter;
import com.example.travelmania.adapters.horizontalFoodsAdapter;
import com.example.travelmania.adapters.horizontalHotelsAdapter;
import com.example.travelmania.adapters.horizontalPlacesAdapter;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;
import java.util.List;

public class Andaman extends AppCompatActivity {


    RecyclerView placesRecyclerView;
    RecyclerView foodsRecyclerView;
    RecyclerView hotelsRecyclerView;

    RecyclerView.Adapter adapter;
    RecyclerView.Adapter adapter2;
    RecyclerView.Adapter adapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andaman);

        ImageSlider imageSlider= findViewById(R.id.andamanslider);
        List<SlideModel> slideModels= new ArrayList<>();

        placesRecyclerView=findViewById(R.id.recyclerplace);
        placesRecycler();

        hotelsRecyclerView=findViewById(R.id.recyclerhotels);
        hotelsRecycler();

        foodsRecyclerView=findViewById(R.id.recyclerfood);
        foodsRecycler();



        slideModels.add(new SlideModel(R.drawable.havelock_island1,"Havelock Island"));
        slideModels.add(new SlideModel(R.drawable.neil_island1,"Neil Island"));
        slideModels.add(new SlideModel(R.drawable.ross_island1,"Ross Island"));
        slideModels.add(new SlideModel(R.drawable.north_bay_island1,"North Bay Island"));
        slideModels.add(new SlideModel(R.drawable.viper_island1,"Viper Island"));
        slideModels.add(new SlideModel(R.drawable.cinque_island,"Cinque Island"));
        slideModels.add(new SlideModel(R.drawable.rangat1,"Rangat"));
        imageSlider.setImageList(slideModels,true);


    }

    private void hotelsRecycler() {

        hotelsRecyclerView.setHasFixedSize(true);
        hotelsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalhotelhelpers = new ArrayList<>();
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.barefoot_at_havelock_havelock_island, "Barefoot Havelock Island"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.sea_shell_neil1, "Sea Shell Neil"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.munjoh_ocean_resort1, "Munjoh Ocean Resort Havelock Island"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.welcomhotel_by_itc_hotels1, "Welcomhotel Itc Hotels"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.tsg_the_blue_have_lock_island_hotel1, "Tsg The Blue-Havelock Island Hotel"));


        adapter3 = new horizontalAndamanHotelsAdapter(horizontalhotelhelpers);
        hotelsRecyclerView.setAdapter(adapter3);
    }

    private void foodsRecycler() {


        foodsRecyclerView.setHasFixedSize(true);
        foodsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalfoodhelpers = new ArrayList<>();
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.amritsari_kulcha1, "Amritsari Kulcha"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.chilli_curry1, "Chilli Curry"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.macher_jhol1, "Macher Jhol"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.chicken_tikka_masala1, "Chicken Tikka Masala"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.coconut_prawn_curry1, "Coconut Prawn Curry"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.barbeque_food1, "Barbeque Food"));

        adapter2 = new horizontalAndamanFoodsAdapter(horizontalfoodhelpers);
        foodsRecyclerView.setAdapter(adapter2);
    }

    private void placesRecycler(){


        placesRecyclerView.setHasFixedSize(true);
        placesRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalhelpers = new ArrayList<>();
        horizontalhelpers.add(new horizontalhelper(R.drawable.havelock_island1, "Havelock Island"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.neil_island1, "Neil Island"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.ross_island1, "Ross Island"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.north_bay_island1, "North Bay Island"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.baratang_island1, "Baratang Island"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.viper_island1, "Viper Island"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.ross_smith_islands2, "Ross and Smith Island"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.cinque_island, "Cinque Island"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.mount_harriet_national_park1, "Mount Harriet National Park"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.rangat1, "Rangat"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.mayabunder1, "Mayabunder"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.dhaninallah1, "Dhaninallah Mangrove Nature Walkway"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.panchavati_waterfalls2, "Panchavati Waterfalls"));


        adapter = new horizontalAndamanPlacesAdapter(horizontalhelpers);
        placesRecyclerView.setAdapter(adapter);
    }


    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), Places.class));
        super.onBackPressed();
    }
}