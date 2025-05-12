package com.sylviavitoria.model;

// Também usa Herança e Polimorfismo (implementação diferente do feitiço)
public class BruxoSonserina extends Bruxo implements Magia {

    public BruxoSonserina(String nome, String casa) {
        super(nome, casa);
    }

    @Override
    public void lancarFeitico() {
        System.out.println("Serpensortia! - O bruxo da Sonserina lançou seu feitiço!");
    }
}
