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
import com.example.travelmania.adapters.horizontalRannofKutchFoodsAdapter;
import com.example.travelmania.adapters.horizontalRannofKutchHotelsAdapter;
import com.example.travelmania.adapters.horizontalRannofKutchPlacesAdapter;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;
import java.util.List;

public class Rann_of_Kutch extends AppCompatActivity {

    RecyclerView placesRecyclerView;
    RecyclerView foodsRecyclerView;
    RecyclerView hotelsRecyclerView;

    RecyclerView.Adapter adapter;
    RecyclerView.Adapter adapter2;
    RecyclerView.Adapter adapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rann_of__kutch);

        ImageSlider imageSlider= findViewById(R.id.rannofkutchslider);
        List<SlideModel> slideModels= new ArrayList<>();

        placesRecyclerView=findViewById(R.id.recyclerplace);
        placesRecycler();

        hotelsRecyclerView=findViewById(R.id.recyclerhotels);
        hotelsRecycler();

        foodsRecyclerView=findViewById(R.id.recyclerfood);
        foodsRecycler();



        slideModels.add(new SlideModel(R.drawable.great_rann_of_kutch,"Great Rann Of Kutch"));
        slideModels.add(new SlideModel(R.drawable.kalo_dunga,"Kalo Dungar"));
        slideModels.add(new SlideModel(R.drawable.siyot_caves,"Siyot Caves"));
        slideModels.add(new SlideModel(R.drawable.lakhpat,"Lakhpat"));
        slideModels.add(new SlideModel(R.drawable.dholavira,"Dholavira"));
        slideModels.add(new SlideModel(R.drawable.koteshwar_mahadev_temple,"Koteshwar Mahadev Temple"));
        slideModels.add(new SlideModel(R.drawable.indian_wild_ass_sanctuary,"Indian Wild Ass Sanctuary"));
        imageSlider.setImageList(slideModels,true);


    }

    private void hotelsRecycler() {

        hotelsRecyclerView.setHasFixedSize(true);
        hotelsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalhotelhelpers = new ArrayList<>();
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.welcomhotel_by_itc_hotels1, "Welcom hotel Kutch"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.jaipur_marriott_hotel, "Kutch Marriott Hotel"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.the_fortune_resort, "The Kutch Resort"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.hotel_galaxy_ladakh, "Hotel Kutch"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.prazeres_resort, "Prazeres Resort"));


        adapter3 = new horizontalRannofKutchHotelsAdapter(horizontalhotelhelpers);
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

        adapter2 = new horizontalRannofKutchFoodsAdapter(horizontalfoodhelpers);
        foodsRecyclerView.setAdapter(adapter2);
    }

    private void placesRecycler(){


        placesRecyclerView.setHasFixedSize(true);
        placesRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalhelpers = new ArrayList<>();
        horizontalhelpers.add(new horizontalhelper(R.drawable.great_rann_of_kutch, "Great Rann Of Kutch"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.kutch_desert_festival, "Kutch Desert Festival"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.kalo_dunga, "Kalo Dungar"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.siyot_caves, "Siyot Caves"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.koteshwar_mahadev_temple, "Koteshwar Mahadev Temple"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.lakhpat, "Lakhpat"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.mata_no_madh_desh_devi_maa_ashapura, "Mata No Madh Desh Devi Maa Ashapura"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.banni_grassland_reserve, "Banni Grassland Reserve"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.kutch_desert_wildlife_sanctuary, "Kutch Desert Wildlife Sanctuary"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.dholavira, "Dholavira"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.indian_wild_ass_sanctuary, "Indian Wild Ass Sanctuary"));

        adapter = new horizontalRannofKutchPlacesAdapter(horizontalhelpers);
        placesRecyclerView.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), Places.class));
        super.onBackPressed();
    }
}