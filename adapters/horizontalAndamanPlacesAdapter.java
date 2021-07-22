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

import com.example.travelmania.Akshardham;
import com.example.travelmania.Andaman;
import com.example.travelmania.BaratangIsland;
import com.example.travelmania.ChhatarpurTemple;
import com.example.travelmania.CinqueIsland;
import com.example.travelmania.Delhi;
import com.example.travelmania.DhaninallahMangroveNatureWalkway;
import com.example.travelmania.FunNFoodVillage;
import com.example.travelmania.GurudwaraBanglaSahib;
import com.example.travelmania.HavelockIsland;
import com.example.travelmania.HumayunsTomb;
import com.example.travelmania.IndiaGate;
import com.example.travelmania.JamaMasjid;
import com.example.travelmania.KidZania;
import com.example.travelmania.KingdomofDreams;
import com.example.travelmania.LodhiGarden;
import com.example.travelmania.LotusTemple;
import com.example.travelmania.Mayabunder;
import com.example.travelmania.MehrauliArcheologicalPark;
import com.example.travelmania.MountHarrietNationalPark;
import com.example.travelmania.NeilIsland;
import com.example.travelmania.NorthBayIsland;
import com.example.travelmania.PanchavatiWaterfalls;
import com.example.travelmania.PuranaQila;
import com.example.travelmania.QutubMinar;
import com.example.travelmania.R;
import com.example.travelmania.Rangat;
import com.example.travelmania.RashtrapratiBhaban;
import com.example.travelmania.RedFort;
import com.example.travelmania.RossIsland;
import com.example.travelmania.RossandSmithIsland;
import com.example.travelmania.SafdarjungsTomb;
import com.example.travelmania.SnowWorld;
import com.example.travelmania.ViperIsland;
import com.example.travelmania.WestofWonderPark;
import com.example.travelmania.WorldsofWonder;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;

public class horizontalAndamanPlacesAdapter extends RecyclerView.Adapter<horizontalAndamanPlacesAdapter.horizontalViewHolder>  {

    ArrayList<horizontalhelper> horizontalhelpers;
    private Context context;

    public horizontalAndamanPlacesAdapter(ArrayList<horizontalhelper> horizontalhelpers) {
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
                    intent =  new Intent(context, HavelockIsland.class);
                    break;

                case 1:
                    intent =  new Intent(context, NeilIsland.class);
                    break;

                case 2:
                    intent =  new Intent(context, RossIsland.class);
                    break;

                case 3:
                    intent =  new Intent(context, NorthBayIsland.class);
                    break;

                case 4:
                    intent =  new Intent(context, BaratangIsland.class);
                    break;

                case 5:
                    intent =  new Intent(context, ViperIsland.class);
                    break;

                case 6:
                    intent =  new Intent(context, RossandSmithIsland.class);
                    break;

                case 7:
                    intent =  new Intent(context, CinqueIsland.class);
                    break;

                case 8:
                    intent =  new Intent(context, MountHarrietNationalPark.class);
                    break;

                case 9:
                    intent =  new Intent(context, Rangat.class);
                    break;

                case 10:
                    intent =  new Intent(context, Mayabunder.class);
                    break;

                case 11:
                    intent =  new Intent(context, DhaninallahMangroveNatureWalkway.class);
                    break;

                case 12:
                    intent =  new Intent(context, PanchavatiWaterfalls.class);
                    break;

                default:
                    intent =  new Intent(context, Andaman.class);
                    break;
            }
            context.startActivity(intent);


        }
    }
}
