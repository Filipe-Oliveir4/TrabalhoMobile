package com.trabalhomobile.recicleview;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.trabalhomobile.ui.TelaDetalhesPalestra;
import com.trabalhomobile.R;

import java.io.Serializable;

public class PalestraViewHolder extends RecyclerView.ViewHolder {
    TextView titulo;
    TextView data;
    TextView horario;
    Button btnVerDetalhes;
    public PalestraViewHolder(@NonNull View itemView) {
        super(itemView);
        titulo = itemView.findViewById(R.id.tituloDaPalestra_viewPalestra);
        data = itemView.findViewById(R.id.dataDaPalestra_viewPalestra);
        horario = itemView.findViewById(R.id.horarioDaPalestra_viewPalestra);
        btnVerDetalhes = itemView.findViewById(R.id.buttonVerDetalhes_viewPalestra);

    }
}
