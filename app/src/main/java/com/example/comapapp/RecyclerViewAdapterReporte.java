package com.example.comapapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapterReporte extends RecyclerView.Adapter<RecyclerViewAdapterReporte.ViewHolder> {
    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView titulo, descripcion;
        private ImageView foto;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo = (TextView)itemView.findViewById(R.id.txt_titulo_reporte);
            descripcion = (TextView)itemView.findViewById(R.id.txt_descripcion_reporte);
            foto = (ImageView)itemView.findViewById(R.id.imagenReporte);
        }
    }
    public List<ReporteModelo> listaReporte;

    public RecyclerViewAdapterReporte(List<ReporteModelo> listaReporte) {
        this.listaReporte = listaReporte;
    }

    @NonNull
    @Override
    public RecyclerViewAdapterReporte.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_inicio,parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapterReporte.ViewHolder holder, int position) {
        holder.titulo.setText(listaReporte.get(position).getTitulo());
        holder.descripcion.setText(listaReporte.get(position).getDescripcion());
        holder.foto.setImageResource(listaReporte.get(position).getFotoReporte());
    }

    @Override
    public int getItemCount() {
        return listaReporte.size();
    }
}
