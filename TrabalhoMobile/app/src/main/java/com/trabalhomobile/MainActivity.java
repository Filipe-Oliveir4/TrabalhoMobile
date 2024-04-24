package com.trabalhomobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_programacao);

        RecyclerView recyclerView = findViewById(R.id.recycleViewProgramacao);
        List<DiaEvento> list = new ArrayList<>();
        list.add(new DiaEvento("Dia 1","corpo dia 1"));
        list.add(new DiaEvento("Dia 2","corpo dia 2"));
        list.add(new DiaEvento("Dia 3","corpo dia 3"));
        list.add(new DiaEvento("Dia 4","corpo dia 4"));
        list.add(new DiaEvento("Dia 1","corpo dia 1"));
        list.add(new DiaEvento("Dia 2","corpo dia 2"));
        list.add(new DiaEvento("Dia 3","corpo dia 3"));
        list.add(new DiaEvento("Dia 4","corpo dia 4"));
        list.add(new DiaEvento("Dia 1","corpo dia 1"));
        list.add(new DiaEvento("Dia 2","corpo dia 2"));
        list.add(new DiaEvento("Dia 3","corpo dia 3"));
        list.add(new DiaEvento("Dia 4","corpo dia 4"));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new DiaEventoAdapter(getApplicationContext(),list));
    }
}