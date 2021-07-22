package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.travelmania.adapters.horizontalFoodsAdapter;
import com.example.travelmania.adapters.horizontalGoaFoodsAdapter;
import com.example.travelmania.adapters.horizontalGoaHotelsAdapter;
import com.example.travelmania.adapters.horizontalGoaPlacesAdapter;
import com.example.travelmania.adapters.horizontalHotelsAdapter;
import com.example.travelmania.adapters.horizontalLadakhFoodsAdapter;
import com.example.travelmania.adapters.horizontalLadakhHotelsAdapter;
import com.example.travelmania.adapters.horizontalLadakhPlacesAdapter;
import com.example.travelmania.adapters.horizontalPlacesAdapter;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;
import java.util.List;

public class Goa extends AppCompatActivity {
    RecyclerView placesRecyclerView;
    RecyclerView foodsRecyclerView;
    RecyclerView hotelsRecyclerView;

    RecyclerView.Adapter adapter;
    RecyclerView.Adapter adapter2;
    RecyclerView.Adapter adapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goa);

        ImageSlider imageSlider= findViewById(R.id.goaslider);
        List<SlideModel> slideModels= new ArrayList<>();

        placesRecyclerView=findViewById(R.id.recyclerplace);
        placesRecycler();

        hotelsRecyclerView=findViewById(R.id.recyclerhotels);
        hotelsRecycler();

        foodsRecyclerView=findViewById(R.id.recyclerfood);
        foodsRecycler();



        slideModels.add(new SlideModel(R.drawable.grande_island,"Grande Island"));
        slideModels.add(new SlideModel(R.drawable.bogmalo_beach,"Bogmalo Beach"));
        slideModels.add(new SlideModel(R.drawable.palolem_beach,"Palolem Beach"));
        slideModels.add(new SlideModel(R.drawable.morjim_beach,"Morjim Beach"));
        slideModels.add(new SlideModel(R.drawable.candolim_beach,"Candolim Beach"));
        slideModels.add(new SlideModel(R.drawable.lachung,"Dudhsagar Waterfalls"));
        slideModels.add(new SlideModel(R.drawable.netravali_wildlife_sanctuary,"Netravali Wildlife Sanctuary"));
        imageSlider.setImageList(slideModels,true);


    }

    private void hotelsRecycler() {

        hotelsRecyclerView.setHasFixedSize(true);
        hotelsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalhotelhelpers = new ArrayList<>();
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.fairfield_by_marriott_goa, "Fairfield by Marriott Goa Anjuna"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.goa_marriott_resort_spa, "Goa Marriott Resort & Spa"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.prazeres_resort, "Prazeres Resort"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.hotel_laguna_anjuna, "Hotel Laguna Anjuna"));
        horizontalhotelhelpers.add(new horizontalhelper(R.drawable.taj_fort_aguada_resort, "Taj Fort Aguada Resort & Spa, Goa"));


        adapter3 = new horizontalGoaHotelsAdapter(horizontalhotelhelpers);
        hotelsRecyclerView.setAdapter(adapter3);
    }

    private void foodsRecycler() {


        foodsRecyclerView.setHasFixedSize(true);
        foodsRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalfoodhelpers = new ArrayList<>();
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.pork_vindaloo, "Pork vindaloo"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.crab_xec_xec, "Crab xec xec"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.prawn_balchao, "Prawn balchao"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.sanna, "Sanna"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.goan_red_rice, "Goan red rice"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.chouris_pao, "Chouris pao)"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.poee, "Poee"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.kingfish, "Kingfish"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.feni, "Feni"));
        horizontalfoodhelpers.add(new horizontalhelper(R.drawable.bebinca, "Bebinca"));

        adapter2 = new horizontalGoaFoodsAdapter(horizontalfoodhelpers);
        foodsRecyclerView.setAdapter(adapter2);
    }

    private void placesRecycler(){


        placesRecyclerView.setHasFixedSize(true);
        placesRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<horizontalhelper> horizontalhelpers = new ArrayList<>();
        horizontalhelpers.add(new horizontalhelper(R.drawable.grande_island, "Grande Island"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.bogmalo_beach, "Bogmalo Beach"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.palolem_beach, "Palolem Beach"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.calangute_beach, "Calangute Beach"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.morjim_beach, "Morjim Beach"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.mobor_beach, "Mobor Beach"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.candolim_beach, "Candolim Beach"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.colva_beach, "Colva Beach"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.baga_beach, "Baga Beach"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.sinquerim_beach, "Sinquerim Beach"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.dudhsagar_waterfalls, "Dudhsagar Waterfalls"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.mollem_national_park, "Mollem National Park"));
        horizontalhelpers.add(new horizontalhelper(R.drawable.netravali_wildlife_sanctuary, "Netravali Wildlife Sanctuary"));


        adapter = new horizontalGoaPlacesAdapter(horizontalhelpers);
        placesRecyclerView.setAdapter(adapter);
    }


    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), Places.class));
        super.onBackPressed();
    }
}