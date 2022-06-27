package com.amadeusryanwijayasetiawan.ajr_0237;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.amadeusryanwijayasetiawan.ajr_0237.model.Promo;

public class RVPromoAdapter extends RecyclerView.Adapter<RVPromoAdapter.viewHolder>{
    private final Promo[] listPromo;

    public class viewHolder extends RecyclerView.ViewHolder{
        TextView tvKodePromo, tvKeterangan;

        public viewHolder(@NonNull View itemView){
            super(itemView);
            tvKodePromo = itemView.findViewById(R.id.tvKodePromo);
            tvKeterangan = itemView.findViewById(R.id.tvKeterangan);
        }
    }

    RVPromoAdapter(Promo[] data){
        listPromo = data;
    }

    @NonNull
    @Override
    public RVPromoAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        return new viewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item_promo,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RVPromoAdapter.viewHolder holder, int position){
        holder.tvKodePromo.setText(listPromo[position].getKode_promo());
        holder.tvKeterangan.setText(listPromo[position].getKeterangan());
    }

    @Override
    public int getItemCount(){
        return listPromo.length;
    }
}
