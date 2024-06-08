package com.trabalhomobile.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.trabalhomobile.R;
import com.trabalhomobile.SemocService;
import com.trabalhomobile.recicleview.MiniCursos;
import com.trabalhomobile.recicleview.Palestra;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TelaInicial extends AppCompatActivity {

    Button btnPalestras;
    Button btnMinicursos;
    List<Palestra> palestras = new ArrayList<>();
    List<MiniCursos> miniCursos = new ArrayList<>();
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_inicial);
        //Instacio o retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://raw.githubusercontent.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        //Instacio o serviço
        SemocService service = retrofit.create(SemocService.class);

        //Preencho a lista de palestras
        service.listPalestra().enqueue(new Callback<List<Palestra>>() {
            @Override
            public void onResponse(Call<List<Palestra>> call, Response<List<Palestra>> response) {
                palestras = response.body();

            }

            @Override
            public void onFailure(Call<List<Palestra>> call, Throwable throwable) {

            }
        });

        service.listMinicursos().enqueue(new Callback<List<MiniCursos>>() {
            @Override
            public void onResponse(Call<List<MiniCursos>> call, Response<List<MiniCursos>> response) {
                miniCursos = response.body();
            }

            @Override
            public void onFailure(Call<List<MiniCursos>> call, Throwable throwable) {

            }});


            //Recupero os botões
        btnPalestras = findViewById(R.id.telaInicial_button_Palestras);
        btnMinicursos = findViewById(R.id.telaInicial_button_miniCursos);

        //Seto o evento de click
        btnPalestras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Chamo a tela de palestras
                Intent intent = new Intent(TelaInicial.this, TelaPalestras.class);
                intent.putExtra("palestras", (Serializable) palestras);
                startActivity(intent);
            }
        });
        btnMinicursos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Chamo a tela de minicursos
                Intent intent = new Intent(TelaInicial.this, TelaMinicursos.class);
                intent.putExtra("minicursos", (Serializable) miniCursos);
                startActivity(intent);
            }
        });
    }
}
