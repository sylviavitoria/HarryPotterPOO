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

        System.out.println();

        System.out.println(harry.getNome());
        System.out.println(draco.getNome());

        harry.setNome("Harry James Potter");
        System.out.println("Novo nome de Harry:" + harry.getNome());
        harry.mostrarInformacoes();
        System.out.println();

        draco.setNome("Draco Lucius Malfoy");
        System.out.println("Novo nome de Harry:" + draco.getNome());
    }
}