package com.trabalhomobile.recicleview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.trabalhomobile.R;
import com.trabalhomobile.ui.TelaDetalhesMinicursos;

import java.io.Serializable;
import java.util.List;

public class MinicursosAdapter extends RecyclerView.Adapter<MiniCursosViewHolder>{

    Context context;
    List<MiniCursos> minicursosLists;

    public MinicursosAdapter(Context context, List<MiniCursos>miniCursos) {
        this.context = context;
        this.minicursosLists = miniCursos;
    }


    @NonNull
    @Override
    public MiniCursosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MiniCursosViewHolder(LayoutInflater.from(context).inflate(R.layout.view_minicursos,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MiniCursosViewHolder holder, int position) {
        holder.titulo.setText(minicursosLists.get(position).getNome());
        holder.horario.setText(minicursosLists.get(position).getHora());
        holder.data.setText(minicursosLists.get(position).getData());
        holder.btnVerDetalhes.setOnClickListener(v -> {
            Intent intent = new Intent(context, TelaDetalhesMinicursos.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra("minicurso", (Serializable) minicursosLists.get(position));
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return minicursosLists.size();
    }
}
