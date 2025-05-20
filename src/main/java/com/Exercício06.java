package main.java.com;

import java.util.Scanner;

public class Exercício06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto");
        String nome = scanner.nextLine();
        System.out.println("Digite o preço de compra do produto");
        double precoCompra = scanner.nextDouble();

        System.out.println("Digite o preço de venda do produto");
        double precoVenda = scanner.nextDouble();

        double lucro = precoVenda - precoCompra;
        System.out.println("O lucro obtido na venda do produto " + nome + " é  "+ lucro);


    }
}
