package com.trabalhomobile;

import com.trabalhomobile.recicleview.MiniCursos;
import com.trabalhomobile.recicleview.Palestra;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SemocService {
    @GET("ucsal/semoc/main/api/palestras.json")
    Call<List<Palestra>> listPalestra();
    @GET("ucsal/semoc/main/api/minicursos.json")
    Call<List<MiniCursos>> listMinicursos();
}
