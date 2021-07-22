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

import com.example.travelmania.ApricotJam;
import com.example.travelmania.ButterChicken;
import com.example.travelmania.ButterTea;
import com.example.travelmania.Chhang;
import com.example.travelmania.Chhurpe;
import com.example.travelmania.Chhutagi;
import com.example.travelmania.CholaBhatura;
import com.example.travelmania.DaalMakhani;
import com.example.travelmania.DaulatKiChaatJalebis;
import com.example.travelmania.Delhi;
import com.example.travelmania.Kabab;
import com.example.travelmania.Khambir;
import com.example.travelmania.Ladakh;
import com.example.travelmania.Momos;
import com.example.travelmania.MomosLadakh;
import com.example.travelmania.Paan;
import com.example.travelmania.Pakodas;
import com.example.travelmania.Parantha;
import com.example.travelmania.R;
import com.example.travelmania.Skyu;
import com.example.travelmania.Thukpa;
import com.example.travelmania.Tingmo;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;

public class horizontalLadakhFoodsAdapter extends RecyclerView.Adapter<horizontalLadakhFoodsAdapter.horizontalViewHolder>  {

    ArrayList<horizontalhelper> horizontalfoodhelpers;
    private Context context;

    public horizontalLadakhFoodsAdapter(ArrayList<horizontalhelper> horizontalfoodhelpers) {
        this.horizontalfoodhelpers = horizontalfoodhelpers;
    }

    @NonNull
    @Override
    public horizontalLadakhFoodsAdapter.horizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontalrecyclerdesign, parent, false);
        return new horizontalLadakhFoodsAdapter.horizontalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull horizontalLadakhFoodsAdapter.horizontalViewHolder holder, int position) {

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
                    intent =  new Intent(context, MomosLadakh.class);
                    break;

                case 1:
                    intent =  new Intent(context, Thukpa.class);
                    break;

                case 2:
                    intent =  new Intent(context, Skyu.class);
                    break;

                case 3:
                    intent =  new Intent(context, Chhutagi.class);
                    break;

                case 4:
                    intent =  new Intent(context, Tingmo.class);
                    break;

                case 5:
                    intent =  new Intent(context, Chhurpe.class);
                    break;

                case 6:
                    intent =  new Intent(context, ButterTea.class);
                    break;

                case 7:
                    intent =  new Intent(context, Chhang.class);
                    break;

                case 8:
                    intent =  new Intent(context, Khambir.class);
                    break;

                case 9:
                    intent =  new Intent(context, ApricotJam.class);
                    break;

                default:
                    intent =  new Intent(context, Ladakh.class);
                    break;
            }
            context.startActivity(intent);
        }
    }
}
