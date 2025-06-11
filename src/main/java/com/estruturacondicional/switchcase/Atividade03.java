package main.java.com.estruturacondicional.switchcase;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Digite um valor inteiro positivo para X: ");
                int x = scanner.nextInt();

                System.out.print("Digite um valor real para A: ");
                double a = scanner.nextDouble();

                System.out.print("Digite um valor real para B (diferente de A): ");
                double b = scanner.nextDouble();

                if (a == b) {
                    System.out.println("Erro: A e B devem ser distintos.");
                    return;
                }

                System.out.println("Valores lidos:");
                System.out.println("X = " + x);
                System.out.println("A = " + a);
                System.out.println("B = " + b);

                switch (x) {
                    case 1:
                        System.out.println("Soma de A e B: " + (a + b));
                        break;
                    case 2:
                        if (b != 0) {
                            System.out.println("Divisão de A por B: " + (a / b));
                        } else {
                            System.out.println("Erro: Divisão por zero.");
                        }
                        break;
                    case 3:
                        if (a < b) {
                            System.out.println("Valores em ordem crescente: " + a + ", " + b);
                        } else {
                            System.out.println("Valores em ordem crescente: " + b + ", " + a);
                        }
                        break;
                    case 4:
                        System.out.println("Diferença entre o maior e o menor valor: " + Math.abs(a - b));
                        break;
                    case 5:
                        System.out.println("Média aritmética de A e B: " + ((a + b) / 2));
                        break;
                    default:
                        System.out.println("Erro: Valor inválido para X.");
                        break;
                }

                scanner.close();
            }
        }


