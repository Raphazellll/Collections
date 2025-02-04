package com.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class praticaSet1 {

    public static void main(String[] args) {

        Set<ArcoIris> meuArcoIris = new HashSet<>() {{
            add(new ArcoIris("Vermelho", 1));
            add(new ArcoIris("Laranja", 2));
            add(new ArcoIris("Amarelo", 3));
            add(new ArcoIris("Amarelo", 4));
            add(new ArcoIris("Azul", 5));
            add(new ArcoIris("Anil", 6));
            add(new ArcoIris("Violeta", 7));
        }};
        System.out.println("\n");
        for(ArcoIris arcoIris: meuArcoIris) System.out.println(arcoIris.getCor() + arcoIris.getOrdem()); // Imprimindo aleatóriamente

        Set<ArcoIris>  meuArcoIris1 = new LinkedHashSet<>(){{
            add(new ArcoIris("Vermelho ", 1));
            add(new ArcoIris("Laranja ", 2));
            add(new ArcoIris("Amarelo ", 3));
            add(new ArcoIris("Amarelo ", 4));
            add(new ArcoIris("Azul ", 5));
            add(new ArcoIris("Anil ", 6));
            add(new ArcoIris("Violeta ", 7));
        }};
        System.out.println("\n");
        for(ArcoIris arcoIris: meuArcoIris1) System.out.println(arcoIris.getCor() + arcoIris.getOrdem()); // Imprimindo na ordem de Inserção
        System.out.println("\n");

    }

    static class ArcoIris implements Comparable<ArcoIris> {
        private String cor;
        private Integer ordem;

        public ArcoIris(String cor, Integer ordem) {
            this.cor = cor;
            this.ordem = ordem;
        }

        public String getCor() {
            return cor;
        }

        public Integer getOrdem() {
            return ordem;
        }

        @Override
        public String toString() {
            return "Arco-iris: " +
                    "Cor =" + cor + " Ordem do Arco-Iris: " + ordem + " | ";

        }

        @Override
        public boolean equals(Object u) {
            if(this == u) return true;
            if (u == null || getClass() != u.getClass()) return false;
            ArcoIris arcoIris = (ArcoIris) u;
            return Objects.equals(cor, arcoIris.cor) && Objects.equals(ordem, arcoIris.ordem);
        }

        @Override
        public int hashCode() {
            return Objects.hash(cor, ordem);
        }


        @Override
        public int compareTo(ArcoIris o) {
            return 0;
        }
    }

}




