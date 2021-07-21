package com.example.comapapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class UbicacionActivity extends AppCompatActivity {

    Fragment mapa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubicacion);

        mapa = new MiUbicacionFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.mapaContenedor, mapa).commit();
    }
}