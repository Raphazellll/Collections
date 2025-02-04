/*
    Dada os modelos dos carros e seus respectivos consumos na estrada, faça:

        modelo = gol - consumo 14,4Km/l
        modelo = uno - consumo 15,6Km/l
        modelo = mobi - consumo 16,1Km/l
        modelo = hb20 - consumo 14,5Km/l
        modelo = kwid - consumo 15,6Km/l

*/

package com.map;

import java.util.*;

public class exemploMap {
    public static void main(String[] args) {

        Map<String, Double> carrosPopulares = new HashMap<>() {{

            put("gol", 14.4);
            put("uno", 16.1);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);

        }};
        System.out.println(carrosPopulares);
        System.out.println("\n");

        System.out.println("Substitua o consumo do gol por 15,5Km/l");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);
        System.out.println("\n");

        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));
        System.out.println("\n");

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));
        System.out.println("\n");

        System.out.println("Exiba os modelos: " + carrosPopulares.keySet());
        System.out.println("\n");

        System.out.println("Exiba o consumo dos carros: " + carrosPopulares.values());
        System.out.println("\n");

        System.out.println("Exiba o modelo mais econônico e seus consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente))
                modeloMaisEficiente = entry.getKey();
        }
        System.out.println("Modelo mais eficiente: " + modeloMaisEficiente);
        System.out.println("Consumo mais eficiente: " + consumoMaisEficiente);
        System.out.println("\n");

        System.out.println("Exiba o modelo menos econônico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = " ";
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
                System.out.println("\n");
            }

        }

        System.out.println("Exiba a soma dos consumos! ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;

        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Exibindo a soma dos consumos! " + soma);
        System.out.println("\n");


        System.out.println("Exiba a média de comsumo deste dicionário de carros: " + (soma / carrosPopulares.size()));
        System.out.println("\n");

        System.out.println(carrosPopulares);
        System.out.println("Remova os modelos com o consumo igual a 15,6Km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);
        System.out.println("\n");

        System.out.println("Exiba todos os carros na ordem que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{

            put("gol", 14.4);
            put("uno", 16.1);
            put("mobi", 16.7);
            put("hb20", 14.5);
            put("kwid", 15.6);

        }};
        System.out.println(carrosPopulares1);
        System.out.println("\n");

        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());
        System.out.println("\n");

        System.out.println("Apague o dicionários de carros: ");
        carrosPopulares.clear();
        System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());



    }
}
