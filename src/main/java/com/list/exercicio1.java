package com.list;

import java.util.ArrayList;

public class exercicio1 {

    public static void main(String[] args) {

        ArrayList<Double> notas2 = new ArrayList<>();

        notas2.add(0.0);
        notas2.add(1.0);
        notas2.add(2.0);
        notas2.add(3.0);
        notas2.add(4.0);
        notas2.add(5.0);
        notas2.add(6.0);
        notas2.add(7.0);
        notas2.add(8.0);
        notas2.add(9.0);
        notas2.add(10.0);

        System.out.println(notas2.toString());

        System.out.println("Exibindo a primeira nota da lista, sem remove-la: " + notas2.get(0));
        System.out.println("Mostrando a nota da lista que foi removida: " + notas2.remove(0));
        System.out.println(notas2);

    }


}
