package com.sylviavitoria;

public class BruxoGrifinoria extends Bruxo implements Magia {

    public BruxoGrifinoria(String nome) {
        super(nome, "Grifinória");
    }

    @Override
    public void lancarFeitico() {
        System.out.println("Expelliarmus! - O bruxo da Grifinória lançou seu feitiço!");
    }
}
