// Classe principal onde acontece a orquestracao do fluxo
package com.sylviavitoria;

import com.sylviavitoria.dto.BruxoRequestDTO;
import com.sylviavitoria.dto.BruxoResponseDTO;
import com.sylviavitoria.model.BruxoGrifinoria;
import com.sylviavitoria.model.BruxoSonserina;

public class Main {
    public static void main(String[] args) {
        // Cria DTOs de request (simula dados vindos do "usuario")
        BruxoRequestDTO harryRequest = new BruxoRequestDTO("Harry Potter", "Grifinória");
        BruxoRequestDTO dracoRequest = new BruxoRequestDTO("Draco Malfoy", "Sonserina");

        // Conversao de DTO para modelo de dominio (transformacao de dados)
        BruxoGrifinoria harry = new BruxoGrifinoria(harryRequest.getNome(), harryRequest.getCasa());
        BruxoSonserina draco = new BruxoSonserina(dracoRequest.getNome(), dracoRequest.getCasa());

        // Acoes do modelo (uso de metodos com comportamento)
        harry.mostrarInformacoes();
        harry.lancarFeitico();

        System.out.println();

        draco.mostrarInformacoes();
        draco.lancarFeitico();

        // Conversao para DTO de resposta (dados prontos para "retorno")
        BruxoResponseDTO harryResponse = new BruxoResponseDTO(
            harry.getNome(),
            harry.getCasa(),
            "Expelliarmus"
        );

        BruxoResponseDTO dracoResponse = new BruxoResponseDTO(
            draco.getNome(),
            draco.getCasa(),
            "Serpensortia"
        );

        // Impressao simulando uma saida
        System.out.println("\nDados do DTO de resposta:");
        System.out.println("Nome: " + harryResponse.getNome());
        System.out.println("Casa: " + harryResponse.getCasa());
        System.out.println("Feitiço: " + harryResponse.getTipoMagia());

        System.out.println("\nDados do DTO de resposta:");
        System.out.println("Nome: " + dracoResponse.getNome());
        System.out.println("Casa: " + dracoResponse.getCasa());
        System.out.println("Feitiço: " + dracoResponse.getTipoMagia());
    }
}