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
import com.example.travelmania.adapters.horizontalKeralaFoodsAdapter;
import com.example.travelmania.adapters.horizontalKeralaHotelsAdapter;
import com.example.travelmania.adapters.horizontalKeralaPlacesAdapter;
import com.example.travelmania.adapters.horizontalPlacesAdapter;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;
import java.util.List;

public class Kerala extends AppCompatActivity {


    RecyclerView placesRecyclerView;
    RecyclerView foodsRecyclerView;
    RecyclerView hotelsRecyclerView;

    RecyclerView.Adapter adapter;
    RecyclerView.Adapter adapter2;
    RecyclerView.Adapter adapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerala);

        ImageSlider imageSlider= findViewById(R.id.keralaslider);
        List<SlideModel> slideModels= new ArrayList<>();

        placesRecyclerView=findViewById(R.id.recyclerplace);
        placesRecycler();

        hotelsRecyclerView=findViewById(R.id.recyclerhotels);
        hotelsRecycler();

        foodsRecyclerView=findViewById(R.id.recyclerfood);
        foodsRecycler();



        slideModels.add(new SlideModel(R.drawable.cochin,"Cochin"));
        slideModels.add(new SlideModel(R.drawable.kovalam,"Kovalam"));
        slideModels.add(new SlideModel(R.drawable.idukki,"Idukki"));
        slideModels.add(new SlideModel(R.drawable.kizhunna_beach,"Kizhunna Beach"));
        slideModels.add(new SlideModel(R.drawable.munroe_island,"Munroe Island"));
        slideModels.add(new SlideModel(R.drawable.nelliampathy,"Nelliampathy"));
        slideModels.add(new SlideModel(R.drawable.varkala,"Varkala"));
        imageSlider.setImageList(slideModels,true);


    }

    private void hotelsRecycler() {

        hotelsRecyclerView.setHasFixedSize(true);
        hotelsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalhotelhelpers = new ArrayList<>();
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.hyatt_regency_thrissur, "Hyatt regency Thrissur"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.emarald_resort, "Emarald resort"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.eco_garden_resort_kerala, "Eco garden resort kerala"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.lemon_residency, "Lemon residency"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.hotel_virad, "Hotel Virad"));


        adapter3 = new horizontalKeralaHotelsAdapter(horizontalhotelhelpers);
        hotelsRecyclerView.setAdapter(adapter3);
    }

    private void foodsRecycler() {


        foodsRecyclerView.setHasFixedSize(true);
        foodsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalfoodhelpers = new ArrayList<>();
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.puttu_and_kadala_curry, "Puttu and Kadala Curry"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.appam_with_stew, "Appam with Stew"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.idiyappam, "Idiyappam"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.nadan_kozhi_varuthathu, "Nadan Kozhi Varuthathu"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.naadan_beef_fry, "Naadan Beef Fry"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.kerala_prawn_curry, "Kerala Prawn Curry"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.malabar_parota, "Malabar Parota"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.kerala_style_fish_molee, "Kerala Style Fish Molee"));

        adapter2 = new horizontalKeralaFoodsAdapter(horizontalfoodhelpers);
        foodsRecyclerView.setAdapter(adapter2);
    }

    private void placesRecycler(){


        placesRecyclerView.setHasFixedSize(true);
        placesRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalhelpers = new ArrayList<>();
        horizontalhelpers.add(new horizontalhelper(R.drawable.alleppey, "Alleppey"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.wayanad, "Wayanad"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.cochin, "Cochin"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.munnar, "Munnar"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.kumarakom, "Kumarakom"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.kovalam, "Kovalam"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.kollam, "Kollam"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.vagamon, "Vagamon"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.kozhikode, "Kozhikode"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.bekal, "Bekal"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.guruvayur, "Guruvayur"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.idukki, "Idukki"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.kannur, "Kannur"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.kizhunna_beach, "Kizhunna Beach"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.kuttanad, "Kuttanad"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.marari, "Marari"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.munroe_island, "Munroe Island"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.nelliampathy, "Nelliampathy"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.palakkad, "Palakkad"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.ponmudi, "Ponmudi"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.poovar, "Poovar"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.varkala, "Varkala"));


        adapter = new horizontalKeralaPlacesAdapter(horizontalhelpers);
        placesRecyclerView.setAdapter(adapter);
    }


    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), Places.class));
        super.onBackPressed();
    }
}