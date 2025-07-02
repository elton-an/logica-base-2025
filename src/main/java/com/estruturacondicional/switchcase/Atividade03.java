package main.java.com.estruturacondicional.switchcase;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor para X: ");
        int x = scanner.nextInt();

        System.out.print("Digite um valor para A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite um valor de A): ");
        double b = scanner.nextDouble();

        switch (x) {
            case 1:
                System.out.println("Soma de A e B: " + (a + b));
                break;
            case 2:
                System.out.println("Divisão de A por B: " + (a / b));
                break;
            case 3:
                if (a > b) {
                    System.out.println("Valores em ordem crescente: " + b + ", " + a);
                } else {
                    System.out.println("Valores em ordem crescente: " + a + ", " + b);
                }
                break;
            case 4:
                if (a < b) {
                    System.out.println("Diferença é : " + (a - b));
                } else {
                    System.out.println("A diferença é : " + (b - a));
                }
                break;
            case 5:
                System.out.println("Média de A e B: " + ((a + b) / 2));
                break;
            default:
                System.out.println("Número inválido !!");
                break;
        }
    }
}


