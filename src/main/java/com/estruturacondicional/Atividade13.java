package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número (N1): ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número (N2): ");
        int numero2 = scanner.nextInt();
        System.out.print("Digite o terceiro número (N3): ");
        int numero3 = scanner.nextInt();

        int primeiroNumero = 0;
        int segundoNumero = 0;
        int terceiroNumero =0;

        if ((numero1 > numero2) && (numero1 > numero3)){
           terceiroNumero = numero1;
           if (numero2 > numero3) {
               segundoNumero = numero2;
               primeiroNumero = numero3;

           } else {
               segundoNumero = numero3;
               primeiroNumero = numero2;
           }
           } else if (numero2 > numero3) {
            terceiroNumero = numero2;
            if (numero3 > numero1) {
                segundoNumero = numero3;
                primeiroNumero = numero1;

        } else {
                segundoNumero = numero1;
                primeiroNumero = numero3;
            }
    } else {
            terceiroNumero = numero3;
            if (numero2 > numero1) {
                segundoNumero = numero2;
                primeiroNumero = numero1;
            } else {
                segundoNumero = numero1;
                primeiroNumero = numero2;
            }
        }
        System.out.println(primeiroNumero + ", " + segundoNumero + "," + terceiroNumero);
        }
    }

