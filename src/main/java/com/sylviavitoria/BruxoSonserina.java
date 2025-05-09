package com.sylviavitoria;

public class BruxoSonserina extends Bruxo implements Magia {

    public BruxoSonserina(String nome) {
        super(nome, "Sonserina");
    }

    @Override
    public void lancarFeitico() {
        System.out.println("Serpensortia! - O bruxo da Sonserina lançou seu feitiço!");
    }
}