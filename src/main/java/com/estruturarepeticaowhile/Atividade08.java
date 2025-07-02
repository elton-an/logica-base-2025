package main.java.com.estruturarepeticaowhile;

import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int quantidadeCidadeMenorQueDez = 0;
        double somaTemperatura = 0;
        int quantidadeCidade = 5;

        while (contador < quantidadeCidade){
            System.out.println("Digite a temperatura: ");
            double temperatura = scanner.nextDouble();
            if (temperatura < 10){
                quantidadeCidadeMenorQueDez++;
            }
            somaTemperatura += temperatura;
            //somaTemperatura = somaTemperatura + temperatura;
            contador++;
        }
        double media = somaTemperatura / quantidadeCidade;
        System.out.println("A média da temperatura é: " + media);
        System.out.println("Quantidade de cidade com temperatura menor que 10: ");
        System.out.println(quantidadeCidadeMenorQueDez);
    }
}
