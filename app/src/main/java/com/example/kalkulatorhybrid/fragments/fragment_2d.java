package com.example.kalkulatorhybrid.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kalkulatorhybrid.Activity2D.lingkaran;
import com.example.kalkulatorhybrid.Activity2D.segitiga;
import com.example.kalkulatorhybrid.recyclerview.SelectListen;
import com.example.kalkulatorhybrid.recyclerview.model_kalkulator;
import com.example.kalkulatorhybrid.recyclerview.my_adapter;
import com.example.kalkulatorhybrid.Activity2D.persegipanjang;
import com.example.kalkulatorhybrid.Activity2D.kotak;
import com.example.kalkulatorhybrid.R;

import java.util.ArrayList;
import java.util.List;


public class fragment_2d extends Fragment implements SelectListen {

    public fragment_2d() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View RootView = inflater.inflate(R.layout.fragment_2d, container, false);
        RecyclerView recyclerView = RootView.findViewById(R.id.recycl);
        List<model_kalkulator> shape = new ArrayList<>();

        shape.add( new model_kalkulator("Kotak", "Sisi X Sisi" ,R.drawable.kotak,new kotak()));
        shape.add( new model_kalkulator("Persegi panjang", "Panjang x Lebar" ,R.drawable.kotak,new persegipanjang()));
        shape.add( new model_kalkulator("Segitiga", "1/2 x a x t" ,R.drawable.kotak,new segitiga()));
        shape.add( new model_kalkulator("Lingkaran", "π x r²" ,R.drawable.kotak,new lingkaran()));

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new my_adapter(getActivity(), shape, this));
        return RootView;
    }

    @Override
    public void OnKlik(model_kalkulator holding) {
        Intent I = new Intent(getContext(),holding.getActivity().getClass());
        startActivity(I);
    }

}