package main.java.com;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("Digite o segundo número");
        double segundoNumero = scanner.nextDouble();

        double soma = primeiroNumero + segundoNumero;

        double media = soma /2;

        System.out.println("A média é: " + media);

    }
}
