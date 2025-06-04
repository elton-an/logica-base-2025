package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite valor de a");
        double a = scanner.nextDouble();

        System.out.println("Digite valor de b");
        double b = scanner.nextDouble();

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));

        }

    }

