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
import com.example.travelmania.Amarnath;
import com.example.travelmania.Baltal;
import com.example.travelmania.ChhatarpurTemple;
import com.example.travelmania.DachigamNationalPark;
import com.example.travelmania.Delhi;
import com.example.travelmania.Doda;
import com.example.travelmania.FunNFoodVillage;
import com.example.travelmania.Gulmarag;
import com.example.travelmania.GurudwaraBanglaSahib;
import com.example.travelmania.HumayunsTomb;
import com.example.travelmania.IndiaGate;
import com.example.travelmania.JamaMasjid;
import com.example.travelmania.JammuCity;
import com.example.travelmania.Kashmir;
import com.example.travelmania.Kathua;
import com.example.travelmania.Khilanmarg;
import com.example.travelmania.KidZania;
import com.example.travelmania.KingdomofDreams;
import com.example.travelmania.Kishtwar;
import com.example.travelmania.LodhiGarden;
import com.example.travelmania.LotusTemple;
import com.example.travelmania.MehrauliArcheologicalPark;
import com.example.travelmania.NishatGarden;
import com.example.travelmania.Pahalgam;
import com.example.travelmania.Patnitop;
import com.example.travelmania.Poonch;
import com.example.travelmania.PuranaQila;
import com.example.travelmania.QutubMinar;
import com.example.travelmania.R;
import com.example.travelmania.RashtrapratiBhaban;
import com.example.travelmania.RedFort;
import com.example.travelmania.SafdarjungsTomb;
import com.example.travelmania.ShalimarGarden;
import com.example.travelmania.SnowWorld;
import com.example.travelmania.Sonamarg;
import com.example.travelmania.Srinagar;
import com.example.travelmania.VaishnoDevi;
import com.example.travelmania.WestofWonderPark;
import com.example.travelmania.WorldsofWonder;
import com.example.travelmania.Yusmarg;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;

public class horizontalKashmirPlacesAdapter extends RecyclerView.Adapter<horizontalKashmirPlacesAdapter.horizontalViewHolder>  {

    ArrayList<horizontalhelper> horizontalhelpers;
    private Context context;

    public horizontalKashmirPlacesAdapter(ArrayList<horizontalhelper> horizontalhelpers) {
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
                    intent =  new Intent(context, Srinagar.class);
                    break;

                case 1:
                    intent =  new Intent(context, Gulmarag.class);
                    break;

                case 2:
                    intent =  new Intent(context, Sonamarg.class);
                    break;

                case 3:
                    intent =  new Intent(context, Kathua.class);
                    break;

                case 4:
                    intent =  new Intent(context, Pahalgam.class);
                    break;

                case 5:
                    intent =  new Intent(context, JammuCity.class);
                    break;

                case 6:
                    intent =  new Intent(context, Kishtwar.class);
                    break;

                case 7:
                    intent =  new Intent(context, Doda.class);
                    break;

                case 8:
                    intent =  new Intent(context, Poonch.class);
                    break;

                case 9:
                    intent =  new Intent(context, NishatGarden.class);
                    break;

                case 10:
                    intent =  new Intent(context, Yusmarg.class);
                    break;

                case 11:
                    intent =  new Intent(context, VaishnoDevi.class);
                    break;

                case 12:
                    intent =  new Intent(context, Patnitop.class);
                    break;

                case 13:
                    intent =  new Intent(context, Amarnath.class);
                    break;

                case 14:
                    intent =  new Intent(context, DachigamNationalPark.class);
                    break;

                case 15:
                    intent =  new Intent(context, Khilanmarg.class);
                    break;

                case 16:
                    intent =  new Intent(context, Baltal.class);
                    break;

                case 17:
                    intent =  new Intent(context, ShalimarGarden.class);
                    break;

                default:
                    intent =  new Intent(context, Kashmir.class);
                    break;
            }
            context.startActivity(intent);


        }
    }
}
