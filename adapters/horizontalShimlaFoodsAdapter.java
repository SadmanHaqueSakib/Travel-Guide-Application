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

import com.example.travelmania.BarbequeFood;
import com.example.travelmania.ButterChicken;
import com.example.travelmania.ChickenTikkaMasala;
import com.example.travelmania.CholaBhatura;
import com.example.travelmania.DaalMakhani;
import com.example.travelmania.DaulatKiChaatJalebis;
import com.example.travelmania.Delhi;
import com.example.travelmania.Kabab;
import com.example.travelmania.Momos;
import com.example.travelmania.MuttonTikka;
import com.example.travelmania.Omlete;
import com.example.travelmania.Paan;
import com.example.travelmania.Pakodas;
import com.example.travelmania.Parantha;
import com.example.travelmania.Paratha;
import com.example.travelmania.R;
import com.example.travelmania.Shimla;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;

public class horizontalShimlaFoodsAdapter extends RecyclerView.Adapter<horizontalShimlaFoodsAdapter.horizontalViewHolder>  {

    ArrayList<horizontalhelper> horizontalfoodhelpers;
    private Context context;

    public horizontalShimlaFoodsAdapter(ArrayList<horizontalhelper> horizontalfoodhelpers) {
        this.horizontalfoodhelpers = horizontalfoodhelpers;
    }

    @NonNull
    @Override
    public horizontalShimlaFoodsAdapter.horizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontalrecyclerdesign, parent, false);
        return new horizontalShimlaFoodsAdapter.horizontalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull horizontalShimlaFoodsAdapter.horizontalViewHolder holder, int position) {

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
                    intent =  new Intent(context, MuttonTikka.class);
                    break;

                case 1:
                    intent =  new Intent(context, Momos.class);
                    break;

                case 2:
                    intent =  new Intent(context, Omlete.class);
                    break;

                case 3:
                    intent =  new Intent(context, Pakodas.class);
                    break;

                case 4:
                    intent =  new Intent(context, Kabab.class);
                    break;

                case 5:
                    intent =  new Intent(context, ChickenTikkaMasala.class);
                    break;

                case 6:
                    intent =  new Intent(context, Paratha.class);
                    break;

                case 7:
                    intent =  new Intent(context, BarbequeFood.class);
                    break;

                default:
                    intent =  new Intent(context, Shimla.class);
                    break;
            }
            context.startActivity(intent);
        }
    }
}
