package com.example.comapapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdaptadorHome extends RecyclerView.Adapter<RecyclerViewAdaptadorHome.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView titulo, descripcion;
        private ImageView foto;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo = (TextView)itemView.findViewById(R.id.txt_titulo);
            descripcion = (TextView)itemView.findViewById(R.id.txt_descripcion);
            foto = (ImageView)itemView.findViewById(R.id.imagenInicio);
        }

    }
    public List<HomeModelo> listaInicio;

    public RecyclerViewAdaptadorHome(List<HomeModelo> listaInicio) {
        this.listaInicio = listaInicio;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_inicio,parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.titulo.setText(listaInicio.get(position).getTitulo());
        holder.descripcion.setText(listaInicio.get(position).getDescripcion());
        holder.foto.setImageResource(listaInicio.get(position).getFotoHome());
    }

    @Override
    public int getItemCount() {
        return listaInicio.size();
    }
}
