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
import com.example.travelmania.HiltonJaipur;
import com.example.travelmania.HolidayInnJaipurCityCentreHotel;
import com.example.travelmania.HyattRegency;
import com.example.travelmania.Jaipur;
import com.example.travelmania.JaipurMarriottHotel;
import com.example.travelmania.R;
import com.example.travelmania.RadissonBluJaipur;
import com.example.travelmania.ShangriLasEros;
import com.example.travelmania.TheLeelaPalace;
import com.example.travelmania.TheLodhi;
import com.example.travelmania.TheOberoi;
import com.example.travelmania.TheTajMahal;
import com.example.travelmania.TridentJaipur;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;

public class horizontalJaipurHotelsAdapter extends RecyclerView.Adapter<horizontalJaipurHotelsAdapter.horizontalViewHolder>  {

    ArrayList<horizontalhelper> horizontalhotelhelpers;
    private Context context;

    public horizontalJaipurHotelsAdapter(ArrayList<horizontalhelper> horizontalhotelhelpers) {
        this.horizontalhotelhelpers = horizontalhotelhelpers;
    }

    @NonNull
    @Override
    public horizontalJaipurHotelsAdapter.horizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontalrecyclerdesign, parent, false);
        return new horizontalJaipurHotelsAdapter.horizontalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull horizontalJaipurHotelsAdapter.horizontalViewHolder holder, int position) {

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
                    intent =  new Intent(context, HiltonJaipur.class);
                    break;

                case 1:
                    intent =  new Intent(context, HolidayInnJaipurCityCentreHotel.class);
                    break;

                case 2:
                    intent =  new Intent(context, JaipurMarriottHotel.class);
                    break;

                case 3:
                    intent =  new Intent(context, RadissonBluJaipur.class);
                    break;

                case 4:
                    intent =  new Intent(context, TridentJaipur.class);
                    break;


                default:
                    intent =  new Intent(context, Jaipur.class);
                    break;
            }
            context.startActivity(intent);
        }
    }
}
