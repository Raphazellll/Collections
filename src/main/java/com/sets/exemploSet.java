package com.sets;

import javax.swing.text.html.HTMLDocument;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class exemploSet {

    public static <iterator> void main(String[] args) {

    // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 8, 3.6], faça:

    // Set notas new HashSet(); // Antes do java 5
    // Set<Double> notas = new HashSet<>(); // Generics (jdk 5) - Diamont Operator(jds 7)
    // HashSet <Double> notas = new HashSet<>();
    // Set<Double. notas = new Hashset<>(Arrays.asList(7d, 8.5, 9.3, 5, 7, 8, 3.6));
    // Set<Double> notas = Set.of(7d, 8.5, 9.3, 5, 7, 8, 3.6);
    // notas.add(1d);
    //notas.remove(5d);
    //    System.out.println(notas);


    // Criando um conjunto e adiciona as notas:
    System.out.println("Crie um conjunto e adiciona as notas: ");
        Set<Double> notas = new HashSet<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(7.4);
        notas.add(9.0);
        notas.add(3.9);
        notas.add(4.9);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 9.0 está no conjunto " + notas.contains(9.0));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
            while (iterator.hasNext()){
              Double next = iterator.next();
              soma += next;
            }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média da nota: " + (soma/notas.size()));

        System.out.println("Remova a nota 3.6");
        notas.remove(3.6);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 6 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            double next1 = iterator1.next();
            if (next1 < 6) iterator1.remove();
        }
        System.out.println(notas);


    }
}
