package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor para X:");
        int x = scanner.nextInt();
        int y = 0;
        int contador = 1;

        while (contador < 20 ){
            y = y + contador * x;
            contador++;
        }
        System.out.println("O valor de y é: " + y);
    }
}
