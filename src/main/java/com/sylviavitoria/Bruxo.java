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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    
}

