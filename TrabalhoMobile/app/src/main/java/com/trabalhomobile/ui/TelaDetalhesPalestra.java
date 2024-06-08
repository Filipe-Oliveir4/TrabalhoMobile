package com.trabalhomobile.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.trabalhomobile.R;
import com.trabalhomobile.recicleview.Palestra;

public class TelaDetalhesPalestra extends AppCompatActivity {
    TextView titulo;
    TextView descricao;
    Button verPalestrante;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_detalhes_palestra);
        //Recupero a intent
        Intent intent = TelaDetalhesPalestra.this.getIntent();
        //Recupero a palestra
        Palestra palestra = (Palestra) intent.getSerializableExtra("palestra");
        //Recupero os elementos da tela
        titulo = findViewById(R.id.telaDetalhesPalestras_textView_titulo);
        descricao = findViewById(R.id.telaDetalhesPalestras_textView_descricao);
        verPalestrante = findViewById(R.id.telaDetalhesPalestras_button_verPalestrante);
        //Seto os valores
        titulo.setText(palestra.getNome());
        descricao.setText(palestra.getDescricao()
        +"\n\nData: "+ palestra.getData()
        +"\nHorário: "+ palestra.getHora()
        +"\nLocal: "+ palestra.getLocal()
        +"\nTema: "+ palestra.getTema()
        +"\nNível: "+ palestra.getNivel()
        +"\nFormato: "+ palestra.getFormato());

    }
}
