package com.trabalhomobile.recicleview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.trabalhomobile.R;
import com.trabalhomobile.ui.TelaDetalhesPalestra;

import java.io.Serializable;
import java.util.List;

public class PalestraAdapter extends RecyclerView.Adapter<PalestraViewHolder> {

    Context context;
    List<Palestra> palestraList;

    public PalestraAdapter(Context context, List<Palestra> palestraList) {
        this.context = context;
        this.palestraList = palestraList;
    }

    @NonNull
    @Override
    public PalestraViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PalestraViewHolder(LayoutInflater.from(context).inflate(R.layout.view_palestra,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PalestraViewHolder holder, int position) {
        holder.titulo.setText(palestraList.get(position).getNome());
        holder.horario.setText(palestraList.get(position).getHora());
        holder.data.setText(palestraList.get(position).getData());
        holder.btnVerDetalhes.setOnClickListener(v -> {
            Intent intent = new Intent(context, TelaDetalhesPalestra.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra("palestra", (Serializable) palestraList.get(position));
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return palestraList.size();
    }
}
