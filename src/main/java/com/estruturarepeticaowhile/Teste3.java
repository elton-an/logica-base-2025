package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Teste3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade;
        int soma = 0;

        System.out.print("Digite número inteiro");
        quantidade = scanner.nextInt();

        while (soma != quantidade) {
            System.out.print("Digite o número: ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        if (quantidade > 0) {
            double media = (double) soma / quantidade;
            System.out.println("A média dos números é: " + media);
        } else {
            System.out.println("Nenhum número foi inserido.");
        }
    }
}
