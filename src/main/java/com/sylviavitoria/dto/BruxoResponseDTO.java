package com.sylviavitoria.dto;


// DTO usado para devolver os dados (saída do sistema)
public class BruxoResponseDTO {
    private String nome;
    private String casa;
    private String tipoMagia;

    // Construtor padrao
    public BruxoResponseDTO() {}

    // Construtor com todos os dados para resposta
    public BruxoResponseDTO(String nome, String casa, String tipoMagia) {
        this.nome = nome;
        this.casa = casa;
        this.tipoMagia = tipoMagia;
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

    public String getTipoMagia() {
        return tipoMagia;
    }

    public void setTipoMagia(String tipoMagia) {
        this.tipoMagia = tipoMagia;
    }
}