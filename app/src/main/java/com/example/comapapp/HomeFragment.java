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

public class HomeFragment extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    RecyclerView recyclerView;
    RecyclerViewAdaptadorHome adaptador;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = view.findViewById(R.id.recyclerInicio);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        adaptador = new RecyclerViewAdaptadorHome(obtenerReportes());
        recyclerView.setAdapter(adaptador);

        return view;
    }
    public List<HomeModelo> obtenerReportes(){
        List<HomeModelo> reporte = new ArrayList<>();
        reporte.add(new HomeModelo("Pago de adeudo","Consultar su adeudo",R.drawable.factura));
        reporte.add(new HomeModelo("Factura electronica","Tramita su factura",R.drawable.factura));
        reporte.add(new HomeModelo("Historial","Historial de pagos",R.drawable.historial));
        reporte.add(new HomeModelo("Simulador","Calcular su tarifa",R.drawable.simulador));
        reporte.add(new HomeModelo("Contrato","Agregar contrato",R.drawable.contrato));

        return reporte;
    }
}