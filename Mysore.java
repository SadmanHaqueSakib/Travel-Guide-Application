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
import com.example.travelmania.adapters.horizontalKashmirPlacesAdapter;
import com.example.travelmania.adapters.horizontalMysoreFoodsAdapter;
import com.example.travelmania.adapters.horizontalMysoreHotelsAdapter;
import com.example.travelmania.adapters.horizontalMysorePlacesAdapter;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;
import java.util.List;

public class Mysore extends AppCompatActivity { RecyclerView placesRecyclerView;
    RecyclerView foodsRecyclerView;
    RecyclerView hotelsRecyclerView;

    RecyclerView.Adapter adapter;
    RecyclerView.Adapter adapter2;
    RecyclerView.Adapter adapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mysore);

        ImageSlider imageSlider= findViewById(R.id.mysoreslider);
        List<SlideModel> slideModels= new ArrayList<>();

        placesRecyclerView=findViewById(R.id.recyclerplace);
        placesRecycler();

        hotelsRecyclerView=findViewById(R.id.recyclerhotels);
        hotelsRecycler();

        foodsRecyclerView=findViewById(R.id.recyclerfood);
        foodsRecycler();



        slideModels.add(new SlideModel(R.drawable.mysore_palace,"Mysore Palace"));
        slideModels.add(new SlideModel(R.drawable.sri_chamundeshwari_temple,"Sri Chamundeshwari Temple"));
        slideModels.add(new SlideModel(R.drawable.karanji_lake,"Karanji Lake"));
        slideModels.add(new SlideModel(R.drawable.kukkarahalli,"Kukkarahali Lake"));
        slideModels.add(new SlideModel(R.drawable.lalitha_mahal,"Lalitha Mahal"));
        slideModels.add(new SlideModel(R.drawable.melukote,"Melukote"));
        slideModels.add(new SlideModel(R.drawable.regional_museum_of_natural_history,"Regional Museum of Natural History"));
        imageSlider.setImageList(slideModels,true);


    }

    private void hotelsRecycler() {

        hotelsRecyclerView.setHasFixedSize(true);
        hotelsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalhotelhelpers = new ArrayList<>();
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.welcomhotel_by_itc_hotels1, "Welcom hotel Mysore"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.jaipur_marriott_hotel, "Mysore Marriott Hotel"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.the_fortune_resort, "The Mysore Resort"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.hotel_galaxy_ladakh, "Hotel Mysore"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.prazeres_resort, "Prazeres Resort"));


        adapter3 = new horizontalMysoreHotelsAdapter(horizontalhotelhelpers);
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

        adapter2 = new horizontalMysoreFoodsAdapter(horizontalfoodhelpers);
        foodsRecyclerView.setAdapter(adapter2);
    }

    private void placesRecycler(){


        placesRecyclerView.setHasFixedSize(true);
        placesRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalhelpers = new ArrayList<>();
        horizontalhelpers.add(new horizontalhelper(R.drawable.mysore_palace, "Mysore Palace"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.sri_chamarajendra_zoological_gardens, "Sri Chamarajendra Zoological Gardens"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.sri_chamundeshwari_temple, "Sri Chamundeshwari Temple"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.karanji_lake, "Karanji Lake"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.grs_fantasy_park, "GRS Fantasy Park"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.st_philomena_church, "St. Philomena's Cathedral"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.jaganmohan_palace, "Jaganmohan Palace Art Gallery and Auditorium"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.lalitha_mahal, "Lalitha Mahal"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.regional_museum_of_natural_history, "Regional Museum of Natural History"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.kukkarahalli, "Kukkarahali Lake"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.lingambudhi_lake, "Lingambudhi Lake"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.melukote, "Melukote"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.krs_dam, "KRS Dam"));
        adapter = new horizontalMysorePlacesAdapter(horizontalhelpers);
        placesRecyclerView.setAdapter(adapter);
    }


    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), Places.class));
        super.onBackPressed();
    }
}