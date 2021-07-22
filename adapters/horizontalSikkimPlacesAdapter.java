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

import com.example.travelmania.ChadarTrek;
import com.example.travelmania.DiskitMonastery;
import com.example.travelmania.Gangtok;
import com.example.travelmania.Gurudongmar;
import com.example.travelmania.JawaharlalNehruBotanicalGarden;
import com.example.travelmania.Kargil;
import com.example.travelmania.KhardungLaPass;
import com.example.travelmania.LachulungLa;
import com.example.travelmania.Lachung;
import com.example.travelmania.Ladakh;
import com.example.travelmania.MarkhaValleyTrek;
import com.example.travelmania.MoonlandLamayaru;
import com.example.travelmania.Namchi;
import com.example.travelmania.NamgyalInstituteTibetology;
import com.example.travelmania.NamgyalTsemoGompa;
import com.example.travelmania.NathulaPass;
import com.example.travelmania.NubraValley;
import com.example.travelmania.Nyoma;
import com.example.travelmania.PangongTsoLake;
import com.example.travelmania.Pelling;
import com.example.travelmania.R;
import com.example.travelmania.Ravangla;
import com.example.travelmania.RohtangPass;
import com.example.travelmania.RoyalLehPalace;
import com.example.travelmania.RumtekMonastery;
import com.example.travelmania.Sikkim;
import com.example.travelmania.SindhuDarshanFestival;
import com.example.travelmania.TanglangLa;
import com.example.travelmania.ThikseyGompa;
import com.example.travelmania.TsoKar;
import com.example.travelmania.TsoMoririLake;
import com.example.travelmania.TsomgoLake;
import com.example.travelmania.Yuksom;
import com.example.travelmania.YumthangValley;
import com.example.travelmania.ZanskarValley;
import com.example.travelmania.ZorawarFort;
import com.example.travelmania.Zuluk;
import com.example.travelmania.helpers.horizontalhelper;

import java.util.ArrayList;

public class horizontalSikkimPlacesAdapter extends RecyclerView.Adapter<horizontalSikkimPlacesAdapter.horizontalViewHolder>  {

    ArrayList<horizontalhelper> horizontalhelpers;
    private Context context;

    public horizontalSikkimPlacesAdapter(ArrayList<horizontalhelper> horizontalhelpers) {
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
                    intent =  new Intent(context, Gangtok.class);
                    break;

                case 1:
                    intent =  new Intent(context, Yuksom.class);
                    break;

                case 2:
                    intent =  new Intent(context, TsomgoLake.class);
                    break;

                case 3:
                    intent =  new Intent(context, NathulaPass.class);
                    break;

                case 4:
                    intent =  new Intent(context, Pelling.class);
                    break;

                case 5:
                    intent =  new Intent(context, Lachung.class);
                    break;

                case 6:
                    intent =  new Intent(context, Ravangla.class);
                    break;

                case 7:
                    intent =  new Intent(context, RumtekMonastery.class);
                    break;

                case 8:
                    intent =  new Intent(context, Namchi.class);
                    break;

                case 9:
                    intent =  new Intent(context, JawaharlalNehruBotanicalGarden.class);
                    break;

                case 10:
                    intent =  new Intent(context, Zuluk.class);
                    break;

                case 11:
                    intent =  new Intent(context, NamgyalInstituteTibetology.class);
                    break;

                case 12:
                    intent =  new Intent(context, YumthangValley.class);
                    break;

                case 13:
                    intent =  new Intent(context, Gurudongmar.class);
                    break;

                default:
                    intent =  new Intent(context, Sikkim.class);
                    break;
            }
            context.startActivity(intent);


        }
    }
}
