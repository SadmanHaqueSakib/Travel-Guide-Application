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

import com.example.travelmania.Agra;
import com.example.travelmania.Amritsar;
import com.example.travelmania.Andaman;
import com.example.travelmania.Aurangabad;
import com.example.travelmania.Delhi;
import com.example.travelmania.Goa;
import com.example.travelmania.Hampi;
import com.example.travelmania.HyattRegency;
import com.example.travelmania.Jaipur;
import com.example.travelmania.Jaisalmer;
import com.example.travelmania.Kashmir;
import com.example.travelmania.Kaziranga;
import com.example.travelmania.Kerala;
import com.example.travelmania.Kolkata;
import com.example.travelmania.Ladakh;
import com.example.travelmania.Meghalaya;
import com.example.travelmania.Mumbai;
import com.example.travelmania.Mysore;
import com.example.travelmania.R;
import com.example.travelmania.Rann_of_Kutch;
import com.example.travelmania.Rishikesh;
import com.example.travelmania.ShangriLasEros;
import com.example.travelmania.Shimla;
import com.example.travelmania.Sikkim;
import com.example.travelmania.Sundarbans;
import com.example.travelmania.TheLeelaPalace;
import com.example.travelmania.TheLodhi;
import com.example.travelmania.TheOberoi;
import com.example.travelmania.TheTajMahal;
import com.example.travelmania.Varanasi;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;

public class horizontalHotelsAdapter extends RecyclerView.Adapter<horizontalHotelsAdapter.horizontalViewHolder>  {

    ArrayList<horizontalhelper> horizontalhotelhelpers;
    private Context context;

    public horizontalHotelsAdapter(ArrayList<horizontalhelper> horizontalhotelhelpers) {
        this.horizontalhotelhelpers = horizontalhotelhelpers;
    }

    @NonNull
    @Override
    public horizontalHotelsAdapter.horizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontalrecyclerdesign, parent, false);
        return new horizontalHotelsAdapter.horizontalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull horizontalHotelsAdapter.horizontalViewHolder holder, int position) {

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
                    intent =  new Intent(context, TheOberoi.class);
                    break;

                case 1:
                    intent =  new Intent(context, TheLeelaPalace.class);
                    break;

                case 2:
                    intent =  new Intent(context, TheLodhi.class);
                    break;

                case 3:
                    intent =  new Intent(context, TheTajMahal.class);
                    break;

                case 4:
                    intent =  new Intent(context, ShangriLasEros.class);
                    break;

                case 5:
                    intent =  new Intent(context, HyattRegency.class);
                    break;

                default:
                    intent =  new Intent(context, Delhi.class);
                    break;
            }
            context.startActivity(intent);
        }
    }
}
