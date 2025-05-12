package com.sylviavitoria.model;

// Herança: BruxoGrifinoria herda atributos e métodos da classe Bruxo
// Polimorfismo: implementa o método lancarFeitico da interface Magia de forma única
public class BruxoGrifinoria extends Bruxo implements Magia {

    public BruxoGrifinoria(String nome, String casa) {
        super(nome, casa); // chama o construtor da superclasse Bruxo
    }

    @Override
    public void lancarFeitico() {
        System.out.println("Expelliarmus! - O bruxo da Grifinória lançou seu feitiço!");
    }
}
