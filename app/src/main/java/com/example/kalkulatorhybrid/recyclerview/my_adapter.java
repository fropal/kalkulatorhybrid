package com.example.kalkulatorhybrid.recyclerview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.kalkulatorhybrid.R;

import java.util.List;


public class my_adapter extends RecyclerView.Adapter<vwhld> {

    Context context;
    List<model_kalkulator> items;
    SelectListen selectListen;

    public my_adapter(Context context, List<model_kalkulator> items, SelectListen selectListen) {
        this.context = context;
        this.items = items;
        this.selectListen = selectListen;
    }

    @NonNull
    @Override
    public vwhld onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new vwhld(LayoutInflater.from(context).inflate(R.layout.recyclerview_layout,parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull vwhld holder, @SuppressLint("RecyclerView") int position) {
        holder.name.setText(items.get(position).getNama());
        holder.rumus.setText(items.get(position).getRumus());
        holder.ImVW.setImageResource(items.get(position).getImg());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectListen.OnKlik(items.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}