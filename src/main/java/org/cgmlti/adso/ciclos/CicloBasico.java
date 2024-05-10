package org.cgmlti.adso.ciclos;

public class CicloBasico {

    public static void main(String[] args) {

        // contador es de tipo entero
        int contador = 100;
        // tip: el valor de la condicional
        // deberia ser el valor final
        // del ciclo
        while (contador >= 1) {
            // istruccion del ciclo:
            System.out.println(contador);

            // instruccion de incremento
            // se asigna a la variaable de control
            // el mismo valor de la variable de control
            // mas el valor de incremento
            // istruccion de incremento
            // se ubica al final del
            // bloque de codigo
            --contador;
        }
        int contador1 = 1;
        while (contador1 <= 100) {
            System.out.println(contador1);

            ++contador1;
        }

        int contador2 = 7;
        while (contador2 <= 77) {
            System.out.println(contador2);
            contador2 = contador2 + 7;

        }

        int contador3 = 20;
        while (contador3 >= 2) {
            System.out.println(contador3);
            contador3 = contador3 - 2;

        }
        int contador4 = 2;
        while (contador4 <= 20) {
            System.out.println(contador4);
            contador4 = contador4 + 3;

        }
        int contador5 = 99;
        while (contador5 >= 33) {
            System.out.println(contador5);
            contador5 = contador5 - 11;

        }
    }

}
