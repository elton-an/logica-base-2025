package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = 0;

        System.out.print("Digite o primeiro número (N1): ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo número (N2): ");
        int n2 = scanner.nextInt();

        System.out.print("Digite o terceiro número (N3): ");
        int n3 = scanner.nextInt();


        if (n1 == n2 || n1 == n3 || n2 == n3) {
            System.out.println("Não é permitido números iguais");
        } else {
            if ((n1 > n2) && (n1 > n3)) {
                maior = n1;
            } else if (n2 > n3) {
                maior = n2;
            } else {
                maior = n3;
            }
            System.out.println("O maoir número é" + maior);



            }
            }

        }

