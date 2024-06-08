package com.trabalhomobile.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.trabalhomobile.R;
import com.trabalhomobile.recicleview.MiniCursos;
import com.trabalhomobile.recicleview.MinicursosAdapter;


import java.util.List;

public class TelaMinicursos extends AppCompatActivity {
    Intent intent;
    List<MiniCursos> minicursos;
    RecyclerView recyclerViewPalestras;
    MinicursosAdapter minicursosAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_minicursos);
        //Recupero a intent
        intent = TelaMinicursos.this.getIntent();

        //Recupero a lista de palestras
        minicursos = (List<MiniCursos>) intent.getSerializableExtra("minicursos");
        for (MiniCursos minicurso : minicursos) {
            System.out.println(minicurso.getNome());
        }
        //Instancio o adapter
        minicursosAdapter = new MinicursosAdapter(getApplicationContext(), minicursos);

        //crio o recicle view
        recyclerViewPalestras = (RecyclerView) findViewById(R.id.recyclerView_telaMinicurso);
        recyclerViewPalestras.setAdapter(minicursosAdapter);
        recyclerViewPalestras.setHasFixedSize(true);
        recyclerViewPalestras.setLayoutManager(new LinearLayoutManager(this));
    }
}
