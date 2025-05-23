package main.java.com;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicita os valores de a, b e c
        System.out.print("Digite o valor de a:");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b:");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de c:");
        double c = scanner.nextDouble();





        double resultado = ((b * b) - 4 * a * c) / (2 * a);
        System.out.println("Resultado da fórmula (b² - 4ac) / (2a): " + resultado);
        }

    }


