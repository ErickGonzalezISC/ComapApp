package com.example.comapapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void mapa(View view){
        Intent intent = new Intent(this, UbicacionActivity.class);
        startActivity(intent);
    }
    public void siguiente(View view){
        Intent intent = new Intent(this, NavegacionActivity.class);
        startActivity(intent);

    }

    public void register(View view){

        Intent intent = new Intent(getApplicationContext(),MiUbicacionFragment.class);
        startActivity(intent);

    }

    public void siJala(View view){
        Toast.makeText(this, "Si funciona el viewText", Toast.LENGTH_SHORT).show();
    }
}