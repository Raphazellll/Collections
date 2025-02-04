package com.sets;
import java.util.TreeSet;
import java.util.*;

public class exemploOrdenacaoSet {
 /*
    Dadas as seguintes informações sobre as linhas favoritas,
        crie um conjunto e ordene este conjunto exibindo:
        (nome - genero - tempo de episódio)

        Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
        Série 2 = Nome: One Piece: Genero: piratas e fantasia, tempoEpisodio: 25
        Série 3 = Nome: Lost: genero: suspense, tempoEpisodio: 40


 */


    public static void main(String[] args) {



        System.out.println("--\tOrdem Aleatória\t--");
        Set<Serie>  minhasSeries = new HashSet<>(){{
            add(new Serie("Ao no Exocist", "Fantasia", 25));
            add(new Serie("One Piece", "Piratas, Animes, Fantasia", 25));
            add(new Serie("Lost", "Suspense", 40));
        }};
        for(Serie serie: minhasSeries) System.out.println(serie.getNome() + " - " +  serie.getGenero() + " - " + serie.getTempoEpisodio());
        System.out.println("\n");

        System.out.println("--\tOrdem Inserção\t--");
        Set<Serie>  minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("Ao no Exocist", "Fantasia", 25));
            add(new Serie("One Piece", "Piratas, Animes, Fantasia", 25));
            add(new Serie("Lost", "Suspense", 40));
        }};
        for(Serie serie: minhasSeries) System.out.println(serie.getNome() + " - " +  serie.getGenero() + " - " + serie.getTempoEpisodio());
        System.out.println("\n");

        System.out.println("--\tOrdem Natural (tempoEpisodio)\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries);
        for(Serie serie: minhasSeries2) System.out.println(serie.getNome() + " - " +  serie.getGenero() + " - " + serie.getTempoEpisodio());
        System.out.println("\n");

        System.out.println("--\tOrdem Nome/Genero/TempoEpisodio\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for(Serie serie: minhasSeries3) System.out.println(serie.getNome() + " - " +  serie.getGenero() + " - " + serie.getTempoEpisodio());
        System.out.println("\n");
    }
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "Nome da Série:" + nome + '\'' +
                ", Gênero = " + genero + '\'' +
                ", Tempo de Episódio: =" + tempoEpisodio;

    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio =  Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;
        return this.getGenero().compareTo(serie.getGenero());

    }
}
class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());


    }
}
