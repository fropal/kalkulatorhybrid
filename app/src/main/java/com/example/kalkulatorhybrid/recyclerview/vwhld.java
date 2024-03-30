package com.example.kalkulatorhybrid.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kalkulatorhybrid.R;

public class vwhld extends RecyclerView.ViewHolder {
    ImageView ImVW;
    TextView name;
    TextView rumus;
    RelativeLayout relativeLayout;
    public vwhld (@NonNull View itemView) {
        super(itemView);
        ImVW = itemView.findViewById(R.id.ImageVW);
        name = itemView.findViewById(R.id.name);
        rumus = itemView.findViewById(R.id.rumus);
        relativeLayout = itemView.findViewById(R.id.utama);
    }
}