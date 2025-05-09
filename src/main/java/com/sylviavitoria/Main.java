package com.sylviavitoria;

public class Main {
    public static void main(String[] args) {
        Bruxo harry = new BruxoGrifinoria("Harry Potter");
        harry.mostrarInformacoes();
        ((Magia) harry).lancarFeitico(); 

        System.out.println();

        Bruxo draco = new BruxoSonserina("Draco Malfoy");
        draco.mostrarInformacoes();
        ((Magia) draco).lancarFeitico(); 
    }
}