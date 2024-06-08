package com.trabalhomobile.recicleview;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.trabalhomobile.R;

public class MiniCursosViewHolder extends RecyclerView.ViewHolder {
    TextView titulo;
    TextView data;
    TextView horario;
    Button btnVerDetalhes;
    public MiniCursosViewHolder(@NonNull View itemView) {
        super(itemView);
        titulo = itemView.findViewById(R.id.tituloDoMinicurso_viewMinicurso);
        data = itemView.findViewById(R.id.dataDoMinicurso_viewMinicurso);
        horario = itemView.findViewById(R.id.horarioDoMinicurso_viewMinicurso);
        btnVerDetalhes = itemView.findViewById(R.id.buttonVerDetalhes_viewMinicurso);
    }
}
