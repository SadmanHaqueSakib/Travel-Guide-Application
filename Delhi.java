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
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;
import java.util.List;

public class Delhi extends AppCompatActivity {

    RecyclerView placesRecyclerView;
    RecyclerView foodsRecyclerView;
    RecyclerView hotelsRecyclerView;

    RecyclerView.Adapter adapter;
    RecyclerView.Adapter adapter2;
    RecyclerView.Adapter adapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delhi);

        ImageSlider imageSlider= findViewById(R.id.delhislider);
        List<SlideModel> slideModels= new ArrayList<>();

        placesRecyclerView=findViewById(R.id.recyclerplace);
        placesRecycler();

        hotelsRecyclerView=findViewById(R.id.recyclerhotels);
        hotelsRecycler();

        foodsRecyclerView=findViewById(R.id.recyclerfood);
        foodsRecycler();



        slideModels.add(new SlideModel(R.drawable.akshardham_temple,"Akshardham Temple"));
        slideModels.add(new SlideModel(R.drawable.redfort,"RedFort"));
        slideModels.add(new SlideModel(R.drawable.rashtapratibhaban,"Rashtaprati Bhaban"));
        slideModels.add(new SlideModel(R.drawable.india_gate,"India Gate"));
        slideModels.add(new SlideModel(R.drawable.lotustemple,"Lotus Temple"));
        slideModels.add(new SlideModel(R.drawable.qutub_minar,"Qutub Minar"));
        slideModels.add(new SlideModel(R.drawable.humayuns_tomb,"Humayuns Tomb"));
        imageSlider.setImageList(slideModels,true);


    }

    private void hotelsRecycler() {

        hotelsRecyclerView.setHasFixedSize(true);
        hotelsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalhotelhelpers = new ArrayList<>();
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.the_oberoi_new_delhi, "The Oberoi New Delhi"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.the_leela_palace_new_delhi, "The Leela Palace New Delhi"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.the_lodhi, "The Lodhi – A member of The Leading Hotels Of The World"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.the_taj_mahal_hotel, "The Taj Mahal Hotel New Delhi"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.shangri_la_s_eros_hotel, "Shangri-La's - Eros Hotel, New Delhi"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.hyatt_regency, "Hyatt Regency Delhi"));


        adapter3 = new horizontalHotelsAdapter(horizontalhotelhelpers);
        hotelsRecyclerView.setAdapter(adapter3);
    }

    private void foodsRecycler() {


        foodsRecyclerView.setHasFixedSize(true);
        foodsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalfoodhelpers = new ArrayList<>();
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.butter_chicken, "Butter Chicken"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.momos, "Momos"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.pakodas1, "Pakodas"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.chola_bhatura, "Chola Bhatura"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.kebabs2, "Kabab"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.parantha1, "Parantha"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.daal_makhni2, "Daal Makhani"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.daulat_ki_chaat_jalebis4, "Daulat Ki Chaat & Jalebis"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.paan, "Paan"));

        adapter2 = new horizontalFoodsAdapter(horizontalfoodhelpers);
        foodsRecyclerView.setAdapter(adapter2);
    }

    private void placesRecycler(){


        placesRecyclerView.setHasFixedSize(true);
        placesRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalhelpers = new ArrayList<>();
        horizontalhelpers.add(new horizontalhelper(R.drawable.akshardham_temple, "Akshardham Temple"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.red_fort, "Red Fort"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.india_gate, "India Gate"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.kingdom_of_dreams, "Kingdom of Dreams"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.worlds_of_wonder, "Worlds of Wonder"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.kid_zania, "KidZania"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.fun_n_food_village, "Fun N Food Village"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.snow_world, "Snow World"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.qutub_minar, "Qutub Minar"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.humayuns_tomb, "Humayun's Tomb"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.lotustemple, "Lotus Temple"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.jama_masjid, "Jama Masjid"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.rashtrapati_bhavan, "Rashtraprati Bhaban"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.purana_qila, "Purana Qila"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.west_to_wonder_park, "West of Wonder Park"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.gurudwara_bangla_sahib, "Gurudwara Bangla Sahib"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.mehrauli_archaeological_park, "Mehrauli Archeological Park"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.chhatarpur_temple, "Chhatarpur Temple"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.safdarjungs_tomb, "Safdarjung's Tomb"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.lodhi_garden, "Lodhi Garden"));


        adapter = new horizontalPlacesAdapter(horizontalhelpers);
        placesRecyclerView.setAdapter(adapter);
    }


    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), Places.class));
        super.onBackPressed();
    }
}