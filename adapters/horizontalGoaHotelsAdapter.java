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

import com.example.travelmania.FairfieldbyMarriottGoa;
import com.example.travelmania.Goa;
import com.example.travelmania.GoaMarriottResortSpa;
import com.example.travelmania.HotelGalaxyLadakh;
import com.example.travelmania.HotelLagunaAnjuna;
import com.example.travelmania.Ladakh;
import com.example.travelmania.PrazeresResort;
import com.example.travelmania.R;
import com.example.travelmania.TajFortAguadaResortSpa;
import com.example.travelmania.TheFortuneResort;
import com.example.travelmania.TheGrandDragonLadakh;
import com.example.travelmania.YarabTso;
import com.example.travelmania.ZostelLeh;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;

public class horizontalGoaHotelsAdapter extends RecyclerView.Adapter<horizontalGoaHotelsAdapter.horizontalViewHolder>  {

    ArrayList<horizontalhelper> horizontalhotelhelpers;
    private Context context;

    public horizontalGoaHotelsAdapter(ArrayList<horizontalhelper> horizontalhotelhelpers) {
        this.horizontalhotelhelpers = horizontalhotelhelpers;
    }

    @NonNull
    @Override
    public horizontalGoaHotelsAdapter.horizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontalrecyclerdesign, parent, false);
        return new horizontalGoaHotelsAdapter.horizontalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull horizontalGoaHotelsAdapter.horizontalViewHolder holder, int position) {

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
                    intent =  new Intent(context, FairfieldbyMarriottGoa.class);
                    break;

                case 1:
                    intent =  new Intent(context, GoaMarriottResortSpa.class);
                    break;

                case 2:
                    intent =  new Intent(context, PrazeresResort.class);
                    break;

                case 3:
                    intent =  new Intent(context, HotelLagunaAnjuna.class);
                    break;

                case 4:
                    intent =  new Intent(context, TajFortAguadaResortSpa.class);
                    break;

                default:
                    intent =  new Intent(context, Goa.class);
                    break;
            }
            context.startActivity(intent);
        }
    }
}
