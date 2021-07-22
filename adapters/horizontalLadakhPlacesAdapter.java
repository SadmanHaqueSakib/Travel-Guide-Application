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
import com.example.travelmania.ChadarTrek;
import com.example.travelmania.ChhatarpurTemple;
import com.example.travelmania.Delhi;
import com.example.travelmania.DiskitMonastery;
import com.example.travelmania.FunNFoodVillage;
import com.example.travelmania.GurudwaraBanglaSahib;
import com.example.travelmania.HumayunsTomb;
import com.example.travelmania.IndiaGate;
import com.example.travelmania.JamaMasjid;
import com.example.travelmania.Kargil;
import com.example.travelmania.KhardungLaPass;
import com.example.travelmania.KidZania;
import com.example.travelmania.KingdomofDreams;
import com.example.travelmania.LachulungLa;
import com.example.travelmania.Ladakh;
import com.example.travelmania.LodhiGarden;
import com.example.travelmania.LotusTemple;
import com.example.travelmania.MarkhaValleyTrek;
import com.example.travelmania.MehrauliArcheologicalPark;
import com.example.travelmania.MoonlandLamayaru;
import com.example.travelmania.NamgyalTsemoGompa;
import com.example.travelmania.NubraValley;
import com.example.travelmania.Nyoma;
import com.example.travelmania.PangongTsoLake;
import com.example.travelmania.PuranaQila;
import com.example.travelmania.QutubMinar;
import com.example.travelmania.R;
import com.example.travelmania.RashtrapratiBhaban;
import com.example.travelmania.RedFort;
import com.example.travelmania.RohtangPass;
import com.example.travelmania.RoyalLehPalace;
import com.example.travelmania.SafdarjungsTomb;
import com.example.travelmania.SindhuDarshanFestival;
import com.example.travelmania.SnowWorld;
import com.example.travelmania.TanglangLa;
import com.example.travelmania.ThikseyGompa;
import com.example.travelmania.TsoKar;
import com.example.travelmania.TsoMoririLake;
import com.example.travelmania.WestofWonderPark;
import com.example.travelmania.WorldsofWonder;
import com.example.travelmania.ZanskarValley;
import com.example.travelmania.ZorawarFort;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;

public class horizontalLadakhPlacesAdapter extends RecyclerView.Adapter<horizontalLadakhPlacesAdapter.horizontalViewHolder>  {

    ArrayList<horizontalhelper> horizontalhelpers;
    private Context context;

    public horizontalLadakhPlacesAdapter(ArrayList<horizontalhelper> horizontalhelpers) {
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
                    intent =  new Intent(context, ZanskarValley.class);
                    break;

                case 1:
                    intent =  new Intent(context, PangongTsoLake.class);
                    break;

                case 2:
                    intent =  new Intent(context, Kargil.class);
                    break;

                case 3:
                    intent =  new Intent(context, KhardungLaPass.class);
                    break;

                case 4:
                    intent =  new Intent(context, NubraValley.class);
                    break;

                case 5:
                    intent =  new Intent(context, RoyalLehPalace.class);
                    break;

                case 6:
                    intent =  new Intent(context, TsoMoririLake.class);
                    break;

                case 7:
                    intent =  new Intent(context, ChadarTrek.class);
                    break;

                case 8:
                    intent =  new Intent(context, ThikseyGompa.class);
                    break;

                case 9:
                    intent =  new Intent(context, DiskitMonastery.class);
                    break;

                case 10:
                    intent =  new Intent(context, NamgyalTsemoGompa.class);
                    break;

                case 11:
                    intent =  new Intent(context, TsoKar.class);
                    break;

                case 12:
                    intent =  new Intent(context, Nyoma.class);
                    break;

                case 13:
                    intent =  new Intent(context, RohtangPass.class);
                    break;

                case 14:
                    intent =  new Intent(context, LachulungLa.class);
                    break;

                case 15:
                    intent =  new Intent(context, TanglangLa.class);
                    break;

                case 16:
                    intent =  new Intent(context, ZorawarFort.class);
                    break;

                case 17:
                    intent =  new Intent(context, MarkhaValleyTrek.class);
                    break;

                case 18:
                    intent =  new Intent(context, SindhuDarshanFestival.class);
                    break;

                case 19:
                    intent =  new Intent(context, MoonlandLamayaru.class);
                    break;

                default:
                    intent =  new Intent(context, Ladakh.class);
                    break;
            }
            context.startActivity(intent);


        }
    }
}
