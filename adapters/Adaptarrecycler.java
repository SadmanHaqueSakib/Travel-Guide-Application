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
import com.example.travelmania.Ladakh;
import com.example.travelmania.helpers.Datamodel;
import com.example.travelmania.Delhi;
import com.example.travelmania.Goa;
import com.example.travelmania.Hampi;
import com.example.travelmania.Jaipur;
import com.example.travelmania.Jaisalmer;
import com.example.travelmania.Kashmir;
import com.example.travelmania.Kaziranga;
import com.example.travelmania.Kerala;
import com.example.travelmania.Kolkata;
import com.example.travelmania.Meghalaya;
import com.example.travelmania.Mumbai;
import com.example.travelmania.Mysore;
import com.example.travelmania.R;
import com.example.travelmania.Rann_of_Kutch;
import com.example.travelmania.Rishikesh;
import com.example.travelmania.Shimla;
import com.example.travelmania.Sikkim;
import com.example.travelmania.Sundarbans;
import com.example.travelmania.Varanasi;

import java.util.ArrayList;

public class Adaptarrecycler extends RecyclerView.Adapter<Adaptarrecycler.myViewHolder> {

    ArrayList<Datamodel> dataholder;
    private Context context;

    public Adaptarrecycler(ArrayList<Datamodel> dataholder) {

        this.dataholder = dataholder;

    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view= inflater.from(parent.getContext())
                .inflate(R.layout.recyclerviewdesign,parent,false);
        myViewHolder holder= new myViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        Datamodel current= dataholder.get(position);
        holder.header.setText(dataholder.get(position).getHeader());
        holder.img.setImageResource(dataholder.get(position).getImage());

    }

    @Override
    public int getItemCount() {

        return dataholder.size();
    }


    class myViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView img;
        public TextView header;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            context=itemView.getContext();
            img=itemView.findViewById(R.id.hotel1);
            header=itemView.findViewById(R.id.t1);
            itemView.setClickable(true);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            final Intent intent;
            switch (getAbsoluteAdapterPosition()){
                case 0:
                    intent =  new Intent(context, Delhi.class);
                    break;

                case 1:
                    intent =  new Intent(context, Ladakh.class);
                    break;

                case 2:
                    intent =  new Intent(context, Goa.class);
                    break;

                case 3:
                    intent =  new Intent(context, Agra.class);
                    break;

                case 4:
                    intent =  new Intent(context, Kerala.class);
                    break;

                case 5:
                    intent =  new Intent(context, Jaipur.class);
                    break;

                case 6:
                    intent =  new Intent(context, Andaman.class);
                    break;

                case 7:
                    intent =  new Intent(context, Amritsar.class);
                    break;

                case 8:
                    intent =  new Intent(context, Kashmir.class);
                    break;

                case 9:
                    intent =  new Intent(context, Meghalaya.class);
                    break;

                case 10:
                    intent =  new Intent(context, Mysore.class);
                    break;

                case 11:
                    intent =  new Intent(context, Rann_of_Kutch.class);
                    break;

                case 12:
                    intent =  new Intent(context, Rishikesh.class);
                    break;

                case 13:
                    intent =  new Intent(context, Shimla.class);
                    break;

                case 14:
                    intent =  new Intent(context, Sikkim.class);
                    break;

                case 15:
                    intent =  new Intent(context, Varanasi.class);
                    break;

                default:
                    intent =  new Intent(context, Delhi.class);
                    break;
            }
            context.startActivity(intent);

        }
    }
}
