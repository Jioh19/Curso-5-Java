package Palindromo;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa tu palabra");
        String palabra = scan.next();
        boolean isPalindrome = true;

        for(int i = 0; i < palabra.length()/2; i++) {
            if(palabra.charAt(i) != palabra.charAt(palabra.length()-1-i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }


    /*
        String.charAt(i) Que caracter contiene en el lugar i
        String.length()  El largo del string
        Hacer una funcion que diga si una palabra es palindroma
        Aprovechar las funciones de la clase String!
        metodos de java string
        asdffdsa
        aaaaaaaa
        ababababa
        abbbaa
     */


}