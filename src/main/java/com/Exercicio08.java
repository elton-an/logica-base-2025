package main.java.com;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primerio número");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Digite o segundo número");
        int segundoNumero = scanner.nextInt();
        System.out.println("Digite o terceiro número");
        int terceiroNumero = scanner.nextInt();

        double media = (primeiroNumero + segundoNumero + terceiroNumero) / 3;

        System.out.println("A media aritmetica é " + media);

    }
}
