package com.sylviavitoria;

public abstract class Bruxo {
    private String nome;
    private String casa;

    public Bruxo(String nome, String casa) {
        this.nome = nome;
        this.casa = casa;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Casa: " + casa);
    }
}

