package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        // Filme
        Filme meuFilme = new Filme("O Poderoso Chefão", 1978);
        Filme outroFilme = new Filme("Avatar 2", 2023);
        Filme filmeDoGabriel = new Filme("Homem-Aranha 2", 2004);

        meuFilme.avalia(8);
        filmeDoGabriel.avalia(10);

        // Série
        Serie minhaSerie = new Serie("Breaking Bad", 2006);

        minhaSerie.avalia(9);

        // Array
        List<Titulo> lista = new LinkedList<>();

        lista.add(filmeDoGabriel);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(minhaSerie);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        // Array de artistas
        List<String> buscaPorArtista = new ArrayList<>();

        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");

        // Ordena a array em ordem alfabética
        Collections.sort(buscaPorArtista);
        Collections.sort(lista);

        System.out.println("\nOrdenando por ordem alfabética:");
        System.out.println(buscaPorArtista);
        System.out.println(lista);

        // Utilização do sort() para ordenar a lista, o Comparator que é uma interface
        // e que invoca um método estático comparing() sinalizando que para todo Titulo
        // que ele recebe, ele tem que pegar o getAnoDeLancamento() como comparação
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

        System.out.println("\nOrdenando por ano:");
        System.out.println(lista);
    }
}
