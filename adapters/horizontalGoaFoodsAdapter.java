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

import com.example.travelmania.Bebinca;
import com.example.travelmania.ButterChicken;
import com.example.travelmania.CholaBhatura;
import com.example.travelmania.ChourisPao;
import com.example.travelmania.CrabXecXec;
import com.example.travelmania.DaalMakhani;
import com.example.travelmania.DaulatKiChaatJalebis;
import com.example.travelmania.Delhi;
import com.example.travelmania.Feni;
import com.example.travelmania.Goa;
import com.example.travelmania.GoanRedRice;
import com.example.travelmania.Kabab;
import com.example.travelmania.Kingfish;
import com.example.travelmania.Momos;
import com.example.travelmania.Paan;
import com.example.travelmania.Pakodas;
import com.example.travelmania.Parantha;
import com.example.travelmania.Poee;
import com.example.travelmania.PorkVindaloo;
import com.example.travelmania.PrawnBalchao;
import com.example.travelmania.R;
import com.example.travelmania.Sanna;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;

public class horizontalGoaFoodsAdapter extends RecyclerView.Adapter<horizontalGoaFoodsAdapter.horizontalViewHolder>  {

    ArrayList<horizontalhelper> horizontalfoodhelpers;
    private Context context;

    public horizontalGoaFoodsAdapter(ArrayList<horizontalhelper> horizontalfoodhelpers) {
        this.horizontalfoodhelpers = horizontalfoodhelpers;
    }

    @NonNull
    @Override
    public horizontalGoaFoodsAdapter.horizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontalrecyclerdesign, parent, false);
        return new horizontalGoaFoodsAdapter.horizontalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull horizontalGoaFoodsAdapter.horizontalViewHolder holder, int position) {

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
                    intent =  new Intent(context, PorkVindaloo.class);
                    break;

                case 1:
                    intent =  new Intent(context, CrabXecXec.class);
                    break;

                case 2:
                    intent =  new Intent(context, PrawnBalchao.class);
                    break;

                case 3:
                    intent =  new Intent(context, Sanna.class);
                    break;

                case 4:
                    intent =  new Intent(context, GoanRedRice.class);
                    break;

                case 5:
                    intent =  new Intent(context, ChourisPao.class);
                    break;

                case 6:
                    intent =  new Intent(context, Poee.class);
                    break;

                case 7:
                    intent =  new Intent(context, Kingfish.class);
                    break;

                case 8:
                    intent =  new Intent(context, Feni.class);
                    break;

                case 9:
                    intent =  new Intent(context, Bebinca.class);
                    break;

                default:
                    intent =  new Intent(context, Goa.class);
                    break;
            }
            context.startActivity(intent);
        }
    }
}
