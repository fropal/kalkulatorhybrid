package com.example.kalkulatorhybrid.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.kalkulatorhybrid.recyclerview.SelectListen;
import com.example.kalkulatorhybrid.recyclerview.model_kalkulator;
import com.example.kalkulatorhybrid.recyclerview.my_adapter;
import com.example.kalkulatorhybrid.Activity3D.activity_balok;
import com.example.kalkulatorhybrid.Activity3D.Activity_bola;
import com.example.kalkulatorhybrid.Activity3D.Activity_kubus;
import com.example.kalkulatorhybrid.Activity3D.Activity_tabung;
import com.example.kalkulatorhybrid.R;
import com.example.kalkulatorhybrid.recyclerview.model_kalkulator;
import com.example.kalkulatorhybrid.recyclerview.SelectListen;
import com.example.kalkulatorhybrid.recyclerview.my_adapter;

import java.util.ArrayList;
import java.util.List;


public class Fragment_3D extends Fragment implements SelectListen {

    public Fragment_3D() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View RootView = inflater.inflate(R.layout.fragment_3d, container, false);
        RecyclerView recyclerView = RootView.findViewById(R.id.recycl);
        List<model_kalkulator> shape = new ArrayList<>();

        shape.add( new model_kalkulator("Kubus", "6 x (Sisi X Sisi)" ,R.drawable.cube));
        shape.add( new model_kalkulator("Balok", "2 x (pl + lt + pt)" ,R.drawable.cube));
        shape.add( new model_kalkulator("Tabung", "t" ,R.drawable.cube));
        shape.add( new model_kalkulator("Bola", "t" ,R.drawable.cube));

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new my_adapter(getActivity(), shape, this));
        return RootView;
    }

    @Override
    public void OnKlik(model_kalkulator holding) {
        String nama = holding.getNama();
        Toast.makeText(getActivity(), nama, Toast.LENGTH_SHORT).show();



    }
}