package com.trabalhomobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.trabalhomobile.ui.TelaInicial;
import com.trabalhomobile.ui.TelaPalestras;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_inicial);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://raw.githubusercontent.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Intent intent = new Intent(MainActivity.this, TelaInicial.class);
        startActivity(intent);
        SemocService service = retrofit.create(SemocService.class);
//        service.listPalestra().enqueue(new Callback<List<Palestra>>() {
//            @Override
//            public void onResponse(Call<List<Palestra>> call, Response<List<Palestra>> response) {
//
//                response.body().stream().forEach(p ->{
//                    Log.i("logTeste",p.getNome());
//                });
//
//            }
//
//            @Override
//            public void onFailure(Call<List<Palestra>> call, Throwable throwable) {
//
//            }
//        });

    }
}