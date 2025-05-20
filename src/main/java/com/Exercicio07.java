package main.java.com;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        double divisao;

        if (numero2 != 0) {
            divisao = (double) numero1 / numero2;
        } else {
            System.out.println("Divisão por zero não é permitida.");
            scanner.close();
            return;
        }
        
        System.out.println("Soma: " + soma + ", Subtração: " + subtracao + ", Multiplicação: " + multiplicacao + ", Divisão: " + divisao);

        scanner.close();
    }
}



    }
}
