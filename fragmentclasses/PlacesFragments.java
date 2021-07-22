package com.example.travelmania.fragmentclasses;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.travelmania.R;
import com.example.travelmania.adapters.Adaptarrecycler;
import com.example.travelmania.helpers.Datamodel;

import java.util.ArrayList;


public class PlacesFragments extends Fragment {

    RecyclerView recyclerView;
    ArrayList<Datamodel> dataholder;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_places, container, false);
        recyclerView= view.findViewById(R.id.recview);

        recyclerView.setLayoutManager((new LinearLayoutManager(getContext())));

        dataholder = new ArrayList<>();

        Datamodel delhi= new Datamodel(R.drawable.new_delhi,"Delhi");
        dataholder.add(delhi);

        Datamodel ob2= new Datamodel(R.drawable.ladakh,"Ladakh");
        dataholder.add(ob2);

        Datamodel ob3= new Datamodel(R.drawable.goa,"Goa");
        dataholder.add(ob3);

        Datamodel ob4= new Datamodel(R.drawable.agra,"Agra");
        dataholder.add(ob4);

        Datamodel ob5= new Datamodel(R.drawable.kerala,"Kerala");
        dataholder.add(ob5);

        Datamodel ob6= new Datamodel(R.drawable.jaipur,"Jaipur");
        dataholder.add(ob6);

        Datamodel ob7= new Datamodel(R.drawable.andaman,"Andaman");
        dataholder.add(ob7);

        Datamodel ob8= new Datamodel(R.drawable.amritsar,"Amritsar");
        dataholder.add(ob8);

        Datamodel ob9= new Datamodel(R.drawable.kashmir1,"Kashmir");
        dataholder.add(ob9);

        Datamodel ob10= new Datamodel(R.drawable.meghalaya,"Meghalaya");
        dataholder.add(ob10);

        Datamodel ob11= new Datamodel(R.drawable.mysore,"Mysore");
        dataholder.add(ob11);

        Datamodel ob12= new Datamodel(R.drawable.rann_of_kutch,"Rann of Kutch");
        dataholder.add(ob12);

        Datamodel ob13= new Datamodel(R.drawable.rishikesh,"Rishikesh");
        dataholder.add(ob13);

        Datamodel ob14= new Datamodel(R.drawable.shimla,"Shimla");
        dataholder.add(ob14);

        Datamodel ob15= new Datamodel(R.drawable.sikkim,"Sikkim");
        dataholder.add(ob15);

        Datamodel ob16= new Datamodel(R.drawable.varanasi,"Varanasi");
        dataholder.add(ob16);

        recyclerView.setAdapter(new Adaptarrecycler(dataholder));



        return view;
    }
}
