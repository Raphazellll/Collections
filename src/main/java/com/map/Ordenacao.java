package com.map;

import java.util.*;

public class Ordenacao {

    public static void main(String[] args) {






        System.out.println("--\t Ordem Aleatória \t--");
        Map<String, Livro> meusLivros = new HashMap<>() {{

            put("Hawking, Sthepen", new Livro("Uma Breve História do Tempo",256));
            put("Duhing, Charles", new Livro("O Poder do Hábito",408));
            put("Harani, Yuval Noah", new Livro("21 Lições do Século 21",432));
        }};

        for(Map.Entry<String, Livro> livro :meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        System.out.println("\n");

        System.out.println("--\t Ordem Inserção \t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{

            put("Hawking, Sthepen", new Livro("Uma Breve História do Tempo",256));
            put("Duhing, Charles", new Livro("O Poder do Hábito",408));
            put("Harani, Yuval Noah", new Livro("21 Lições do Século 21",432));
        }};
        for(Map.Entry<String, Livro> livro :meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        System.out.println("\n");

        System.out.println("--\t Ordem Alfabética Autores \t--");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for(Map.Entry<String, Livro> livro :meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        System.out.println("\n");


        System.out.println("--\t Ordem Alfabética nome dos livros \t--");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livro> livro :meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        System.out.println("\n");


    }
}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o ) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome()); // o valor do primeiro livro e pegar o nome, comparar com o segundo livro e comparar com o nome também
    }
}