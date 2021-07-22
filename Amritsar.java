package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.travelmania.adapters.horizontalAmritsarFoodsAdapter;
import com.example.travelmania.adapters.horizontalAmritsarHotelsAdapter;
import com.example.travelmania.adapters.horizontalAmritsarPlacesAdapter;
import com.example.travelmania.adapters.horizontalFoodsAdapter;
import com.example.travelmania.adapters.horizontalHotelsAdapter;
import com.example.travelmania.adapters.horizontalPlacesAdapter;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;
import java.util.List;

public class Amritsar extends AppCompatActivity {
    RecyclerView placesRecyclerView;
    RecyclerView foodsRecyclerView;
    RecyclerView hotelsRecyclerView;

    RecyclerView.Adapter adapter;
    RecyclerView.Adapter adapter2;
    RecyclerView.Adapter adapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amritsar);

        ImageSlider imageSlider= findViewById(R.id.amritsarslider);
        List<SlideModel> slideModels= new ArrayList<>();

        placesRecyclerView=findViewById(R.id.recyclerplace);
        placesRecycler();

        hotelsRecyclerView=findViewById(R.id.recyclerhotels);
        hotelsRecycler();

        foodsRecyclerView=findViewById(R.id.recyclerfood);
        foodsRecycler();



        slideModels.add(new SlideModel(R.drawable.baba_atal_tower,"Baba Atal Tower"));
        slideModels.add(new SlideModel(R.drawable.gobindgarh_fort,"Gobindgarh Fort"));
        slideModels.add(new SlideModel(R.drawable.jallianwala_bagh,"Jallianwala Bagh"));
        slideModels.add(new SlideModel(R.drawable.the_golden_temple,"The Golden Temple"));
        slideModels.add(new SlideModel(R.drawable.wagah_border_ceremony,"Wagah Border Ceremony"));
        imageSlider.setImageList(slideModels,true);


    }

    private void hotelsRecycler() {

        hotelsRecyclerView.setHasFixedSize(true);
        hotelsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalhotelhelpers = new ArrayList<>();
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.best_western_merrion, "Best Western Merrion"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.fairfield_by_marriott_amritsar, "Fairfield by Marriott Amritsar"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.hyatt_regency_amritsar, "Hyatt Regency Amritsar"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.park_inn_by_radisson_amritsar, "Park Inn by Radisson Amritsar"));

        adapter3 = new horizontalAmritsarHotelsAdapter(horizontalhotelhelpers);
        hotelsRecyclerView.setAdapter(adapter3);
    }

    private void foodsRecycler() {


        foodsRecyclerView.setHasFixedSize(true);
        foodsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalfoodhelpers = new ArrayList<>();
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.ahuja_lassi, "Ahuja Lassi"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.chicken_tikka_tandoori, "Chicken Tikka Tandoori"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.chole_bhature_amritsar, "Chole Bhature"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.kulcha, "Kulcha"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.langar_ka_prasad, "Langar Ka Prasad"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.mutton_chaap, "Mutton Chaap"));

        adapter2 = new horizontalAmritsarFoodsAdapter(horizontalfoodhelpers);
        foodsRecyclerView.setAdapter(adapter2);
    }

    private void placesRecycler(){


        placesRecyclerView.setHasFixedSize(true);
        placesRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalhelpers = new ArrayList<>();
        horizontalhelpers.add(new horizontalhelper(R.drawable.baba_atal_tower, "Baba Atal Tower"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.gobindgarh_fort, "Gobindgarh Fort"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.jallianwala_bagh, "Jallianwala Bagh"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.partition_museum, "Partition Museum"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.the_golden_temple, "The Golden Temple"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.wagah_border_ceremony, "Wagah Border Ceremony"));

        adapter = new horizontalAmritsarPlacesAdapter(horizontalhelpers);
        placesRecyclerView.setAdapter(adapter);
    }


    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), Places.class));
        super.onBackPressed();
    }
}