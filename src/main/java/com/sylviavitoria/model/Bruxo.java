package com.sylviavitoria.model;

// Abstração: essa classe representa um conceito genérico de Bruxo
public abstract class Bruxo {
    private String nome;
    private String casa;

    // Construtor da superclasse (usado pelas subclasses)
    public Bruxo(String nome, String casa) {
        this.nome = nome;
        this.casa = casa;
    }

    // Método comum que será herdado pelas subclasses
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Casa: " + casa);
    }

    // Encapsulamento: usamos getters e setters para proteger os atributos
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
