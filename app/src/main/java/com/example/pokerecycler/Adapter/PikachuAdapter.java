package com.example.pokerecycler.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pokerecycler.Models.Pikachu;
import com.example.pokerecycler.R;

import java.util.List;

public class PikachuAdapter<ViewHolder> extends RecyclerView.Adapter<PikachuAdapter.ViewHolder>{
    private List<Pikachu> pikachus;

    public PikachuAdapter(List<Pikachu> pikachus) {
        this.pikachus = pikachus;
    }

    @NonNull
    @Override
    public PikachuAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater ly = LayoutInflater.from(parent.getContext());
        View v = ly.inflate(R.layout.pokemonitems,parent,false);

        return new PikachuAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PikachuAdapter.ViewHolder holder, int position) {
        Pikachu p = pikachus.get(position);
        holder.setdata(p);
    }

    @Override
    public int getItemCount() {
        return pikachus.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtchapeteizq;
        TextView txtchapeteder;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtchapeteizq = itemView.findViewById(R.id.listal1);
            txtchapeteder = itemView.findViewById(R.id.listal2);
        }

        public void setdata(Pikachu p) {
            txtchapeteizq.setText(p.getChapeteizq().getColor());
            txtchapeteder.setText(p.getChapeteder().getColor());
        }
    }
}
