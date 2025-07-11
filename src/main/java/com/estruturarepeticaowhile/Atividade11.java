package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {

        int contador = 1;
        int multiplicacao =1;

        while (contador < 20) {
            if (contador % 2 == 0) {
               multiplicacao = multiplicacao * contador;
            }
            contador++;
        }
        System.out.println(multiplicacao);
    }
}
