package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/* Dadas as seguintes informações sobre meus gatos, cria uma lista e ordene esta lista exibindo:
            (nome - idade - cor)

          Gato 1 = nome: aaa, idade: 1 cor: preto
          Gato 2 = nome: aaa, idade: 2 cor: branco
          Gato 3 = nome: aaa, idade: 3 cor: amarelo
         */

public class exemploList2 {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Vicente", 8, "Preto"));
            add(new Gato("Oliver", 5, "Siamês" ));
            add(new Gato("Morgana", 3, "Frajola"));
            add(new Gato("Tom", 6, "Frajola Cinza"));
            add(new Gato("Lucca", 3, "Branco"));
            add(new Gato("Laranjinha", 3, "Laranja com Branco"));
        }};
        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Aleatória\t---");
        Collections.shuffle(meusGatos); //Shuffle para embaralhar uma lista.
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Natural (Nome)\t---");
        Collections.sort(meusGatos); // Sort para fazer comparações, talves de strings ou ints
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Idade\t---");
        //Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);


        System.out.println("--\tOrdem Cor\t---");
        Collections.sort(meusGatos, new ComparatorCor());
        //meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        //meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);



    }
}


class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Nome do gato: "
                 + nome + '\'' +
                ", idade: " + idade +
                ", cor: " + cor + '\'';
    }

    @Override
    public int compareTo(Gato gato) { // comparando nome
       return this.getNome().compareToIgnoreCase(gato.getNome());

    }
}

    class ComparatorIdade implements Comparator<Gato> { // classe para comparar idade
        public int compare(Gato g1, Gato g2) {
            return Integer.compare(g1.getIdade(), g2.getIdade());
        }

    }

    class ComparatorCor implements Comparator<Gato> { // classe para comparar cor

        @Override
        public int compare(Gato g1, Gato g2) {
            return  g1.getCor().compareToIgnoreCase(g2.getCor());
        }

    }

    class ComparatorNomeCorIdade implements Comparator<Gato> {
        public int compare(Gato g1, Gato g2) {
            int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
            if(nome != 0) return nome;

            int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
            if(cor != 0) return cor;

            return Integer.compare(g1.getIdade(), g2.getIdade());


        }
    }

