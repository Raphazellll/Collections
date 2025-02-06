package com.javaStreams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {

    public static void main(String[] args) {

        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        //System.out.println("Imprima todos os elementos desta lista de String: ");
       // numerosAleatorios.stream().forEach(s -> System.out.println(s));
        //numerosAleatorios.forEach(System.out::println);


        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
            numerosAleatorios.stream().limit(5)
                    .collect(Collectors.toSet())
                    .forEach(System.out::println);
                    System.out.println("\n");


        System.out.println("Transforme esta lista de String em uma lista ded números inteiros.");


            numerosAleatorios.stream()
                    .map( Integer::parseInt) // pega cada valor da list em um tipo, no caso, String, para Int
                    .collect(Collectors.toList())
                    .forEach(System.out::println);
                    System.out.println("\n");

           /* List<Integer> numerosAleatorios1 = (List<Integer>) numerosAleatorios.stream()
                    .map(new Function<String, Integer>() {
                        @Override
                        public Integer apply(String s) {
                            return Integer.parseInt(s);
                        }
                    }); */

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
            numerosAleatorios.stream()
                    .map( Integer::parseInt)
                    .filter(new Predicate<Integer>() {
                        @Override
                        public boolean test(Integer i){
                            if (i % 2 == 0 && i > 2) return true;
                            return false;
                    }
                }).collect(Collectors.toList()).forEach(System.out::println);
                    System.out.println("\n");

                        // * Outro exemplo
            // List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
            // .map( Integer::parseInt)
            //.filter( i -> (i % 2 == 0 && i > 2).collect.(Collectors.toList());
            // System.out.println("Mostre a média dos números:");
            //System.out.println(istParesMaioresQue2);

        System.out.println("Mostre a média dos números");
        numerosAleatorios.stream()
                /*.mapToInt(new ToIntFunction<String>() {
                    @Override
                    public int applyAsInt(String s){
                        return Integer.parseInt(s);
                    }
                }); */
               /* .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(new DoubleConsumer() {
                    @Override
                    public void accept(double v) {
                        System.out.println(v);
                    }
                }); */
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);


        System.out.println("Remova os valores impares:");
            List<Integer> numerosAleatoriosInteger = (List<Integer>) numerosAleatorios.stream()
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

        numerosAleatoriosInteger.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer % 2 != 0) return true;
                return false;
            }
        }) ;
        System.out.println(numerosAleatoriosInteger);

    } //MAIN

} // Class
