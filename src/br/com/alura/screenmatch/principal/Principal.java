package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // Tipo por referência

        // Filme
        Filme meuFilme = new Filme("O Poderoso Chefão", 1978);
        Filme outroFilme = new Filme("Avatar 2", 2023);
        Filme filmeDoGabriel = new Filme("Homem-Aranha 2", 2004);

        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(9);

        outroFilme.setDuracaoEmMinutos(200);

        filmeDoGabriel.setDuracaoEmMinutos(200);
        filmeDoGabriel.avalia(10);

        System.out.println("Duração da série: " + meuFilme.getDuracaoEmMinutos());
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        // Série
        Serie minhaSerie = new Serie("Breaking Bad", 2006);

        minhaSerie.exibeFichaTecnica();
        minhaSerie.setTemporadas(6);
        minhaSerie.setEpisodiosPorTemporada(10);
        minhaSerie.setMinutosPorEpisodio(50);

        System.out.println("Duração da série: " + minhaSerie.getDuracaoEmMinutos());

        // Calculadora
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(minhaSerie);

        System.out.println(calculadora.getTempoTotal());

        // Filtro de recomendação
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        // Episódio
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVisualizacoes(300);

        filtro.filtra(episodio);

        // Array
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(filmeDoGabriel);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());
        System.out.println(listaDeFilmes);
    }
}
