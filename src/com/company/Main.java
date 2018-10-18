package com.company;

import java.util.Scanner;

public class Main {
    public static int validarEntero(Scanner sc) {
        int numeroValidado;
        while (!sc.hasNextInt()) {
            System.out.print("¡Introduce un valor numérico entero! ");
            sc.next();
        }
        numeroValidado = sc.nextInt();
        return numeroValidado;
    }

    public static String compararNumeros(int primerNumero, int segundoNumero) {
        String cadenaResultado;
        if (primerNumero == segundoNumero) {
            cadenaResultado = "Los dos números SÍ son iguales.";
        } else {
            cadenaResultado = "Los dos nñumeros NO son iguales.";
        }
        return cadenaResultado;
    }

    public static String comprobarMultiplos(int primerNumero, int segundoNumero) {
        String cadenaResultado;
        if ((primerNumero % segundoNumero == 0) || (segundoNumero % primerNumero == 0)) {
            cadenaResultado = "Los números SÍ son múltiplos.";
        } else {
            cadenaResultado = "Los números NO son múltiplos.";
        }
        return cadenaResultado;
    }

    public static String comprobarNumero(int primerNumero, int segundoNumero) {
        String cadenaResultado;
        if (primerNumero > segundoNumero) {
            cadenaResultado = String.format("El número %d es mayor que el número %d.", primerNumero, segundoNumero);
        } else {
            if (segundoNumero > primerNumero) {
                cadenaResultado = String.format("El número %d es mayor que el número %d.", segundoNumero, primerNumero);
            } else {
                cadenaResultado = String.format("Los números %d y %d son iguales.", primerNumero, segundoNumero);
            }
        }
        return cadenaResultado;
    }

    public static String ordenarNumeros(int primerNumero, int segundoNumero) {
        String cadenaOrdenada;
        if (primerNumero > segundoNumero) {
            cadenaOrdenada = String.format("Números ordenados: %d,%d.", primerNumero, segundoNumero);
        } else {
            cadenaOrdenada = String.format("Nñumeros ordenados: %d,%d.", segundoNumero, primerNumero);
        }
        return cadenaOrdenada;
    }

    public static void main(String[] args) {
        int primerNumero, segundoNumero;
        Scanner sc = new Scanner(System.in);
        char opcion;
        System.out.println("¡Vamos a realizar una serie de operaciones con dos números!");
        System.out.print("Introduce un primer número: ");
        primerNumero = validarEntero(sc);
        System.out.print("Introduce un segundo número: ");
        segundoNumero = validarEntero(sc);
        System.out.println("--MENÚ--");
        System.out.println("[1] ¿Son iguales?");
        System.out.println("[2] ¿Son múltiplos?");
        System.out.println("[3] ¿Cual es el mayor?");
        System.out.println("[4] Números ordenados de mayor a menos");
        System.out.print("Opción: ");
        opcion = sc.next().charAt(0);
        sc.close();
        switch (opcion) {
            case '1':
                System.out.println(compararNumeros(primerNumero, segundoNumero));
                break;
            case '2':
                System.out.println(comprobarMultiplos(primerNumero, segundoNumero));
                break;
            case '3':
                System.out.println(comprobarNumero(primerNumero, segundoNumero));
                break;
            case '4':
                System.out.println(ordenarNumeros(primerNumero, segundoNumero));
                break;
        }
    }
}
