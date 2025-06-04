package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Z");
        } else if ((numero1 > 0 && numero2 > 0) || (numero1 < 0 && numero2 < 0)) {
            System.out.println("M");
        } else {
            System.out.println("O");

        }



    }
}
