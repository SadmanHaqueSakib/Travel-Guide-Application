package com.example.travelmania.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.travelmania.Annandale;
import com.example.travelmania.BalpakramNationalPark;
import com.example.travelmania.ChadwickFalls;
import com.example.travelmania.Cherrapunji;
import com.example.travelmania.ChristChurch;
import com.example.travelmania.ElephantFalls;
import com.example.travelmania.IndianInistituteAdvancedStudies;
import com.example.travelmania.JakhooTemple;
import com.example.travelmania.Kufri;
import com.example.travelmania.KyllangRock;
import com.example.travelmania.MawlynnongVillage;
import com.example.travelmania.Meghalaya;
import com.example.travelmania.NohkalikaiFalls;
import com.example.travelmania.R;
import com.example.travelmania.Shillong;
import com.example.travelmania.Shimla;
import com.example.travelmania.ShimlaStateMuseum;
import com.example.travelmania.SummerHill;
import com.example.travelmania.TaraDeviTemple;
import com.example.travelmania.TheLivingRootBridge;
import com.example.travelmania.TheRidge;
import com.example.travelmania.Tura;
import com.example.travelmania.UmiamLake;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;

public class horizontalMeghalayaPlacesAdapter extends RecyclerView.Adapter<horizontalMeghalayaPlacesAdapter.horizontalViewHolder>  {

    ArrayList<horizontalhelper> horizontalhelpers;
    private Context context;

    public horizontalMeghalayaPlacesAdapter(ArrayList<horizontalhelper> horizontalhelpers) {
        this.horizontalhelpers = horizontalhelpers;
    }

    @NonNull
    @Override
    public horizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontalrecyclerdesign, parent, false);
        return new horizontalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull horizontalViewHolder holder, int position) {

        horizontalhelper phonehelper = horizontalhelpers.get(position);
        holder.image.setImageResource(phonehelper.getImage());
        holder.title.setText(phonehelper.getTitle());

    }

    @Override
    public int getItemCount() {
        return horizontalhelpers.size();
    }

    class horizontalViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView image;
        TextView title;

        public horizontalViewHolder(@NonNull View itemView) {
            super(itemView);
            context=itemView.getContext();
            image=itemView.findViewById(R.id.card_image);
            title=itemView.findViewById(R.id.card_title);
            itemView.setClickable(true);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            final Intent intent;
            switch (getAbsoluteAdapterPosition()){
                case 0:
                    intent =  new Intent(context, Cherrapunji.class);
                    break;

                case 1:
                    intent =  new Intent(context, BalpakramNationalPark.class);
                    break;

                case 2:
                    intent =  new Intent(context, Shillong.class);
                    break;

                case 3:
                    intent =  new Intent(context, ElephantFalls.class);
                    break;

                case 4:
                    intent =  new Intent(context, TheLivingRootBridge.class);
                    break;

                case 5:
                    intent =  new Intent(context, MawlynnongVillage.class);
                    break;

                case 6:
                    intent =  new Intent(context, NohkalikaiFalls.class);
                    break;

                case 7:
                    intent =  new Intent(context, Tura.class);
                    break;

                case 8:
                    intent =  new Intent(context, KyllangRock.class);
                    break;

                case 9:
                    intent =  new Intent(context, UmiamLake.class);
                    break;

                default:
                    intent =  new Intent(context, Meghalaya.class);
                    break;
            }
            context.startActivity(intent);


        }
    }
}
