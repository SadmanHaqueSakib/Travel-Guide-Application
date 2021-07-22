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

import com.example.travelmania.Andaman;
import com.example.travelmania.BarefootHavelockIsland;
import com.example.travelmania.Delhi;
import com.example.travelmania.HavelockIsland;
import com.example.travelmania.HyattRegency;
import com.example.travelmania.MunjohOceanResortHavelockIsland;
import com.example.travelmania.R;
import com.example.travelmania.SeaShellNeil;
import com.example.travelmania.ShangriLasEros;
import com.example.travelmania.TheLeelaPalace;
import com.example.travelmania.TheLodhi;
import com.example.travelmania.TheOberoi;
import com.example.travelmania.TheTajMahal;
import com.example.travelmania.TsgTheBlueHavelockIsland;
import com.example.travelmania.WelcomhotelItcHotels;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;

public class horizontalAndamanHotelsAdapter extends RecyclerView.Adapter<horizontalAndamanHotelsAdapter.horizontalViewHolder>  {

    ArrayList<horizontalhelper> horizontalhotelhelpers;
    private Context context;

    public horizontalAndamanHotelsAdapter(ArrayList<horizontalhelper> horizontalhotelhelpers) {
        this.horizontalhotelhelpers = horizontalhotelhelpers;
    }

    @NonNull
    @Override
    public horizontalAndamanHotelsAdapter.horizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontalrecyclerdesign, parent, false);
        return new horizontalAndamanHotelsAdapter.horizontalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull horizontalAndamanHotelsAdapter.horizontalViewHolder holder, int position) {

        horizontalhelper phonehelper = horizontalhotelhelpers.get(position);
        holder.image.setImageResource(phonehelper.getImage());
        holder.title.setText(phonehelper.getTitle());

    }

    @Override
    public int getItemCount() {
        return horizontalhotelhelpers.size();
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
                    intent =  new Intent(context, BarefootHavelockIsland.class);
                    break;

                case 1:
                    intent =  new Intent(context, SeaShellNeil.class);
                    break;

                case 2:
                    intent =  new Intent(context, MunjohOceanResortHavelockIsland.class);
                    break;

                case 3:
                    intent =  new Intent(context, WelcomhotelItcHotels.class);
                    break;

                case 4:
                    intent =  new Intent(context, TsgTheBlueHavelockIsland.class);
                    break;


                default:
                    intent =  new Intent(context, Andaman.class);
                    break;
            }
            context.startActivity(intent);
        }
    }
}
