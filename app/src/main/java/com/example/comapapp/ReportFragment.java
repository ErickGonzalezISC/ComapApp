package com.example.comapapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class ReportFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public ReportFragment() {
        // Required empty public constructor
    }

    public static ReportFragment newInstance(String param1, String param2) {
        ReportFragment fragment = new ReportFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    RecyclerView recyclerView;
    RecyclerViewAdaptadorHome adaptador;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_report, container, false);
        recyclerView = view.findViewById(R.id.recyclerReportes);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        adaptador = new RecyclerViewAdaptadorHome(obtenerReportes());
        recyclerView.setAdapter(adaptador);

        return view;
    }
    public List<HomeModelo> obtenerReportes(){
        List<HomeModelo> tipos = new ArrayList<>();
        tipos.add(new HomeModelo("Presion","Falta de presion de agua",R.drawable.presion));
        tipos.add(new HomeModelo("Fugas","Tuverias rotas",R.drawable.fugas));
        tipos.add(new HomeModelo("Escasez","Falta de agua",R.drawable.escasez));
        tipos.add(new HomeModelo("Medidor","Robo de medidor",R.drawable.robo));

        return tipos;
    }
}