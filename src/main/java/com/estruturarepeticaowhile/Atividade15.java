package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int menor = 0;
        int maior = 0;

        while (contador < 10) {
            System.out.println("Digite um número:");
            int numero = scanner.nextInt();
            if (contador == 0){
                menor = numero;
                maior = numero;
            }
            if (numero < menor){
                menor = numero;
            }
            if (numero > maior){
                maior = numero;
            }
            contador++;
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
