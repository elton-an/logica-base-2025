package main.java.com;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de sua base");
        double valorBase = scanner.nextDouble();

        System.out.println("Digite o valor da altura");
        double valorAltura = scanner.nextDouble();
        double valorArea = (valorAltura * valorBase) / 2;

        System.out.println("O valor da área é" + valorArea);



    }
}
