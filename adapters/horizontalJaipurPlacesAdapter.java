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
import com.example.travelmania.AlbertHallMuseum;
import com.example.travelmania.AmberFort;
import com.example.travelmania.BirlaMandir;
import com.example.travelmania.ChhatarpurTemple;
import com.example.travelmania.CityPalace;
import com.example.travelmania.Delhi;
import com.example.travelmania.FunNFoodVillage;
import com.example.travelmania.GurudwaraBanglaSahib;
import com.example.travelmania.HawaMahal;
import com.example.travelmania.HumayunsTomb;
import com.example.travelmania.IndiaGate;
import com.example.travelmania.Jaipur;
import com.example.travelmania.JamaMasjid;
import com.example.travelmania.JantarMantar;
import com.example.travelmania.KidZania;
import com.example.travelmania.KingdomofDreams;
import com.example.travelmania.LodhiGarden;
import com.example.travelmania.LotusTemple;
import com.example.travelmania.MehrauliArcheologicalPark;
import com.example.travelmania.PuranaQila;
import com.example.travelmania.QutubMinar;
import com.example.travelmania.R;
import com.example.travelmania.RashtrapratiBhaban;
import com.example.travelmania.RedFort;
import com.example.travelmania.SafdarjungsTomb;
import com.example.travelmania.SnowWorld;
import com.example.travelmania.WestofWonderPark;
import com.example.travelmania.WorldsofWonder;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;

public class horizontalJaipurPlacesAdapter extends RecyclerView.Adapter<horizontalJaipurPlacesAdapter.horizontalViewHolder>  {

    ArrayList<horizontalhelper> horizontalhelpers;
    private Context context;

    public horizontalJaipurPlacesAdapter(ArrayList<horizontalhelper> horizontalhelpers) {
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
                    intent =  new Intent(context, AlbertHallMuseum.class);
                    break;

                case 1:
                    intent =  new Intent(context, AmberFort.class);
                    break;

                case 2:
                    intent =  new Intent(context, BirlaMandir.class);
                    break;

                case 3:
                    intent =  new Intent(context, CityPalace.class);
                    break;

                case 4:
                    intent =  new Intent(context, HawaMahal.class);
                    break;

                case 5:
                    intent =  new Intent(context, JantarMantar.class);
                    break;


                default:
                    intent =  new Intent(context, Jaipur.class);
                    break;
            }
            context.startActivity(intent);


        }
    }
}