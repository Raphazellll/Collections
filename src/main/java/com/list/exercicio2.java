package com.list;

import java.util.ArrayList;
import java.util.Iterator;

public class exercicio2 {

    public static void main(String[] args) {
        ArrayList<Double> temperatura = new ArrayList<>(); // Lista1
        temperatura.add(15.0);
        temperatura.add(27.0);
        temperatura.add(13.0);
        temperatura.add(10.0);
        temperatura.add(18.0);
        temperatura.add(30.0);

        ArrayList<Double> temperatura2 = new ArrayList<>(); // Lista2
        temperatura2.add(25.0);
        temperatura2.add(7.0);
        temperatura2.add(19.0);
        temperatura2.add(11.0);
        temperatura2.add(1.0);
        temperatura2.add(20.0);

        System.out.println("Calculando a média do primeiro semestre das temperaturas:");

        Iterator<Double> iterator = temperatura.iterator();
        double soma = 0d;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Média da temperatura no primeiro Semestre: " + soma/temperatura.size());

        Iterator<Double> iterator2 = temperatura2.iterator();
        double soma2 = 0d;
        while(iterator2.hasNext()) {
            Double next2 = iterator2.next();
            soma2 += next2;
        }
        System.out.println("Média da temperatura no segundo Semestre: " + soma2/temperatura2.size());


        System.out.println("Mostrando as temperaturas que estão acima da média: ");

    }
}
