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
import com.example.travelmania.adapters.horizontalSikkimFoodsAdapter;
import com.example.travelmania.adapters.horizontalSikkimHotelsAdapter;
import com.example.travelmania.adapters.horizontalSikkimPlacesAdapter;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;
import java.util.List;

public class Sikkim extends AppCompatActivity {
    RecyclerView placesRecyclerView;
    RecyclerView foodsRecyclerView;
    RecyclerView hotelsRecyclerView;

    RecyclerView.Adapter adapter;
    RecyclerView.Adapter adapter2;
    RecyclerView.Adapter adapter3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sikkim);

        ImageSlider imageSlider= findViewById(R.id.sikkimslider);
        List<SlideModel> slideModels= new ArrayList<>();

        placesRecyclerView=findViewById(R.id.recyclerplace);
        placesRecycler();

        hotelsRecyclerView=findViewById(R.id.recyclerhotels);
        hotelsRecycler();

        foodsRecyclerView=findViewById(R.id.recyclerfood);
        foodsRecycler();



        slideModels.add(new SlideModel(R.drawable.gangtok,"Gangtok"));
        slideModels.add(new SlideModel(R.drawable.yuksom,"Yuksom"));
        slideModels.add(new SlideModel(R.drawable.tsomgo_lake,"Tsomgo Lake"));
        slideModels.add(new SlideModel(R.drawable.nathula_pass,"Nathula Pass"));
        slideModels.add(new SlideModel(R.drawable.lachung_sikkim,"Lachung"));
        slideModels.add(new SlideModel(R.drawable.jawaharlal_nehru_botanical_garden,"IJawaharlal Nehru Botanical Garden"));
        slideModels.add(new SlideModel(R.drawable.yumthang_valley,"Yumthang Valley"));
        imageSlider.setImageList(slideModels,true);


    }

    private void hotelsRecycler() {

        hotelsRecyclerView.setHasFixedSize(true);
        hotelsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalhotelhelpers = new ArrayList<>();
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.welcomhotel_by_itc_hotels1, "Welcom hotel Sikkim"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.jaipur_marriott_hotel, "Sikkim Marriott Hotel"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.the_fortune_resort, "The Sikkim Resort"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.hotel_galaxy_ladakh, "Hotel Sikkim"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.prazeres_resort, "Prazeres Resort"));


        adapter3 = new horizontalSikkimHotelsAdapter(horizontalhotelhelpers);
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

        adapter2 = new horizontalSikkimFoodsAdapter(horizontalfoodhelpers);
        foodsRecyclerView.setAdapter(adapter2);
    }

    private void placesRecycler(){


        placesRecyclerView.setHasFixedSize(true);
        placesRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalhelpers = new ArrayList<>();
        horizontalhelpers.add(new horizontalhelper(R.drawable.gangtok, "Gangtok"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.yuksom, "Yuksom"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.tsomgo_lake, "Tsomgo Lake"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.nathula_pass, "Nathula Pass"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.pelling, "Pelling"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.lachung, "Lachung"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.ravangla, "Ravangla"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.rumtek_monstryseptmbr, "Rumtek Monastery"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.namchi, "Namchi"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.jawaharlal_nehru_botanical_garden, "Jawaharlal Nehru Botanical Garden"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.zuluk, "Zuluk"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.namgyal_inistitute_of_tibetlogy, "Namgyal Institute of Tibetology"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.yumthang_valley, "Yumthang Valley"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.gurudongmar, "Gurudongmar"));

        adapter = new horizontalSikkimPlacesAdapter(horizontalhelpers);
        placesRecyclerView.setAdapter(adapter);
    }


    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), Places.class));
        super.onBackPressed();
    }
}