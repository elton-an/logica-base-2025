package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sair = 1;
        int contador = 0;
        int numero = 0;
        int soma = 0;

        while (sair != 0) {
            System.out.println("Digite um número");
            numero = scanner.nextInt();
            soma = soma + numero;
            contador++;
            //contador = contador + 1;
            System.out.println("Digite '0' para sair");
            sair = scanner.nextInt();
        }
        double media = (double) soma / contador;
        System.out.println("A média é: " + media);
       // System.out.println(String.format("A média é: %s" ,media));
    }
}
