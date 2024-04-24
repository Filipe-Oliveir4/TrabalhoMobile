package com.trabalhomobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DiaEventoAdapter extends RecyclerView.Adapter<DiaEventoViewHolder> {
    Context context;
    List<DiaEvento> diaEventoList;

    public DiaEventoAdapter(Context context, List<DiaEvento> diaEventoList) {
        this.context = context;
        this.diaEventoList = diaEventoList;
    }

    @NonNull
    @Override
    public DiaEventoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DiaEventoViewHolder(LayoutInflater.from(context).inflate(R.layout.dia_evento_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull DiaEventoViewHolder holder, int position) {
        holder.titulo.setText(diaEventoList.get(position).getTitulo());
        holder.corpo.setText(diaEventoList.get(position).getCorpo());
    }

    @Override
    public int getItemCount() {
        return diaEventoList.size();
    }
}
