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

import com.example.travelmania.BagaBeach;
import com.example.travelmania.BogmaloBeach;
import com.example.travelmania.CalanguteBeach;
import com.example.travelmania.CandolimBeach;
import com.example.travelmania.ChadarTrek;
import com.example.travelmania.ColvaBeach;
import com.example.travelmania.DiskitMonastery;
import com.example.travelmania.DudhsagarWaterfalls;
import com.example.travelmania.Goa;
import com.example.travelmania.GrandeIsland;
import com.example.travelmania.Kargil;
import com.example.travelmania.KhardungLaPass;
import com.example.travelmania.LachulungLa;
import com.example.travelmania.Ladakh;
import com.example.travelmania.MarkhaValleyTrek;
import com.example.travelmania.MoborBeach;
import com.example.travelmania.MollemNationalPark;
import com.example.travelmania.MoonlandLamayaru;
import com.example.travelmania.MorjimBeach;
import com.example.travelmania.NamgyalTsemoGompa;
import com.example.travelmania.NetravaliWildlifeSanctuary;
import com.example.travelmania.NubraValley;
import com.example.travelmania.Nyoma;
import com.example.travelmania.PalolemBeach;
import com.example.travelmania.PangongTsoLake;
import com.example.travelmania.R;
import com.example.travelmania.RohtangPass;
import com.example.travelmania.RoyalLehPalace;
import com.example.travelmania.SindhuDarshanFestival;
import com.example.travelmania.SinquerimBeach;
import com.example.travelmania.TanglangLa;
import com.example.travelmania.ThikseyGompa;
import com.example.travelmania.TsoKar;
import com.example.travelmania.TsoMoririLake;
import com.example.travelmania.ZanskarValley;
import com.example.travelmania.ZorawarFort;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;

public class horizontalGoaPlacesAdapter extends RecyclerView.Adapter<horizontalGoaPlacesAdapter.horizontalViewHolder>  {

    ArrayList<horizontalhelper> horizontalhelpers;
    private Context context;

    public horizontalGoaPlacesAdapter(ArrayList<horizontalhelper> horizontalhelpers) {
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
                    intent =  new Intent(context, GrandeIsland.class);
                    break;

                case 1:
                    intent =  new Intent(context, BogmaloBeach.class);
                    break;

                case 2:
                    intent =  new Intent(context, PalolemBeach.class);
                    break;

                case 3:
                    intent =  new Intent(context, CalanguteBeach.class);
                    break;

                case 4:
                    intent =  new Intent(context, MorjimBeach.class);
                    break;

                case 5:
                    intent =  new Intent(context, MoborBeach.class);
                    break;

                case 6:
                    intent =  new Intent(context, CandolimBeach.class);
                    break;

                case 7:
                    intent =  new Intent(context, ColvaBeach.class);
                    break;

                case 8:
                    intent =  new Intent(context, BagaBeach.class);
                    break;

                case 9:
                    intent =  new Intent(context, SinquerimBeach.class);
                    break;

                case 10:
                    intent =  new Intent(context, DudhsagarWaterfalls.class);
                    break;

                case 11:
                    intent =  new Intent(context, MollemNationalPark.class);
                    break;

                case 12:
                    intent =  new Intent(context, NetravaliWildlifeSanctuary.class);
                    break;

                default:
                    intent =  new Intent(context, Goa.class);
                    break;
            }
            context.startActivity(intent);


        }
    }
}
