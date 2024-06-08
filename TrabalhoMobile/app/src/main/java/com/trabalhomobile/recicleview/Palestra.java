package com.trabalhomobile.recicleview;


import java.io.Serializable;

public class Palestra implements Serializable {
    Integer id;
    String nome;
    String descricao;
    String data;
    String hora;
    String local;
    Integer instrutor_id;
    String tema;
    String nivel;
    String formato;

    public Palestra(Integer id, String descricao, String data, String hora, String local, Integer instrutor_id, String tema, String nivel, String formato) {
        this.id = id;
        this.descricao = descricao;
        this.data = data;
        this.hora = hora;
        this.local = local;
        this.instrutor_id = instrutor_id;
        this.tema = tema;
        this.nivel = nivel;
        this.formato = formato;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Integer getInstrutor_id() {
        return instrutor_id;
    }

    public void setInstrutor_id(Integer instrutor_id) {
        this.instrutor_id = instrutor_id;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
