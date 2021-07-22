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

import com.example.travelmania.ButterChicken;
import com.example.travelmania.CholaBhatura;
import com.example.travelmania.DaalMakhani;
import com.example.travelmania.DaulatKiChaatJalebis;
import com.example.travelmania.Delhi;
import com.example.travelmania.GolGappa;
import com.example.travelmania.Jaipur;
import com.example.travelmania.Kabab;
import com.example.travelmania.KathiRoll;
import com.example.travelmania.Momos;
import com.example.travelmania.MuttonTikka;
import com.example.travelmania.Omlete;
import com.example.travelmania.Paan;
import com.example.travelmania.Pakodas;
import com.example.travelmania.Parantha;
import com.example.travelmania.R;
import com.example.travelmania.SodaLimeWater;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;

public class horizontalJaipurFoodsAdapter extends RecyclerView.Adapter<horizontalJaipurFoodsAdapter.horizontalViewHolder>  {

    ArrayList<horizontalhelper> horizontalfoodhelpers;
    private Context context;

    public horizontalJaipurFoodsAdapter(ArrayList<horizontalhelper> horizontalfoodhelpers) {
        this.horizontalfoodhelpers = horizontalfoodhelpers;
    }

    @NonNull
    @Override
    public horizontalJaipurFoodsAdapter.horizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontalrecyclerdesign, parent, false);
        return new horizontalJaipurFoodsAdapter.horizontalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull horizontalJaipurFoodsAdapter.horizontalViewHolder holder, int position) {

        horizontalhelper phonehelper = horizontalfoodhelpers.get(position);
        holder.image.setImageResource(phonehelper.getImage());
        holder.title.setText(phonehelper.getTitle());

    }

    @Override
    public int getItemCount() {
        return horizontalfoodhelpers.size();
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
                    intent =  new Intent(context, GolGappa.class);
                    break;

                case 1:
                    intent =  new Intent(context, KathiRoll.class);
                    break;

                case 2:
                    intent =  new Intent(context, MuttonTikka.class);
                    break;

                case 3:
                    intent =  new Intent(context, Omlete.class);
                    break;

                case 4:
                    intent =  new Intent(context, SodaLimeWater.class);
                    break;

                default:
                    intent =  new Intent(context, Jaipur.class);
                    break;
            }
            context.startActivity(intent);
        }
    }
}
