package org.cgmlti.adso.ciclos;

public class ForBasico {

    public static void main(String[] args) {

        // 1. declaracion de la variable de control
        // 2. condicionar a evaluarse
        // 3. instruccion de incremento
        for (int contador = 1; contador <= 100; contador += 1) {
            System.out.println(contador);
        }
        for (int contador = 100; contador >= 1; contador -= 1) {
            System.out.println(contador);
        }
        for (int contador = 7; contador <= 77; contador += 7) {
            System.out.println(contador);
        }

        for (int contador = 20; contador > 0; contador -= 2) {
            System.out.println(contador);
        }
        for (int contador = 2; contador <= 20; contador += 3) {
            System.out.println(contador);
        }
        for (int contador = 99; contador >= 33; contador -= 11) {
            System.out.println(contador);
        }

        int contador;
        // variable acumuladora:
        // nombre significativo
        // recomendacion que sea 0
        int total = 0;
        for (contador = 0; contador <= 10; contador++) {
            // instrucciones de acumulacion
            // no se utilia la variable de control
            total += contador;
            System.out.println(contador);
        }
        System.out.println(total);
    }
}
