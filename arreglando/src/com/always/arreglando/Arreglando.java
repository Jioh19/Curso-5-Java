package com.always.arreglando;

import java.util.Scanner;

public class Arreglando {
    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        int arreglo[] = new int[3];
        for(int i = 0; i< arreglo.length; ++i) {
            System.out.println("Ingresa el numero:");
            arreglo[i] = ingresar.nextInt();
        }
        int indice = 0;
        for(int i = 1; i < arreglo.length; ++i) {
            if(arreglo[indice] < arreglo[i]) {
                indice = i;
            }
        }
        System.out.println("El mayor número es: " + arreglo[indice] + " del indice " +indice );
    }
}
