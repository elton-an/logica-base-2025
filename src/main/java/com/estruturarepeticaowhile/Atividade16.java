package main.java.com.estruturarepeticaowhile;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Atividade16 {
    private static int QUANTIDADE = 5;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        double maiorCompra = 0;
        double somaTodasCompras = 0;

        while (contador < QUANTIDADE) {
            System.out.println("Digite o volar da compra");
            double valorCompra = scanner.nextDouble();
            if (contador == 0){
                maiorCompra = valorCompra;
            }
            if (valorCompra > maiorCompra){
                maiorCompra = valorCompra;
            }
            somaTodasCompras = somaTodasCompras + valorCompra;
            contador++;
        }
        System.out.println("Maior compra: " + maiorCompra);
        double media = somaTodasCompras/QUANTIDADE;
        System.out.println("Média das compras: " + media);
    }
}
