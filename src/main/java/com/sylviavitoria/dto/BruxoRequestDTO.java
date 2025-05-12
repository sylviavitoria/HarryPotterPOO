package com.sylviavitoria.dto;

// DTO usado para receber os dados (entrada do sistema)
public class BruxoRequestDTO {
    private String nome;
    private String casa;

    // Construtor padrao
    public BruxoRequestDTO() {}

    // Construtor com argumentos – usado para passar os dados ao criar o DTO
    public BruxoRequestDTO(String nome, String casa) {
        this.nome = nome;
        this.casa = casa;
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
