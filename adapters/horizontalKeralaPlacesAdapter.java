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

import com.example.travelmania.Akshardham;
import com.example.travelmania.Alleppey;
import com.example.travelmania.Bekal;
import com.example.travelmania.ChhatarpurTemple;
import com.example.travelmania.Cochin;
import com.example.travelmania.Delhi;
import com.example.travelmania.FunNFoodVillage;
import com.example.travelmania.GurudwaraBanglaSahib;
import com.example.travelmania.Guruvayur;
import com.example.travelmania.HumayunsTomb;
import com.example.travelmania.Idukki;
import com.example.travelmania.IndiaGate;
import com.example.travelmania.JamaMasjid;
import com.example.travelmania.Kannur;
import com.example.travelmania.Kerala;
import com.example.travelmania.KidZania;
import com.example.travelmania.KingdomofDreams;
import com.example.travelmania.KizhunnaBeach;
import com.example.travelmania.Kollam;
import com.example.travelmania.Kovalam;
import com.example.travelmania.Kozhikode;
import com.example.travelmania.Kumarakom;
import com.example.travelmania.Kuttanad;
import com.example.travelmania.LodhiGarden;
import com.example.travelmania.LotusTemple;
import com.example.travelmania.Marari;
import com.example.travelmania.MehrauliArcheologicalPark;
import com.example.travelmania.Munnar;
import com.example.travelmania.MunroeIsland;
import com.example.travelmania.Nelliampathy;
import com.example.travelmania.Palakkad;
import com.example.travelmania.Ponmudi;
import com.example.travelmania.Poovar;
import com.example.travelmania.PuranaQila;
import com.example.travelmania.QutubMinar;
import com.example.travelmania.R;
import com.example.travelmania.RashtrapratiBhaban;
import com.example.travelmania.RedFort;
import com.example.travelmania.SafdarjungsTomb;
import com.example.travelmania.SnowWorld;
import com.example.travelmania.Vagamon;
import com.example.travelmania.Varkala;
import com.example.travelmania.Wayanad;
import com.example.travelmania.WestofWonderPark;
import com.example.travelmania.WorldsofWonder;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;

public class horizontalKeralaPlacesAdapter extends RecyclerView.Adapter<horizontalKeralaPlacesAdapter.horizontalViewHolder>  {

    ArrayList<horizontalhelper> horizontalhelpers;
    private Context context;

    public horizontalKeralaPlacesAdapter(ArrayList<horizontalhelper> horizontalhelpers) {
        this.horizontalhelpers = horizontalhelpers;
    }

    @NonNull
    @Override
    public horizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontalrecyclerdesign, parent, false);
        return new horizontalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull horizontalViewHolder holder, int position) {

        horizontalhelper phonehelper = horizontalhelpers.get(position);
        holder.image.setImageResource(phonehelper.getImage());
        holder.title.setText(phonehelper.getTitle());

    }

    @Override
    public int getItemCount() {
        return horizontalhelpers.size();
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
                    intent =  new Intent(context, Alleppey.class);
                    break;

                case 1:
                    intent =  new Intent(context, Wayanad.class);
                    break;

                case 2:
                    intent =  new Intent(context, Cochin.class);
                    break;

                case 3:
                    intent =  new Intent(context, Munnar.class);
                    break;

                case 4:
                    intent =  new Intent(context, Kumarakom.class);
                    break;

                case 5:
                    intent =  new Intent(context, Kovalam.class);
                    break;

                case 6:
                    intent =  new Intent(context, Kollam.class);
                    break;

                case 7:
                    intent =  new Intent(context, Vagamon.class);
                    break;

                case 8:
                    intent =  new Intent(context, Kozhikode.class);
                    break;

                case 9:
                    intent =  new Intent(context, Bekal.class);
                    break;

                case 10:
                    intent =  new Intent(context, Guruvayur.class);
                    break;

                case 11:
                    intent =  new Intent(context, Idukki.class);
                    break;

                case 12:
                    intent =  new Intent(context, Kannur.class);
                    break;

                case 13:
                    intent =  new Intent(context, KizhunnaBeach.class);
                    break;

                case 14:
                    intent =  new Intent(context, Kuttanad.class);
                    break;

                case 15:
                    intent =  new Intent(context, Marari.class);
                    break;

                case 16:
                    intent =  new Intent(context, MunroeIsland.class);
                    break;

                case 17:
                    intent =  new Intent(context, Nelliampathy.class);
                    break;

                case 18:
                    intent =  new Intent(context, Palakkad.class);
                    break;

                case 19:
                    intent =  new Intent(context, Ponmudi.class);
                    break;

                case 20:
                    intent =  new Intent(context, Poovar.class);
                    break;

                case 21:
                    intent =  new Intent(context, Varkala.class);
                    break;

                default:
                    intent =  new Intent(context, Kerala.class);
                    break;
            }
            context.startActivity(intent);


        }
    }
}
