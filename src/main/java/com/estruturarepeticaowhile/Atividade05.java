package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        double soma = 0;

        while (true) {
            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }
            contador++;
            soma = soma + numero;

        }
        double media = soma / contador;
        System.out.println("A média é: " + media);
    }
}