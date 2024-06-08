package com.trabalhomobile.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.trabalhomobile.R;
import com.trabalhomobile.recicleview.Palestra;
import com.trabalhomobile.recicleview.PalestraAdapter;

import java.util.List;

public class TelaPalestras extends AppCompatActivity {
    Intent intent;
    List<Palestra> minicursos;
    RecyclerView recyclerViewPalestras;
    PalestraAdapter palestraAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_paletras);
        //Recupero a intent
        intent = TelaPalestras.this.getIntent();

        //Recupero a lista de palestras
        minicursos = (List<Palestra>) intent.getSerializableExtra("palestras");
        for(Palestra p : minicursos){
            Log.i("logTeste",p.getNome());
        }
        //Instancio o adapter
        palestraAdapter = new PalestraAdapter(getApplicationContext(), minicursos);

        //crio o recicle view
        recyclerViewPalestras = (RecyclerView) findViewById(R.id.recyclerView_telaPalestra);
        recyclerViewPalestras.setAdapter(palestraAdapter);
        recyclerViewPalestras.setHasFixedSize(true);
        recyclerViewPalestras.setLayoutManager(new LinearLayoutManager(this));


    }
}
