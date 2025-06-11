package main.java.com.estruturacondicional.switchcase;

import java.util.Scanner;

public class Ativedade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número N1");
        int numeroN1 = scanner.nextInt();
        System.out.println("Digite o segundo número N2");
        int numeroN2 = scanner.nextInt();


        System.out.println("Digite a operação:");
        String opcao = scanner.next();

        switch (opcao) {
            case "A" :
                System.out.println("Soma:" + (numeroN1 + numeroN2));
                break;
            case "S" :
                System.out.println("Subtração" + (numeroN1 - numeroN2));
                break;
            case "M" :System.out.println("Multiplicação" + (numeroN1 * numeroN2));
                break;
            case "D" :System.out.println("Divisão" + (numeroN1 / numeroN2));



        }

    }
}
