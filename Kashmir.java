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
import com.example.travelmania.adapters.horizontalKashmirFoodsAdapter;
import com.example.travelmania.adapters.horizontalKashmirHotelsAdapter;
import com.example.travelmania.adapters.horizontalKashmirPlacesAdapter;
import com.example.travelmania.adapters.horizontalPlacesAdapter;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;
import java.util.List;

public class Kashmir extends AppCompatActivity {

    RecyclerView placesRecyclerView;
    RecyclerView foodsRecyclerView;
    RecyclerView hotelsRecyclerView;

    RecyclerView.Adapter adapter;
    RecyclerView.Adapter adapter2;
    RecyclerView.Adapter adapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kashmir);

        ImageSlider imageSlider= findViewById(R.id.kashmirslider);
        List<SlideModel> slideModels= new ArrayList<>();

        placesRecyclerView=findViewById(R.id.recyclerplace);
        placesRecycler();

        hotelsRecyclerView=findViewById(R.id.recyclerhotels);
        hotelsRecycler();

        foodsRecyclerView=findViewById(R.id.recyclerfood);
        foodsRecycler();



        slideModels.add(new SlideModel(R.drawable.srinagar,"Srinagar"));
        slideModels.add(new SlideModel(R.drawable.sonamarg,"Sonamarg"));
        slideModels.add(new SlideModel(R.drawable.jammu_city,"Jammu City"));
        slideModels.add(new SlideModel(R.drawable.kishtwar,"Kishtwar"));
        slideModels.add(new SlideModel(R.drawable.vaishno_devi,"Vaishno Devi"));
        slideModels.add(new SlideModel(R.drawable.patnitop,"Patnitop"));
        slideModels.add(new SlideModel(R.drawable.shalimar_garden,"Shalimar Garden"));
        imageSlider.setImageList(slideModels,true);


    }

    private void hotelsRecycler() {

        hotelsRecyclerView.setHasFixedSize(true);
        hotelsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalhotelhelpers = new ArrayList<>();
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.welcomhotel_by_itc_hotels1, "Welcom hotel Kashmir"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.jaipur_marriott_hotel, "Kashmir Marriott Hotel"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.the_fortune_resort, "The Kashmir Resort"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.hotel_galaxy_ladakh, "Hotel Kashmir"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.prazeres_resort, "Prazeres Resort"));


        adapter3 = new horizontalKashmirHotelsAdapter(horizontalhotelhelpers);
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

        adapter2 = new horizontalKashmirFoodsAdapter(horizontalfoodhelpers);
        foodsRecyclerView.setAdapter(adapter2);
    }

    private void placesRecycler(){


        placesRecyclerView.setHasFixedSize(true);
        placesRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalhelpers = new ArrayList<>();
        horizontalhelpers.add(new horizontalhelper(R.drawable.srinagar, "Srinagar"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.gulmarag, "Gulmarag"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.sonamarg, "Sonamarg"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.kathua, "Kathua"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.pahalgam, "Pahalgam"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.jammu_city, "Jammu City"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.kishtwar, "Kishtwar"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.doda, "Doda"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.poonch, "Poonch"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.nishat_garden, "Nishat Garden"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.yusmarg, "Yusmarg"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.vaishno_devi, "Vaishno Devi"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.patnitop, "Patnitop"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.amarnath, "Amarnath"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.dachigam_national_park, "Dachigam National Park"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.khilanmarg, "Khilanmarg"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.baltal, "Baltal"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.shalimar_garden, "Shalimar Garden"));


        adapter = new horizontalKashmirPlacesAdapter(horizontalhelpers);
        placesRecyclerView.setAdapter(adapter);
    }


    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), Places.class));
        super.onBackPressed();
    }
}