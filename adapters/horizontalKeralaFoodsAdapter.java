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

import com.example.travelmania.AppamwithStew;
import com.example.travelmania.ButterChicken;
import com.example.travelmania.CholaBhatura;
import com.example.travelmania.DaalMakhani;
import com.example.travelmania.DaulatKiChaatJalebis;
import com.example.travelmania.Delhi;
import com.example.travelmania.Idiyappam;
import com.example.travelmania.Kabab;
import com.example.travelmania.Kerala;
import com.example.travelmania.KeralaPrawnCurry;
import com.example.travelmania.KeralaStyleFishMolee;
import com.example.travelmania.MalabarParota;
import com.example.travelmania.Momos;
import com.example.travelmania.NaadanBeefFry;
import com.example.travelmania.NadanKozhiVaruthathu;
import com.example.travelmania.Paan;
import com.example.travelmania.Pakodas;
import com.example.travelmania.Parantha;
import com.example.travelmania.PuttuKadalaCurry;
import com.example.travelmania.R;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;

public class horizontalKeralaFoodsAdapter extends RecyclerView.Adapter<horizontalKeralaFoodsAdapter.horizontalViewHolder>  {

    ArrayList<horizontalhelper> horizontalfoodhelpers;
    private Context context;

    public horizontalKeralaFoodsAdapter(ArrayList<horizontalhelper> horizontalfoodhelpers) {
        this.horizontalfoodhelpers = horizontalfoodhelpers;
    }

    @NonNull
    @Override
    public horizontalKeralaFoodsAdapter.horizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontalrecyclerdesign, parent, false);
        return new horizontalKeralaFoodsAdapter.horizontalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull horizontalKeralaFoodsAdapter.horizontalViewHolder holder, int position) {

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
                    intent =  new Intent(context, PuttuKadalaCurry.class);
                    break;

                case 1:
                    intent =  new Intent(context, AppamwithStew.class);
                    break;

                case 2:
                    intent =  new Intent(context, Idiyappam.class);
                    break;

                case 3:
                    intent =  new Intent(context, NadanKozhiVaruthathu.class);
                    break;

                case 4:
                    intent =  new Intent(context, NaadanBeefFry.class);
                    break;

                case 5:
                    intent =  new Intent(context, KeralaPrawnCurry.class);
                    break;

                case 6:
                    intent =  new Intent(context, MalabarParota.class);
                    break;

                case 7:
                    intent =  new Intent(context, KeralaStyleFishMolee.class);
                    break;


                default:
                    intent =  new Intent(context, Kerala.class);
                    break;
            }
            context.startActivity(intent);
        }
    }
}
