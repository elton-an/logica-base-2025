package main.java.com.estruturacondicional;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade:");
        int idade = scanner.nextInt();

        if ((idade <= 16)) {
            System.out.println("Não votar");
        } else if ((idade >= 16) && (idade <= 17)) {
            System.out.println("Voto opcional");
        }  else if ((idade >= 18) && (idade<= 60)) {
                System.out.println("Voto obrigatório");
            } else if (idade > 60) {
            System.out.println("Voto opcional");
        }
    }
}
