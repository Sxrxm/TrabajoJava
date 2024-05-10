package org.cgmlti.adso.ciclos;

import java.util.ArrayList;
import java.util.List;

public class EjercicioNotas {

    public static void main(String[] args) {

        List<Integer> notas = new ArrayList<>();

        notas.add(3);
        notas.add(4);
        notas.add(5);
        notas.add(6);
        notas.add(7);
        notas.add(8);
        notas.add(10);
        notas.add(1);
        notas.add(2);
        notas.add(6);

        int suma = 0;
        for (Integer nota : notas) {
            suma += nota;
        }
        Integer promedio = (Integer) suma / 10;
        System.out.println("promedio:" + notas.size() + "notas es:" + promedio);

    }
}