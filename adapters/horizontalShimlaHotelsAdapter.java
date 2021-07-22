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

import com.example.travelmania.Delhi;
import com.example.travelmania.HotelGalaxyLadakh;
import com.example.travelmania.HyattRegency;
import com.example.travelmania.JaipurMarriottHotel;
import com.example.travelmania.PrazeresResort;
import com.example.travelmania.R;
import com.example.travelmania.ShangriLasEros;
import com.example.travelmania.Shimla;
import com.example.travelmania.TheFortuneResort;
import com.example.travelmania.TheLeelaPalace;
import com.example.travelmania.TheLodhi;
import com.example.travelmania.TheOberoi;
import com.example.travelmania.TheTajMahal;
import com.example.travelmania.WelcomhotelItcHotels;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;

public class horizontalShimlaHotelsAdapter extends RecyclerView.Adapter<horizontalShimlaHotelsAdapter.horizontalViewHolder>  {

    ArrayList<horizontalhelper> horizontalhotelhelpers;
    private Context context;

    public horizontalShimlaHotelsAdapter(ArrayList<horizontalhelper> horizontalhotelhelpers) {
        this.horizontalhotelhelpers = horizontalhotelhelpers;
    }

    @NonNull
    @Override
    public horizontalShimlaHotelsAdapter.horizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontalrecyclerdesign, parent, false);
        return new horizontalShimlaHotelsAdapter.horizontalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull horizontalShimlaHotelsAdapter.horizontalViewHolder holder, int position) {

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
                    intent =  new Intent(context, WelcomhotelItcHotels.class);
                    break;

                case 1:
                    intent =  new Intent(context, JaipurMarriottHotel.class);
                    break;

                case 2:
                    intent =  new Intent(context, TheFortuneResort.class);
                    break;

                case 3:
                    intent =  new Intent(context, HotelGalaxyLadakh.class);
                    break;

                case 4:
                    intent =  new Intent(context, PrazeresResort.class);
                    break;


                default:
                    intent =  new Intent(context, Shimla.class);
                    break;
            }
            context.startActivity(intent);
        }
    }
}
