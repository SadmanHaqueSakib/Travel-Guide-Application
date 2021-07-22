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
import com.example.travelmania.adapters.horizontalLadakhFoodsAdapter;
import com.example.travelmania.adapters.horizontalLadakhHotelsAdapter;
import com.example.travelmania.adapters.horizontalLadakhPlacesAdapter;
import com.example.travelmania.adapters.horizontalPlacesAdapter;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;
import java.util.List;

public class Ladakh extends AppCompatActivity {
    RecyclerView placesRecyclerView;
    RecyclerView foodsRecyclerView;
    RecyclerView hotelsRecyclerView;

    RecyclerView.Adapter adapter;
    RecyclerView.Adapter adapter2;
    RecyclerView.Adapter adapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ladakh);

        ImageSlider imageSlider= findViewById(R.id.ladakhslider);
        List<SlideModel> slideModels= new ArrayList<>();

        placesRecyclerView=findViewById(R.id.recyclerplace);
        placesRecycler();

        hotelsRecyclerView=findViewById(R.id.recyclerhotels);
        hotelsRecycler();

        foodsRecyclerView=findViewById(R.id.recyclerfood);
        foodsRecycler();



        slideModels.add(new SlideModel(R.drawable.zanskar_valley,"Zanskar Valley"));
        slideModels.add(new SlideModel(R.drawable.pangong_tso_lake,"Pangong Tso Lake"));
        slideModels.add(new SlideModel(R.drawable.tso_kar,"Tso Moriri Lake"));
        slideModels.add(new SlideModel(R.drawable.nubra_valley,"Nubra Valley"));
        slideModels.add(new SlideModel(R.drawable.rohtang_pass,"Rohtang Passn"));
        slideModels.add(new SlideModel(R.drawable.lachung,"Lachulung La"));
        slideModels.add(new SlideModel(R.drawable.tanglang_la,"Tanglang La"));
        imageSlider.setImageList(slideModels,true);


    }

    private void hotelsRecycler() {

        hotelsRecyclerView.setHasFixedSize(true);
        hotelsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalhotelhelpers = new ArrayList<>();
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.zostel_leh, "Zostel Leh"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.the_fortune_resort, "The Fortune Resort"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.hotel_galaxy_ladakh, "Hotel Galaxy"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.the_grand_dragon_ladakh, "The Grand Dragon"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.yarab_tso, "Yarab Tso"));


        adapter3 = new horizontalLadakhHotelsAdapter(horizontalhotelhelpers);
        hotelsRecyclerView.setAdapter(adapter3);
    }

    private void foodsRecycler() {


        foodsRecyclerView.setHasFixedSize(true);
        foodsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalfoodhelpers = new ArrayList<>();
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.momos4, "Momos"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.thukpa, "Thukpa"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.skyu, "Skyu"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.chhutagi, "Chhutagi"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.tingmo, "Tingmo"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.chhurpe, "Chhurpe (dried yak cheese)"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.butter_tea, "Butter tea"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.chhang, "Chhang"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.khambir, "Khambir"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.apricot_jam, "Apricot Jam"));

        adapter2 = new horizontalLadakhFoodsAdapter(horizontalfoodhelpers);
        foodsRecyclerView.setAdapter(adapter2);
    }

    private void placesRecycler(){


        placesRecyclerView.setHasFixedSize(true);
        placesRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalhelpers = new ArrayList<>();
        horizontalhelpers.add(new horizontalhelper(R.drawable.zanskar_valley, "Zanskar Valley"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.pangong_tso_lake, "Pangong Tso Lake"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.kargil, "Kargil"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.khardung_la_pass, "Khardung-la Pass"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.nubra_valley, "Nubra Valley"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.royal_leh_palace, "Royal Leh Palace"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.tso_moriri_lake, "Tso Moriri Lake"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.chadar_trek, "Chadar Trek"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.thiksey_gompa, "Thiksey Gompa"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.diskit_monastery, "Diskit Monastery"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.namgyal_tsemo_gompa, "Namgyal Tsemo Gompa"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.tso_kar, "Tso Kar"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.nyoma, "Nyoma"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.rohtang_pass, "Rohtang Passn"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.lachung, "Lachulung La"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.tanglang_la, "Tanglang La"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.zorawer_fort, "Zorawar Fort"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.markha_valley_trek, "Markha Valley Trek"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.sindhu_darshan_festival, "Sindhu Darshan Festival"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.moonland, "Moonland Lamayaru"));
        adapter = new horizontalLadakhPlacesAdapter(horizontalhelpers);
        placesRecyclerView.setAdapter(adapter);
    }


    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), Places.class));
        super.onBackPressed();
    }
}