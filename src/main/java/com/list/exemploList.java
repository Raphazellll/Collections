package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class exemploList {

    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas.toString());

        // Exiba a posição da nota 5.0
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d)); //Exibir a posição do indice

        // Adicione na lista a nota 8.0 na posição 4
        System.out.println("Adiciona a lista a nota 8.0 na posição 4: " );
            notas.add(4, 8d);
        System.out.println(notas);

        // Substituir a nota 5.0 pela nota 6.0
        System.out.println("Substituia a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        // Conferir se a nota 5.0 está na lista
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        // Exibir todas as notas nas notas na ordem informadas
        System.out.println("Exiba todas as notas na ordem em que foram informados:");
            // for(Double nota : notas) System.out.println(nota);

        // Exibir a terceira nota adicionada
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        // Exiba a menor nota
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        // Exiba a maior nota
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        // Exibindo a soma dos valores
        System.out.println("Exibindo a soma dos valores. ");
        Iterator<Double> iterator = notas.iterator();  // criando uma variável padrão interator
        double soma = 0d;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        // Exibindo a média das notas
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        // Removendo a nota 0
        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        // Removendo a nota da posição 0

        System.out.println("Remova a nota da posição 0.");
        notas.remove(0);
        System.out.println(notas);

        // Removendo as notas menores que 7 e exibindo a lista
        System.out.println("Remova as notas menores que 7 e exiba a lista");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        // Apagando toda a lista
        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        // Conferindo se a lista está vazia
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());


    }
}
