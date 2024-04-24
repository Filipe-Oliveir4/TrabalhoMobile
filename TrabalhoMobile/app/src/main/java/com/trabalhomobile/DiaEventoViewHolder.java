package com.trabalhomobile;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DiaEventoViewHolder extends RecyclerView.ViewHolder {
    TextView titulo;
    TextView corpo;
    public DiaEventoViewHolder(@NonNull View itemView) {
        super(itemView);
        titulo = itemView.findViewById(R.id.textViewTitulo);
        corpo = itemView.findViewById(R.id.textViewCorpo);
    }
}
