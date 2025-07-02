package main.java.com.estruturacondicional.switchcase;

import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1 :
                System.out.println("O livro pertence a categoria de ficção");
                break;
            case 2 :
                System.out.println("O livro pertence a categoria de não ficção");
                break;
            case 3 :
                System.out.println("O livro pertence a categoria de romance");
                break;
            case 4 :
                System.out.println("O livro pertence a categoria de terror");
                break;
            case 5 :
                System.out.println("O livro pertence a categoria de mistério");
                break;
            default:
                System.out.println("Categoria inválida");
                break;


        }
    }
}
