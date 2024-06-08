package com.trabalhomobile.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.trabalhomobile.R;
import com.trabalhomobile.recicleview.MiniCursos;

public class TelaDetalhesMinicursos extends AppCompatActivity {
    TextView titulo;
    TextView descricao;
    Button verPalestrante;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_detalhes_palestra);
        //Recupero a intent
        Intent intent = TelaDetalhesMinicursos.this.getIntent();
        //Recupero a palestra
        MiniCursos miniCursos = (MiniCursos) intent.getSerializableExtra("minicurso");
        //Recupero os elementos da tela
        titulo = findViewById(R.id.telaDetalhesPalestras_textView_titulo);
        descricao = findViewById(R.id.telaDetalhesPalestras_textView_descricao);
        verPalestrante = findViewById(R.id.telaDetalhesPalestras_button_verPalestrante);
        //Seto os valores
        titulo.setText(miniCursos.getNome());
        descricao.setText(miniCursos.getDescricao()
                +"\n\nData: "+miniCursos.getData()
                +"\nHorário: "+miniCursos.getHora()
                +"\nLocal: "+miniCursos.getLocal()
                +"\nTema: "+miniCursos.getTema()
                +"\nNível: "+miniCursos.getNivel()
                +"\nFormato: "+miniCursos.getFormato());

    }
}
