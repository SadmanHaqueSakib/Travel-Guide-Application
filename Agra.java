package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.travelmania.adapters.horizontalAgraFoodsAdapter;
import com.example.travelmania.adapters.horizontalAgraHotelsAdapter;
import com.example.travelmania.adapters.horizontalAgraPlacesAdapter;
import com.example.travelmania.adapters.horizontalFoodsAdapter;
import com.example.travelmania.adapters.horizontalHotelsAdapter;
import com.example.travelmania.adapters.horizontalPlacesAdapter;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;
import java.util.List;

public class Agra extends AppCompatActivity {
    RecyclerView placesRecyclerView;
    RecyclerView foodsRecyclerView;
    RecyclerView hotelsRecyclerView;

    RecyclerView.Adapter adapter;
    RecyclerView.Adapter adapter2;
    RecyclerView.Adapter adapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agra);

        ImageSlider imageSlider= findViewById(R.id.agraslider);
        List<SlideModel> slideModels= new ArrayList<>();

        placesRecyclerView=findViewById(R.id.recyclerplace);
        placesRecycler();

        hotelsRecyclerView=findViewById(R.id.recyclerhotels);
        hotelsRecycler();

        foodsRecyclerView=findViewById(R.id.recyclerfood);
        foodsRecycler();



        slideModels.add(new SlideModel(R.drawable.taj_mahal2,"Taj Mahal"));
        slideModels.add(new SlideModel(R.drawable.agra_fort,"Agra Fort"));
        slideModels.add(new SlideModel(R.drawable.akbars_tomb,"Akbar's Tomb"));
        slideModels.add(new SlideModel(R.drawable.moti_masjid,"Moti Masjid"));
        slideModels.add(new SlideModel(R.drawable.anguri_bagh,"Anguri Bagh"));
        imageSlider.setImageList(slideModels,true);


    }

    private void hotelsRecycler() {

        hotelsRecyclerView.setHasFixedSize(true);
        hotelsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalhotelhelpers = new ArrayList<>();
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.radisson_hotel_agra, "Radisson Hotel Agra"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.ramada_plaza_agra, "Ramada Plaza By Wyndham Agra"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.taj_hotel_agra, "Taj Hotel & Convention Centre Agra"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.holiday_inn_agra, "Holiday Inn Agra MG Road"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.hotel_alleviate, "Hotel Alleviate"));


        adapter3 = new horizontalAgraHotelsAdapter(horizontalhotelhelpers);
        hotelsRecyclerView.setAdapter(adapter3);
    }

    private void foodsRecycler() {


        foodsRecyclerView.setHasFixedSize(true);
        foodsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalfoodhelpers = new ArrayList<>();
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.bedai_and_jalebi, "Bedai And Jalebi"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.paratha_agra, "Paratha"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.bhalla, "Bhalla"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.mughlai_delicacies, "Mughlai Delicacies"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.dalmoth, "Dalmoth"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.petha, "Petha"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.shawarma, "Shawarma"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.bedai_kachori_sabzi, "Bedai Kachori & Sabzi"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.tandoori_desi_chicken, "Tandoori Desi Chicken"));

        adapter2 = new horizontalAgraFoodsAdapter(horizontalfoodhelpers);
        foodsRecyclerView.setAdapter(adapter2);
    }

    private void placesRecycler(){


        placesRecyclerView.setHasFixedSize(true);
        placesRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalhelpers = new ArrayList<>();
        horizontalhelpers.add(new horizontalhelper(R.drawable.taj_mahal, "Taj Mahal"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.agra_fort, "Agra Fort"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.fatehpur_sikri, "Fatehpur Sikri"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.itmad_ud_daulahs_tomb, "Itmad Ud Daulah's Tomb"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.akbars_tomb, "Akbar's Tomb"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.moti_masjid, "Moti Masjid"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.anguri_bagh, "Anguri Bagh"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.gurudwara_guru_ka_taal, "Gurudwara Guru Ka Taal"));


        adapter = new horizontalAgraPlacesAdapter(horizontalhelpers);
        placesRecyclerView.setAdapter(adapter);
    }


    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), Places.class));
        super.onBackPressed();
    }
}