package com.sylviavitoria;

public class Main {
    public static void main(String[] args) {
        BruxoGrifinoria harry = new BruxoGrifinoria("Harry Potter");
        BruxoSonserina draco = new BruxoSonserina("Draco Malfoy");

        harry.mostrarInformacoes();
        harry.lancarFeitico();

        System.out.println();

        draco.mostrarInformacoes();
        draco.lancarFeitico();
    }
}